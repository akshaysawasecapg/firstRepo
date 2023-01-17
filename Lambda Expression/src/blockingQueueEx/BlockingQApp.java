package blockingQueueEx;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlockingQueue<Integer> bq = new LinkedBlockingQueue<Integer>(10);
		Producer p1 = new Producer(bq);
		Consumer c1 = new Consumer(bq);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(c1);
		
		t1.start();
		t2.start();

	}

}
