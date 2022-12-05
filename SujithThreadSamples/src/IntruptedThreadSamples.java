
class SubThread extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I'm sub thread");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("I got Interrupted Exception...");
		}
	}
}

public class IntruptedThreadSamples {

	public static void main(String[] args) {
		System.out.println("Main Thread started");
		SubThread obj = new SubThread();
		obj.start();

		obj.interrupt();
		System.out.println("Main Thread completed...");
	}

}
