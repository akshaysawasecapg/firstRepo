package exceptionExamples;

public class SimpleInterest {

	public void calculate(float principal, float rate, float time) throws IllegalAmountException{
		if(principal <= 0  || rate <=0 || time <=0 ){
			throw new IllegalAmountException("Please provide values greater than 0");
		}else if (principal < 1000){
			throw new IllegalAmountException("Principal must be greater than 1000");
		}
		System.out.println(principal * rate * time/100);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleInterest si = new SimpleInterest();
		try{
			si.calculate(12, 12, 23);
		}catch(IllegalAmountException e){
			e.showError();
			System.out.println(e);
		}
	}

}
