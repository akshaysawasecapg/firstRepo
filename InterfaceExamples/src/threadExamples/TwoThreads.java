package threadExamples;

public class TwoThreads extends Thread{
		
	public void run(){
		try{
			String name ="jason";
			Thread.sleep(1000);
			System.out.println("Name of Customer : "+name);
			
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
