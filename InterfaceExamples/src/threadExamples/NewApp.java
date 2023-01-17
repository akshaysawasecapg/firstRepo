package threadExamples;

public class NewApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDetails c = new CustomerDetails();
		SimpleInterest s = new SimpleInterest();
		c.start();
		s.start();

	}

}
