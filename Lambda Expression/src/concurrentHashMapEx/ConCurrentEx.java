package concurrentHashMapEx;

import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentHashMap<String, String> ch = new ConcurrentHashMap<String, String>();
		
		ch.put("E001","Peter");
		ch.put("E002","Erric");
		ch.put("E003","Potter");
		ch.put("E004","Harry");
		ch.put("E005","Parker");
		
		String res = ch.searchEntries(2, (k)->{
			String key = k.getKey();
			if(key.equals("E005")){
				return k.getValue();
			}else{
				return null;
			}
		});
		System.out.println(res);
		
		ch.forEach(1, (k,v)->System.out.println("Key : "+k+" Value : "+v));
		
		System.out.println(ch.reduce(2, (k,v)->"Employee Key : "+k+" Employee Name : "+v, (a,b)->a+" , "+b));
		
	}

}
