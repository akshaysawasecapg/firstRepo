package comparatorEx;

import java.util.Comparator;

public class SortByaName implements Comparator<Revenue> {

	
	public int compare(Revenue r1, Revenue r2){
		return r1.revenueName.compareTo(r2.revenueName);
	}
}
