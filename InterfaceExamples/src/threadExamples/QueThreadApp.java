package threadExamples;

public class QueThreadApp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		NumberThread n = new NumberThread();
//		n.start();
		CharThread c1 = new CharThread();
		CharThread c2 = new CharThread();
		c1.setName("first");
        c2.setName("second");

        c1.setPriority(Thread.NORM_PRIORITY+2);
        c2.setPriority(Thread.NORM_PRIORITY+3);
        c1.start();
        c2.start();
        
        
		
		
	}

}
