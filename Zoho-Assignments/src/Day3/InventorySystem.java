

/*   5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.

*/
package Day3;

import java.util.ArrayList;

public class InventorySystem {

	public static void main(String[] args) {
		Store store1=new Store();
		store1.setStoreDetails("Inimai", "Tenkasi");
		Product product1=new Product(1,"Chocolates",5,10000);
		Product product2=new Product(2,"Biscuits",10,2800);
		Product product3=new Product(3,"PackedChips",20,5000);
		Product product4=new Product(4,"Sampoo",2,130);
		store1.addProduct(product1);
		store1.addProduct(product2);
		store1.addProduct(product3);
		store1.addProduct(product4);
		store1.displayAllProducts();
	}

}

class Store {
	static String storeName;
	static String storeLocation;
	ArrayList<Product> products=new ArrayList<>();
	void setStoreDetails(String name, String location){
		this.storeName=name;
		this.storeLocation=location;
	}
	void displayStoreDetails() {
		System.out.println("Store Name is "+this.storeName);
		System.out.println("Store Location is "+this.storeLocation);
	}
	void addProduct(Product product){
		this.products.add(product);
	}
	void displayAllProducts(){
		for(Product product:products) product.displayProduct();
	}
}

class Product {
	private int product_Id;
	private String name;
	private double price;
	private long quantity;
	Product(int product_Id,String name,double price,long quantity){
		this.product_Id=product_Id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	void displayProduct() {
		System.out.println("Product ID is "+this.product_Id);
		System.out.println("Product Name is "+this.name);
		System.out.println("Price of "+this.name+" is "+this.price);
		System.out.println("Quantity Of "+this.name+"is "+this.quantity);
	}
}
