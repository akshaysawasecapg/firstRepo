package exceptionExamples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {
	
	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public void sub(int a, int b){
		System.out.println(a-b);
	}
	
	public void div(int a, int b){
		System.out.println(a/b);
	}
	
	public void mul(int a, int b){
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{
			Scanner in = new Scanner(System.in);
			int a = in.nextInt();
			int b = in.nextInt();
			Calculate no = new Calculate();
			no.add(a, b);
			no.sub(a, b);
			no.div(a, b);
			no.mul(a, b);
		}catch(InputMismatchException e){
			System.out.println("Please enter Integer : ");
		}
		
	
		
	}

}
