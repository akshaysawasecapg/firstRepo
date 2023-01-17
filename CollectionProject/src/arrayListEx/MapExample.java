package arrayListEx;
import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new HashMap();
		map.put("E001", "Peter");
		map.put("E002", "Simond");
		map.put("E003", "Edgar");
		map.put("E004", "Mathew");
		map.put("E005", "Erric");
		

		System.out.println(map.get("E003"));
		
		Set keys = map.keySet();
		
		System.out.println("KEYS");
		for(Object o : keys){
			System.out.println(o+" "+map.get(o));
		}
		
		System.out.println();
		
		Set entries = map.entrySet();
		for(Object o : entries){
			System.out.println(o);
		}
		
	}

}