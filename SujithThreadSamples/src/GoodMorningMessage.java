
class WriteMessae {

	public static synchronized void displayMessage(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello Good Mornming..." + name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThreadWrite extends Thread {

	private WriteMessae writeMessage;
	private String name;

	public MyThreadWrite(WriteMessae writeMessage, String name) {
		super();
		this.writeMessage = writeMessage;
		this.name = name;
	}

	public void run() {
		writeMessage.displayMessage(name);
	}

}

public class GoodMorningMessage {

	public static void main(String[] args) {
		WriteMessae write1 = new WriteMessae();
		WriteMessae write2 = new WriteMessae();
		MyThreadWrite hello1 = new MyThreadWrite(write1, "Sujith");
		MyThreadWrite hello2 = new MyThreadWrite(write2, "Krishna");
		hello1.start();

		hello2.start();
	}

}
