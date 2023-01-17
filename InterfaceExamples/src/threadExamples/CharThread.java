package threadExamples;

public class CharThread extends Thread{
	
	public void run(){
		try{
			for(int i=65; i<=90; i++){
				System.out.println((char)i);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
