package arrayListEx;
import java.util.*;

public class MapInterfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new HashMap<Integer, String>();
		
		map.put(1, "UK");
		map.put(2, "UAE");
		map.put(3, "USA");
		map.put(4, "Germany");
		
		System.out.println(map);
		System.out.println(map.get(2));
		
		Set keys = map.keySet();
		System.out.println("Keys : ");
		for(Object key : keys){
			System.out.println(key);
		}
		
		System.out.println("Entries ");
		Set entries = map.entrySet();
		
		for(Object entry : entries){
			System.out.println(entry);
		}
		
//		for(<Integer, String> s : map){
//			System.out.println(s);
//		}
		
	}

}
