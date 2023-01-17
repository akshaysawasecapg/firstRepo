package comparatorEx;

import java.util.Comparator;

public class SortByAmount implements Comparator<Revenue> {

	public int compare(Revenue r1, Revenue r2){
		if(r1.amount == r2.amount){
			return 0;
		}else{
			if(r1.amount < r2.amount){
				return -1;
			}else{
				return 1;
			}
		}
	}
}
