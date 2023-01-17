package blockingQueueEx;

import java.util.concurrent.CopyOnWriteArrayList;

public class TicketWrite implements Runnable{

	CopyOnWriteArrayList<Ticket> cow;

	public TicketWrite(CopyOnWriteArrayList<Ticket> cow) {

		this.cow = cow;
	}

	public void run() {
		for(int i=0; i<3; i++){
			cow.add(new Ticket("UK","Dubai",400));
			cow.add(new Ticket("UK","Paris",350));
			cow.add(new Ticket("UK","India",900));
			try{
//				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
