
class SynThread1 extends Thread {

	public String soap = "HandWashing";

	public void run() {

		synchronized (soap) {
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println(i + " -> Washing Hand....by :" + Thread.currentThread().getName());
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i + " -> Hand Washed completed by :" + Thread.currentThread().getName());
			}
		}

	}

}

public class JavaSynExample {

	public static void main(String[] args) {

		SynThread1 s1 = new SynThread1();
		SynThread1 s2 = new SynThread1();
		s1.start();
		s2.start();
	}

}
