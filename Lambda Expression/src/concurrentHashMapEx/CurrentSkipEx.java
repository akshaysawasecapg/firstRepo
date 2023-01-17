package concurrentHashMapEx;

import java.util.concurrent.ConcurrentSkipListMap;

public class CurrentSkipEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentSkipListMap<Character, String> list = new ConcurrentSkipListMap<>();

		list.put('P', "Petunia");
		list.put('C', "Cosmos");
		list.put('M', "Marigold");
		list.put('Z', "Zinnia");
		list.put('L', "Larksupr");
		list.put('A', "Austria");
		list.put('B', "Baroda");
		
		System.out.println(list);
		
		System.out.println(list.firstEntry());
		System.out.println(list.floorEntry('M'));
		System.out.println(list.ceilingEntry('P'));
		
	}

}
