package interfaceexamples;

public class Chair extends Furniture{

	public void setStructure(){
		System.out.println("Setting Structure in Furniture Class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chair newChair = new Chair();
		
		newChair.setStructure();
	}

}
