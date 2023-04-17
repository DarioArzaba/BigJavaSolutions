/* 

3.- Write a program that reads a number and displays the square, cube, and fourth power. Use the Math.pow method only for the fourth power.

*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class NumberPowersPrinter {
	
	public static void main(String[] args) {
		
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		double n = readNumber.nextDouble();
		DecimalFormat f = new DecimalFormat("######.###");
		System.out.println("Number Entered       : " + f.format(n));
		System.out.println("Number Squared       : " + f.format(n*n));
		System.out.println("Number Cubed         : " + f.format(n*n*n));
		System.out.println("Number to the Fourth : " + f.format(Math.pow(n,4)));
		
		System.exit(0);
		
	}
	
}
