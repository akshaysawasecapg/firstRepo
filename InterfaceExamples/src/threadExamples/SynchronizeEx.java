package threadExamples;

public class SynchronizeEx implements Runnable{

	String name;
	String address;
	SynchronizeEx(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	public void run(){
		
		synchronized (this) {
			System.out.println(this.name);
			System.out.println(this.address);
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SynchronizeEx s = new SynchronizeEx("Erric", "baker street");
		Thread t1 = new Thread(s);
		t1.start();

	}

}
