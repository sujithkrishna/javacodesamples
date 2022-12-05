class ChildClass extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Class");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ChildThreadWaiting {

	public static void main(String[] args) throws InterruptedException {

		ChildClass cThread = new ChildClass();
		cThread.start();

		// Main thread is waiting for child class to complete...
		cThread.join();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Class");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
