package mapReduceDistinctEx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadExample t1 = new ThreadExample();
		ExecutorService pool = Executors.newFixedThreadPool(3); 

		for(int i=0; i<10; i++){
			pool.execute(t1);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<=20; i++){
			if(i%2==0){
				System.out.println(i);
			}
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
	}

}
