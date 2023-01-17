package lambdaEx;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Coffee");
		str.add("Tea");
		str.add("Espresso");
		str.add("Black Coffee");
		str.add("Regular Coffee");
		
		Consumer<String> cs = (p)->System.out.println("Length of "+p+" is "+p.length());
		
		for(String s : str){
			cs.accept(s);
		}
		
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(100);
		temp.add(104);
		temp.add(98);
		temp.add(97);
		temp.add(99);
		temp.add(96);
		temp.add(99);

		Consumer<Integer> ci = (t)->{
			if(t >= 100){
				System.out.println("Temp is above 100");
			}else{
				System.out.println("Temp is normal");
			}
		};
		
		for(Integer i : temp){
			ci.accept(i);
		}
		
	}

}
