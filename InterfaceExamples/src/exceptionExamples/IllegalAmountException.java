package exceptionExamples;

public class IllegalAmountException extends Exception{
	
	String message;
	IllegalAmountException(String msg){
		super(msg);
		message = msg;
	}
	
	public void showError(){
		System.out.println(message);
	}
	
}
