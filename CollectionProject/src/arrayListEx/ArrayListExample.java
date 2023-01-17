package arrayListEx;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strList = new ArrayList<String>();
		
		strList.add("Tea");
		strList.add("Coffee");
		strList.add("Black Coffee");
		strList.add("Espresso");
		strList.add("Regular Coffee");
		
		System.out.println("Third Element From List is : "+strList.get(3));
		
		Set<String> newSet = new HashSet<String>();
		newSet.add("Toy Car");
		newSet.add("Teddy Bear");
		newSet.add("Toy Bus");
		newSet.add("Guitar");
		newSet.add("Color Crayons");
		newSet.add("Candies");
		
		// add duplicate 
		newSet.add("Toy Bus");
	
		// remove element guitar from set
		newSet.remove("Guitar");
		
		//contains teddy bear
		if(newSet.contains("Teddy Bear")){
			System.out.println("Present !");
		}else{
			System.out.println("Teddy bear not exists");
		}
		
		Queue<String> q = new ArrayDeque<String>();
		
		q.add("Cup Cake");
		q.add("Coffee");
		q.add("Cookies");
		q.add("Candy");
		q.add("Pizza");
		
		System.out.println("First Element "+q.peek());
		System.out.println("Removed "+q.remove());
		
		for(String s : q){
			System.out.println(s);
		}
	}

}
