/* 

5.- Write a program that reads three numbers and prints “increasing” if they are in increasing order, “decreasing” if they are in decreasing order, and “neither” otherwise. Here, “increasing” means “strictly increasing”, with each value larger than its predecessor. The sequence 3 4 4 would not be considered increasing.

*/

import java.util.Scanner;

public class IncreasingOrDecreasingOrder {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number : " );
		int n1 = input.nextInt();
		
		System.out.print("Enter Second Number : " );
		int n2 = input.nextInt();
		
		System.out.print("Enter Third Number : " );
		int n3 = input.nextInt();
		
		
		if (n1 < n2 && n2 < n3) {
			System.out.println("increasing");
		} else if ( n1 > n2 && n2 > n3){
			System.out.println("decreasing" );
		} else {
			System.out.println("neither" );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}

