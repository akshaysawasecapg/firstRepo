package mapReduceDistinctEx;

public class Product {
	String itemName;
	float price;
	float quantity;

	public Product(String itemName, float price, float quantity) {
		// TODO Auto-generated constructor stub
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString(){
		return "Product Name : "+itemName+" Price : "+price+" Quantity : "+quantity;
	}
}


