package lambdaEx;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StudentFilterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> studList = new ArrayList<Student>();
		studList.add(new Student("Peter", 70));
		studList.add(new Student("Parker", 30));
		studList.add(new Student("Harry", 90));
		studList.add(new Student("Potter", 35));
		studList.add(new Student("Spider", 55));
		studList.add(new Student("Man", 95));
		
		Stream<Student> studStream = studList.stream();
		
		Comparator<Student> marksComp = (a,b)->{
			if(a.marks == b.marks){
				return 0;
			}else{
				if(a.marks > b.marks){
					return 1;
				}else{
					return -1;
				}
			}
			
		};
		
		Predicate<Student> studPr = (a)-> a.marks > 50;
		
		studStream.sorted(marksComp).filter(studPr).forEach(System.out::println);

	}

}
