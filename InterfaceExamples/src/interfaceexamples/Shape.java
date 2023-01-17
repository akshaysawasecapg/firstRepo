package interfaceexamples;

public interface Shape {
	void setShape();
	
	default void setDetails(){
		System.out.println("THis is from interface shape");
	}
}
