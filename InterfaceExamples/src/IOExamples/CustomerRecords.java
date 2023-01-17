package IOExamples;
import java.io.*;

public class CustomerRecords {

	
	public void saveToFile(Customer obj){
		
		try{
			FileOutputStream fout = new FileOutputStream("C://Users//ASAWASE//Downloads//objSeri.txt");
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(obj);
			objout.flush();
		}catch(IOException e){
			System.out.println(e);
		}
	}
	
	public void readFromFile(){
		try{
			FileInputStream fin = new FileInputStream("C://Users//ASAWASE//Downloads//objSeri.txt");
			ObjectInputStream objin = new ObjectInputStream(fin);
			
			Customer cust = (Customer)objin.readObject();
			cust.showDetails();
			
		}catch(IOException e){
			System.out.println(e);
		}catch(ClassNotFoundException e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer("Jacob", "32 Baker Street");
		CustomerRecords cr = new CustomerRecords();
		cr.saveToFile(customer);
		System.out.println("Saved !");
		cr.readFromFile();

	}

}
