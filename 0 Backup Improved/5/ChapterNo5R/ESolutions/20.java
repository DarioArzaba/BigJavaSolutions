/* 

20.- Write a program that reads in three floating-point numbers and prints the largest of the three inputs. For example:
	
	Please enter three numbers: 4 9 2.5
	The largest number is 9.

*/

import java.util.Scanner;

public class FindLargestNumberUserInput {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the First Number : " );
		double n1 = input.nextDouble();
		
		System.out.print("Enter the Second Number : " );
		double n2 = input.nextDouble();
		
		System.out.print("Enter the Third Number : " );
		double n3 = input.nextDouble();
		
		if (n1 > n2 && n1 > n3){
			System.out.println("The largest number is : " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("The largest number is : " + n2);
		} else {
			System.out.println("The largest number is : " + n3);
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}
