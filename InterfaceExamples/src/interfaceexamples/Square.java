package interfaceexamples;

public class Square implements Shape {

	public void setShape(){
		System.out.println("Setting Shape of Square class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s = new Square();
		s.setDetails();
		s.setShape();
		s.setDetails();
	}

}
