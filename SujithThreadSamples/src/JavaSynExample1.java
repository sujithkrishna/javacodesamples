class Reservation extends Thread {

	public int ticketStatus = 0;

	public void run() {
		Reservation t1 = new Reservation();
		t1.bookTicket();
		System.out.println(t1.availablityCheck());
		Reservation t2 = new Reservation();
		t2.bookTicket();
		t2.cancelTicket();
		t2.bookTicket();
		t2.cancelTicket();
		t2.bookTicket();
		System.out.println(t2.availablityCheck());
	}

	public int availablityCheck() {
		return ticketStatus;
	}

	public synchronized void bookTicket() {
		System.out.println("Booking TIcket..............." + " " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ticketStatus++;
		System.out.println(" TIcket Booked..............." + " " + Thread.currentThread().getName());
	}

	public synchronized void cancelTicket() {
		System.out.println("Cancelling TIcket.........." + " " + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ticketStatus--;
		System.out.println(" TIcket Canclled..............." + " " + Thread.currentThread().getName());
	}
}

public class JavaSynExample1 {

	public static void main(String[] args) {
		Reservation obj = new Reservation();
		obj.start();

	}

}
