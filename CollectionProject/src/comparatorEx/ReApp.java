package comparatorEx;
import java.util.*;

public class ReApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Revenue> t = new TreeSet(new SortByAmount());
		t.add(new Revenue("Ford", 50000));
		
		t.add(new Revenue("BMW", 12000));
		t.add(new Revenue("Ferrari", 1110000));

		System.out.println(t);
		
	}

}
