package threadExamples;

public class NumberThread extends Thread{
	public void run(){
		try{
			for(int i=0; i<=30; i++){
				System.out.println(i);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
