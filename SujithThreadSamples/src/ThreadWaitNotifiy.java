class SumofThreadExamplesWait extends Thread {

	public int sum = 0;

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				sum += i;
			}
			System.out.println("Output is ready.....");
			this.notify();
			System.out.println("So many Number of lines needs to execute...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
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
