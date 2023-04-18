/* 

13.- Implement a class Product. A product has a name and a price, for example new Product("Toaster", 29.95). Supply methods getName, getPrice, and reducePrice. Supply a program ProductPrinter that makes two products, prints each name and price, reduces their prices by $5.00, and then prints the prices again.

*/

class Product {
	
	private String nameProduct;
	private double priceProduct;
	
	public Product(String name, double price) {
		nameProduct = name;
		priceProduct = price;
	}
	
	public double getPrice() {
		return priceProduct;
	}
	
	public String getName() {
		return nameProduct;
	}
	
	public void reducePrice(double reduceByAmount) {
		priceProduct -= reduceByAmount;
	}
	
}


public class ProductPriceTester {
	
	public static void main(String[] args){
		
		Product soda = new Product("Nuka Cola", 20.20);
		Product crisp = new Product("Crisp Brand", 18.73);
		System.out.println("Price of " + soda.getName() + ": " + soda.getPrice());
		System.out.println("Price of " + crisp.getName() + ": " + crisp.getPrice());
		soda.reducePrice(5);
		crisp.reducePrice(5);
		System.out.println("Price of " + soda.getName() + ": " + soda.getPrice());
		System.out.println("Price of " + crisp.getName() + ": " + crisp.getPrice());
		
		System.exit(0);
	}

}
