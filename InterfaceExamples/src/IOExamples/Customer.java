package IOExamples;

import java.io.Serializable;

public class Customer implements Serializable{

	String customerName;
	String address;
	
	Customer(String customerName, String address){
		this.customerName = customerName;
		this.address = address;
	}
	
	public void showDetails(){
		System.out.println("Customer Name : "+customerName);
		System.out.println("Address : "+address);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
