/* 

3.- Write a program that reads an integer and prints how many digits the number has, by checking whether the number is ≥ 10, ≥ 100, and so on. (Assume that all integers are less than ten billion.) If the number is negative, first multiply it with –1.

*/

import java.util.Scanner;

public class DigitsInNumberCalculator {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Integer Number : " );
		int num = input.nextInt();
		
		if (num < 0){
			num *= -1;
		}
		
		if (num >= 1000000000) {
			System.out.println("Number has 10 digits");
		} else if (num >= 100000000){
			System.out.println("Number has 9 digits" );
		} else if (num >= 10000000){
			System.out.println("Number has 8 digits" );
		} else if (num >= 1000000){
			System.out.println("Number has 7 digits" );
		} else if (num >= 100000){
			System.out.println("Number has 6 digits" );
		} else if (num >= 10000){
			System.out.println("Number has 5 digits" );
		} else if (num >= 1000){
			System.out.println("Number has 4 digits" );
		} else if (num >= 100){
			System.out.println("Number has 3 digits" );
		} else if (num >= 10){
			System.out.println("Number has 2 digits" );
		} else {
			System.out.println("Number has 1 digit" );
		}
		
		System.exit(0);
		
	}
	
}
