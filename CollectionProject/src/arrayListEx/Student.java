package arrayListEx;

public class Student implements Comparable<Student> {

	String studentName;
	float marks;
	public Student(String studentName, float marks) {
		// TODO Auto-generated constructor stub
		this.studentName = studentName;
		this.marks = marks;
	}
	public int compareTo(Student s){
		if(marks < s.marks){
			return -1;
		}else{
			return 1;
		}
	}
	
	public String toString(){
		return "Student Name: "+studentName+" Marks : "+marks; 
	}

}
