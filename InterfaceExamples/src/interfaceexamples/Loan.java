package interfaceexamples;

public interface Loan {
	public void setLoanDetails();
	
	default void printDefaultMethod(){
		System.out.println("Loan is available at 5 %");
	}
}
