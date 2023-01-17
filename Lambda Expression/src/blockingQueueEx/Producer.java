package blockingQueueEx;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

	BlockingQueue<Integer> queue;
	
	public Producer(BlockingQueue<Integer> queue) {
		// TODO Auto-generated constructor stub
		this.queue = queue;
	}
	
	public void run(){
		for(int i=0; i<20; i++){
			System.out.println("Producer Adding value "+i);
			try{
				queue.put(i);
				System.out.println("Q Capacity Remaining - "+queue.remainingCapacity());
				Thread.sleep(3000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
