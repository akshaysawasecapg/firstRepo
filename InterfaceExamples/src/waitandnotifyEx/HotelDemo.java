package waitandnotifyEx;

class Waiter {

	String token;
	Waiter(String token){
		this.token = token;
	}
}

class TokenWait implements Runnable{
	Waiter waiter;
	
	public TokenWait(Waiter waiter){
		this.waiter = waiter;
	}
	
	public void run(){
		synchronized (waiter) {
			System.out.println("Waiter is assigned for "+waiter.token);
			try{
				waiter.wait(2000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class TokenNotify implements Runnable{
	Waiter waiter;
	public TokenNotify(Waiter waiter){
		this.waiter = waiter;
	}
	
	public void run(){
		synchronized (waiter) {
			try{
				waiter.notify();
				System.out.println("Waiter is notified !");
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class HotelDemo {
	public static void main(String args[]){
		Waiter waiter = new Waiter("Order no 90");
		TokenWait tw = new TokenWait(waiter);
		TokenNotify tf = new TokenNotify(waiter);
		
		Thread t1 = new Thread(tw);
		Thread t2 = new Thread(tf);
		
		t1.start();
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			System.out.println(e);
		}
		t2.start();
		
	}
}


