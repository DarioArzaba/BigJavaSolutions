/* 

8.- The following pseudocode describes how to extract the dollars and cents from a price given as a floating-point value.

	For example, a price 2.95 yields values 2 and 95 for the dollars and cents.

	Assign the price to an integer variable dollars.
	Multiply the difference price - dollars by 100 and add 0.5.
	Assign the result to an integer variable cents.

Translate this pseudocode into a Java program. Read a price and print the dollars and
cents. Test your program with inputs 2.95 and 4.35

*/


import java.math.BigDecimal;
import java.util.Scanner;

class ExtractDollarsCents {
	
	private BigDecimal dollars = new BigDecimal(0);
	private BigDecimal cents = new BigDecimal(0);
	
	public ExtractDollarsCents(double money){
		dollars = dollars.add(BigDecimal.valueOf(Math.abs(money))).setScale(0,BigDecimal.ROUND_DOWN);
		cents = cents.add(BigDecimal.valueOf(Math.abs(money))).subtract(dollars).multiply(BigDecimal.valueOf(100)).setScale(2,BigDecimal.ROUND_HALF_UP);
	}
	
	public double getDollars(){
		return dollars.doubleValue();
	}
	
	public double getCents(){
		return cents.doubleValue();
	}
	
}

public class ExtractDollarsCentsTester {
	
	public static void main(String[] args)  {
		
		ExtractDollarsCents first = new ExtractDollarsCents(2.95);
		ExtractDollarsCents second = new ExtractDollarsCents(4.35);
		
		System.out.printf("\nFirst Dollars  : %.0f" , first.getDollars());
		System.out.printf("\nFirst Cents    : %.0f" , first.getCents());
		
		System.out.printf("\n\nSecond Dollars : %.0f" , second.getDollars());
		System.out.printf("\nSecond Cents   : %.0f" , second.getCents());
		
		
		System.exit(0);
	}
	
}