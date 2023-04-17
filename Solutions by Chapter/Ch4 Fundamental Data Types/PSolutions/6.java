/* 

6.- The following pseudocode describes how a bookstore computes the price of an order from the total price and the number of the books that were ordered. Read the total book price and the number of books.

	Compute the tax (7.5 percent of the total book price).
	Compute the shipping charge ($2 per book).
	The price of the order is the sum of the total book price, the tax, and the shipping charge.
	Print the price of the order.

Translate this pseudocode into a Java program

*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class PriceBookCalculator {
	
	private double bookPrice = 0.0;
	private int bookNumber = 0;
	private double tax = 0.0;
	private double transportCost = 0.0;
	private double totalOrderCost = 0.0;
	
	public PriceBookCalculator (double price, int number){
		bookNumber = Math.abs(number);
		bookPrice = Math.abs(price);
	}
	
	public PriceBookCalculator (double price, int number, double taxPorcent, double transport){
		bookNumber = Math.abs(number);
		bookPrice = Math.abs(price);
		tax = taxPorcent;
		transportCost = transport;
	}
	
	public void setBookPrice(double newBookPrice){
		bookPrice = Math.abs(newBookPrice);
	}
	
	public double getBookPrice (){
		return bookPrice;
	}
	
	public void setBookNumber(int newBookNumber){
		bookNumber = Math.abs(newBookNumber);
	}
	
	public int getBookNumber (){
		return bookNumber;
	}
	
	public void setTax(double newBookTax){
		tax = newBookTax;
	}
	
	public double getTax (){
		return ((tax/100.0)*getBookPrice());
	}
	
	public void setTransportCost (double newTransportCost){
		transportCost = newTransportCost;
	}
	
	public double getTransportCost (){
		return transportCost;
	}
	
	public double getSubtotalPerBook(){
		return (getBookPrice()+getTax()+getTransportCost());
	}
	
	public double getTotalOrderCost(){
		return getSubtotalPerBook()*bookNumber;
	}
	
	private double round(double value, int places) {
		if (places < 0) throw new IllegalArgumentException();
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
	public void printOrder() {
		System.out.println("\n\nBook Order");
		System.out.println("Total Price Per Book    : " + round(getBookPrice(),4));
		System.out.println("Total Tax per Book      : " + round(getTax(),4));
		System.out.println("Transport Cost Per Book : " + round(getTransportCost(),4));
		System.out.println("Subtotal Per Unit       : " + round(getSubtotalPerBook(),4));
		System.out.println("Number of Units Ordered : " + round(getBookNumber(),4));
		System.out.println("Total Order Cost        : " + round(getTotalOrderCost(),4));
	}
	
	
}

public class PriceBookCalculatorTester {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter Book Price  : ");
		double bookPrice = input.nextDouble();
		
		System.out.print("\nEnter Book Number : ");
		int bookNumber = input.nextInt();
		
		PriceBookCalculator firstOrder = new PriceBookCalculator(bookPrice, bookNumber);
		
		firstOrder.setTax(7.5);
		
		firstOrder.setTransportCost(2);
		
		firstOrder.printOrder();
		
		input.close();
		
		System.exit(0);
	}
	
}


