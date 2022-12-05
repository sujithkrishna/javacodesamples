
class VenueFixing extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Venue is getting fixing..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println("Venue is  fixed..");
	}
}

class WeddingCardPrinting extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Wedding Card Printing is going on ..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println("Wedding Card Printing is  completed..");
	}
}

class WeddingCardDistribution extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("WeddingCardDistribution is going on..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println("WeddingCardDistribution is  completed..");
	}
}

public class ThreadJoinSample {

	public static void main(String[] args) throws InterruptedException {

		VenueFixing venue = new VenueFixing();
		WeddingCardPrinting weddingCardPrinting = new WeddingCardPrinting();
		WeddingCardDistribution weddingCardDistribution = new WeddingCardDistribution();
		
		venue.start();
		venue.join();
		weddingCardPrinting.start();
		weddingCardPrinting.join();
		weddingCardDistribution.start();
		weddingCardDistribution.join();
		
		
	}

}
