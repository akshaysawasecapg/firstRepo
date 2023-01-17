package arrayListEx;
import java.util.*;


public class SetExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set newSet = new HashSet();
		
		if(newSet.isEmpty()){
			System.out.println("Set is empty");
		}
		
		newSet.add(30);
		newSet.add(88);
		newSet.add(900);
		newSet.add(11);
		newSet.add(88);
		System.out.println(newSet);
		
		for(Object o : newSet){
			System.out.println(o);
		}
		
		System.out.println("Size of This hashset : "+newSet.size());
		
		// converting set to array
		Object[] objarr = newSet.toArray();
		System.out.println("element at 2 position "+objarr[2]);
		
		
		if(newSet.contains(11)){
			System.out.println("11 exists");
		}else{
			System.out.println("Not exists");
		}
		
		newSet.clear();
		if(newSet.isEmpty()){
			System.out.println("EMMPPTYY");
		}
		System.out.println(newSet);
		
	}

}
