package threadExamples;

public class CalculateDiscount extends Thread {
	
	float price;
	float per;
	float res;
	CalculateDiscount(float price, float per){
		this.price = price;
		this.per = per;
	}
	
	public void run(){
		try{
			res = per * price / 100;
			Thread.sleep(1000);
			System.out.println("Discount "+res);
		}catch(Exception e){
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
