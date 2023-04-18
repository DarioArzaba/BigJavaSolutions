/* 

7.- Write a program that reads in three integers and prints “in order” if they are sorted in ascending or descending order, or “not in order” otherwise. For example:

1 2 5 in order
1 5 2 not in order
5 2 1 in order
1 2 2 in order

*/

import java.util.Scanner;

public class InOrderOrNotInOrder {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number : " );
		int n1 = input.nextInt();
		
		System.out.print("Enter Second Number : " );
		int n2 = input.nextInt();
		
		System.out.print("Enter Third Number : " );
		int n3 = input.nextInt();
		
		if ((n1 < n2 && n2 < n3) || (n1 > n2 && n2 > n3)) {
			System.out.println("in order");
		} else {
			System.out.println("not in order" );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}

