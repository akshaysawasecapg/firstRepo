package lambdaEx;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> pr = (fi)->{
			String[] newStr = fi.split("-");
			if(newStr[0].equals("admin") && newStr[1].equals("password123")){
				return true;
			}else{
				return false;
			}
		};
		
		ArrayList<String> userPass = new ArrayList<String>();
		userPass.add("sam-pass123");
		userPass.add("Peter-password123");
		userPass.add("admin-password123");
		userPass.add("admin-password123");
		
		for(String s : userPass){
			if(pr.test(s)){
				System.out.println(s);
			}else{
				System.out.println("NOT FOUND !");
			}
		}
		
	}

}
