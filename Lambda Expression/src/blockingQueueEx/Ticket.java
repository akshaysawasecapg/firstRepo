package blockingQueueEx;

import java.util.concurrent.CopyOnWriteArrayList;

public class Ticket  {

	String source;
	String destination;
	float price;
//	CopyOnWriteArrayList<Ticket> cow;
	
	public Ticket(String source, String destination, float price) {
		// TODO Auto-generated constructor stub
		this.source = source;
		this.destination = destination;
		this.price = price;
//		this.cow = cow;
	}
	
//	public void run(){
//		for(int i=0; i<2; i++){
//			
//			try{
//			
////				Thread.sleep(2000);
//			}catch(Exception e){
//				System.out.println(e);
//			}
//		}
//	}
	
	public String toString(){
		return "Source : "+source+" Destination : "+destination+" Price : "+price;
	}

}
