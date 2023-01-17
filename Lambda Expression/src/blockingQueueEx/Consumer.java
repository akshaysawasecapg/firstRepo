package blockingQueueEx;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	BlockingQueue<Integer> queue;
	
	public Consumer(BlockingQueue<Integer> queue) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
	}
	
	public void run(){
		try{
			while(true){
				Integer t = queue.take();
				System.out.println("Consumer Consumes : "+t);
				Thread.sleep(3000);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
