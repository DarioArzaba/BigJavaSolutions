/* 

8.- Write a program that reads four integers and prints “two pairs” if the input consists of two matching pairs (in some order) and “not two pairs” otherwise. For example,
	
	1 2 2 1 two pairs
	1 2 2 3 not two pairs
	2 2 2 2 two pairs

*/

import java.util.Scanner;

public class PairOfNumbersInFourInputs {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First Number : " );
		int n1 = input.nextInt();
		
		System.out.print("Enter Second Number : " );
		int n2 = input.nextInt();
		
		System.out.print("Enter Third Number : " );
		int n3 = input.nextInt();
		
		System.out.print("Enter Fourth Number : " );
		int n4 = input.nextInt();
		
		
		if ((n1 == n2 && n3 == n3) || (n1 == n4 && n2 == n3) || (n1 == n3 && n2 == n4)) {
			System.out.println("two pairs");
		} else {
			System.out.println("not two pairs" );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}

