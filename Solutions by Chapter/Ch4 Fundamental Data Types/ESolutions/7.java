/* 

7.- Write a program that prompts the user for a radius and then prints
	
	The area and circumference of a circle with that radius
	The volume and surface area of a sphere with that radius

*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CircleRadiusMathCalculations {
	
	public static void main(String[] args) {
		
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter the Radius         : ");
		double num = readNumber.nextDouble();
		BigDecimal n = new BigDecimal(num);
		System.out.print("Enter the Precision      : ");
		int pre = readNumber.nextInt();
		
		BigDecimal r = ((n.add(n)).multiply(BigDecimal.valueOf(Math.PI))).setScale(pre, RoundingMode.CEILING);
		System.out.println("Circumference            : " + r.toString());
		
		r = ((n.pow(2)).multiply(BigDecimal.valueOf(Math.PI))).setScale(pre, RoundingMode.CEILING);
		System.out.println("Area                     : " + r.toString());
		
		r = ((((BigDecimal.valueOf(4)).multiply(BigDecimal.valueOf(Math.PI))).multiply((n.pow(3)))).divide(BigDecimal.valueOf(3))).setScale(pre, RoundingMode.CEILING);
		System.out.println("Volume                   : " + r.toString());
		
		r = (((BigDecimal.valueOf(4)).multiply(BigDecimal.valueOf(Math.PI))).multiply((n.pow(2)))).setScale(pre, RoundingMode.CEILING);
		System.out.println("Surface Area             : " + r.toString());
		
		System.exit(0);
		
	}
	
}
