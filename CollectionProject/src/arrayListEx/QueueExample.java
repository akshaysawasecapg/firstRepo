package arrayListEx;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> que = new ArrayDeque<Integer>();
		
		que.add(20);
		que.add(90);
		que.add(120);
		que.add(11);
		que.add(100);
		
		System.out.println(que);
		System.out.println(que.remove());
		System.out.println(que);
		
		System.out.println(que.peek());
		
		for(Object o : que){
			System.out.println(o);
		}
		
		for(Integer i : que){
			System.out.println(i+100);
		}
		
	}

}