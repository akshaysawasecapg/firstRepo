package lambdaEx;

public class Student {
	String studName;
	int marks;

	public Student(String studName, int marks) {
		// TODO Auto-generated constructor stub
		this.studName = studName;
		this.marks = marks;
	}
	
	public String toString(){
		return "Student Name : "+studName+" Marks : "+marks;
	}

}
