class ChildClass1 extends Thread {

	public static Thread mainThread;

	public void run() {
		try {
			mainThread.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
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

public class MainThreadWaiting {

	public static void main(String[] args) {

		ChildClass1.mainThread = Thread.currentThread();

		ChildClass1 cThread = new ChildClass1();
		cThread.start();

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
