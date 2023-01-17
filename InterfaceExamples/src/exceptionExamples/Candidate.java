package exceptionExamples;

public class Candidate {

	public int checkMarks(int marks)throws Exception{
		if(marks < 30){
			throw new Exception("Marks invalid");
		}
		return marks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c = new Candidate();
		try{
			c.checkMarks(23);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
