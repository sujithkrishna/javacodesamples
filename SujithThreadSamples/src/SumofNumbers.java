
class SumofNoThread extends Thread{
	
	public int sum=0;
	
	public void run() {
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("Output is ready.....");
		System.out.println("SO many Number of lines needs to execute...");
		try {
			Thread.sleep(1000);
			System.out.println("Lines are executed now...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class SumofNumbers {

	public static void main(String[] args) {

		SumofNoThread obj = new SumofNoThread();
		obj.start();
		try {
			obj.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sum is "+obj.sum);
		
	}

}
