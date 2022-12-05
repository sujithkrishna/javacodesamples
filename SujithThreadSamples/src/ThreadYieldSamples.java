class SampleThread extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
			Thread.yield();
		}
	}
}

public class ThreadYieldSamples {

	public static void main(String[] args) {

		SampleThread samThread = new SampleThread();
		samThread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("its Main Thread");
		}

	}

}
