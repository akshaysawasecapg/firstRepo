package threadExamples;

public class PrintSeriesOfNo extends Thread {

	public void run(){
		try{
			
			for(int i=1; i<20; i++){
				Thread.sleep(3000);
				System.out.println(i);
			}
			
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintSeriesOfNo pr = new PrintSeriesOfNo();
		Thread t1 = new Thread(pr);
		t1.start();

	}

}
