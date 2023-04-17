/* 

4.- Write a program that prompts the user for two integers and then prints

	The sum
	The difference
	The product
	The average
	The distance (absolute value of the difference)
	The maximum (the larger of the two)
	The minimum (the smaller of the two)
	
*/

import java.math.BigDecimal;
import java.util.Scanner;

public class IntegerMathematicalOperations {
	
	public static void main(String[] args) {
		
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter The First Integer Number  : ");
		int num = readNumber.nextInt();
		BigDecimal n = new BigDecimal(num);
		System.out.println("Number Entered                  : " + n.toString());
		
		System.out.print("Enter The Second Integer Number : ");
		int num2 = readNumber.nextInt();
		BigDecimal n2 = new BigDecimal(num2);
		System.out.println("Number Entered                  : " + n2.toString());
		
		BigDecimal r = n.add(n2);
		System.out.println("\nSum                             : " + r.toString());
		
		r = n.subtract(n2);
		System.out.println("Difference                      : " + r.toString());
		
		r = n.multiply(n2);
		System.out.println("Product                         : " + r.toString());
		
		BigDecimal denominator = new BigDecimal(2);
		r = (n.add(n2)).divide(denominator);
		System.out.println("Average                         : " + r.toString());
		
		r = (n.subtract(n2)).abs();
		System.out.println("Distance                        : " + r.toString());
		
		r = n.max(n2);
		System.out.println("Maximum                         : " + r.toString());
		
		r = n.min(n2);
		System.out.println("Minimum                         : " + r.toString());
		
		System.exit(0);
		
	}
	
}

