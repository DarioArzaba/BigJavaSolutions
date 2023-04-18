/* 

8.- Write a program that asks the user for the lengths of a rectangle’s sides. Then print

	The area and perimeter of the rectangle
	The length of the diagonal (use the Pythagorean theorem)

*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class RectangleMathCalculations {
	
	public static void main(String[] args) {
		
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter the Length         : ");
		double num = readNumber.nextDouble();
		BigDecimal l = new BigDecimal(num);
		
		System.out.print("Enter the Width          : ");
		num = readNumber.nextDouble();
		BigDecimal w = new BigDecimal(num);
		
		System.out.print("Precision                : ");
		int pre = readNumber.nextInt();
		
		BigDecimal r = ((w.add(w)).add(l.add(l))).setScale(pre, RoundingMode.CEILING);
		System.out.println("Perimeter                : " + r.toString());
		
		r = (w.multiply(l)).setScale(pre, RoundingMode.CEILING);
		System.out.println("Area                     : " + r.toString());
		
		r = (BigDecimal.valueOf(Math.sqrt(((w.pow(2)).add(l.pow(2))).doubleValue()))).setScale(pre, RoundingMode.CEILING);
		System.out.println("Diagonal                 : " + r.toString());
		
		System.exit(0);
		
	}
	
}
