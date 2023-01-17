package lambdaEx;
import java.util.*;
import java.util.function.Predicate;

public class SimpleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = new ArrayList<Integer>();
		
		arr.add(12);
		arr.add(11);
		arr.add(19);
		arr.add(23);
		arr.add(45);
		arr.add(56);
		arr.add(78);
		arr.add(89);

		System.out.println(arr.stream().anyMatch(an-> an > 100));
		System.out.println(arr.stream().max((a,b)->a.compareTo(b)).get());
		System.out.println(arr.stream().min((a,b)->a.compareTo(b)).get());
		
	}

}
