package threadExamples;

public class SimpleInterest extends Thread{

	public void calculate(){
		float SI  = (5001*11*1)/100;
		System.out.println(SI);
	}
	
	public void run(){
		calculate();
	}
}
