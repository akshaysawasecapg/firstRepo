package interfaceexamples;

public class BankAccount implements Account, Loan {
	
	public void setCustomerDetails(){
		System.out.println("Setting Customer Details...");
	}
	
	public void setLoanDetails(){
		System.out.println("Setting Loan Details in BankAccount class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new BankAccount();
		a.setCustomerDetails();
		
		Loan loan = new BankAccount();
		loan.setLoanDetails();
		
		Account.displayStatic();
	}

}
