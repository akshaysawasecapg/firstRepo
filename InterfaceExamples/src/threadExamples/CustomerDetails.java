package threadExamples;

public class CustomerDetails extends Thread{
	
	public void getDetails(String name, String address){
		System.out.println("Customer Name "+name);
		System.out.println("Customer Address "+address);
	}

	public void run(){
		getDetails("Jason", "UK");
	}
	
}
