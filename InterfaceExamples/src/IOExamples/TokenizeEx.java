package IOExamples;

import java.util.Scanner;

public class TokenizeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner("Peter told harry, what harry has told to sam that sam has heard from Peter");
		 
		 scan.useDelimiter("Peter");
//		 scan.tokens();
		 System.out.println(scan.toString());
		 
	}

}
