package interfaceexamples;

public interface Account {
	public void setCustomerDetails();
	static void displayStatic(){
		System.out.println("All Accounts have interest rate at 4%");
	}
}
