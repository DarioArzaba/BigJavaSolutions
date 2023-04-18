/* 

6.- Use the variables declared in the previews question to display the total purchase price.

*/

public class TotalPrice {
		
	public static void main(String[] args){
		
		double unitPrice = 0.86;
		int quantity = 4;
		
		System.out.println("Apples Price : $" + unitPrice);
		System.out.println("Units : " + quantity);
		System.out.println("Total Price : $" + (unitPrice*quantity));
		
		System.exit(0);
	}

}