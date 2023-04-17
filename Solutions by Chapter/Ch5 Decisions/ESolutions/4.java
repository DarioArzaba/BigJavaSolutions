/* 

4.- Write a program that reads three numbers and prints “all the same” if they are all the same, “all different” if they are all different, and “neither” otherwise.

*/

import java.util.Scanner;

public class DifferentOrSameNumbers {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number : " );
		int n1 = input.nextInt();
		
		System.out.print("Enter Second Number : " );
		int n2 = input.nextInt();
		
		System.out.print("Enter Third Number : " );
		int n3 = input.nextInt();
		
		
		if (n1 == n2 && n2 == n3) {
			System.out.println("all the same");
		} else if ( n1 != n2 && n2 != n3 && n1 != n3){
			System.out.println("all different" );
		} else {
			System.out.println("neither" );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}
