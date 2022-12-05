class SumofThreadExamplesWait extends Thread {

	public int sum = 0;

	public void run() {

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Output is ready.....");
		System.out.println("So many Number of lines needs to execute...");
		synchronized (this) {
			this.notify();
		}
		System.out.println("Lines are executed now...");

	}

}

public class ThreadWaitNotifiy {

	public static void main(String[] args) {

		SumofThreadExamplesWait obj = new SumofThreadExamplesWait();
		obj.start();
		try {
			synchronized (obj) {
				obj.wait();
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum of numbers : " + obj.sum);

	}

}
