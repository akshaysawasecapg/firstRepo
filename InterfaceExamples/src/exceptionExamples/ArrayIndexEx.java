package exceptionExamples;

public class ArrayIndexEx {

	public void addNo(int size)throws Exception{
		
		if(size < 0){
			throw new Exception("Size is not accpeted!");
		}
		try{
			int [] a = {12,34,11,19,45,33,17,45};
			for(int i=0; i<size; i++){
				System.out.println(a[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please pass size less than 8");
		}
	}	

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		ArrayIndexEx a = new ArrayIndexEx();
		try{
			a.addNo(-11);
		}catch(Exception e){
			
			System.out.println(e);
		}
		
	}
}
