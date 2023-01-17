package threadExamples;

public class CallingThreadApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoThreads t = new TwoThreads();
		t.start();
		CalculateDiscount c = new CalculateDiscount(1000, 10);
		c.start();

	}

}
