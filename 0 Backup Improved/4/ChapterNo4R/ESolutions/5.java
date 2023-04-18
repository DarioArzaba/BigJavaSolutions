/* 

5.- Enhance the output of Exercise E4.4 so that the numbers are properly aligned:

	Sum: 45
	Difference: -5
	Product: 500
	Average: 22.50
	Distance: 5
	Maximum: 25
	Minimum: 20

*/

import java.math.BigDecimal;
import java.util.Scanner;

public class IntegerMathOperationsFormatting {
	
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
		System.out.printf("\n\nSum : %20.0f" , r);
		
		r = n.subtract(n2);
		System.out.printf("\nDifference : %13.0f" , r);
		
		r = n.multiply(n2);
		System.out.printf("\nProduct : %16.0f" , r);
		
		BigDecimal denominator = new BigDecimal(2);
		r = (n.add(n2)).divide(denominator);
		System.out.printf("\nAverage : %18.1f" , r);
		
		r = (n.subtract(n2)).abs();
		System.out.printf("\nDistance : %15.0f" , r);
		
		r = n.max(n2);
		System.out.printf("\nMaximum  : %15.0f" , r);
		
		r = n.min(n2);
		System.out.printf("\nMinimum  : %15.0f" , r);
		
		System.exit(0);
		
	}
	
}

