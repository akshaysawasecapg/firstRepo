package mapReduceDistinctEx;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> pl = new ArrayList<>();
		
		pl.add(new Product("Google",888000,4));
		pl.add(new Product("BMW",40000,2));
		pl.add(new Product("Ferrari",90000,2));
		pl.add(new Product("HP",10000,2));
		pl.add(new Product("Dell",45000,2));
		pl.add(new Product("Lenovo",22000,2));
		pl.add(new Product("Porsche",88800,2));
		pl.add(new Product("Realme",9000,9));
		pl.add(new Product("Apple",1000000,5));
		pl.add(new Product("Redmi",4000,5));
		pl.add(new Product("Sony",8000,7));
		
		
		
		Stream<Product> productStream = pl.stream();
		
		// 1
//		productStream.sorted((a,b)->a.itemName.compareTo(b.itemName)).forEach(System.out::println);
		
		// 2
//		productStream.filter((a)->a.quantity < 5).forEach(System.out::println);
		
		// 3
		productStream.map((a)->a.price*20/100).forEach(System.out::println);
		
		// 4
//		List<Product> proList = productStream.collect(Collectors.toList());
//		
//		for(Product p : proList){
//			System.out.println(p);
//		}

	}

}
