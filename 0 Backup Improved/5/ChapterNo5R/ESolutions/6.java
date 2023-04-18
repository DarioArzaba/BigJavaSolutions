/* 

6.- Repeat Exercise E5.5, but before reading the numbers, ask the user whether increasing/decreasing should be “strict” or “lenient”. In lenient mode, the sequence 3 4 4 is increasing and the sequence 4 4 4 is both increasing and decreasing.

*/

import java.util.Scanner;

public class LenientAndStrictOrdering {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Strict or Lenient Mode: " );
		String mode = input.next();
		
		System.out.print("Enter First Number : " );
		int n1 = input.nextInt();
		
		System.out.print("Enter Second Number : " );
		int n2 = input.nextInt();
		
		System.out.print("Enter Third Number : " );
		int n3 = input.nextInt();
		
		if (mode.toLowerCase().equals("strict")){
			if (n1 < n2 && n2 < n3) {
				System.out.println("increasing");
			} else if ( n1 > n2 && n2 > n3){
				System.out.println("decreasing" );
			} else {
				System.out.println("neither" );
			}
		} else if (mode.toLowerCase().equals("lenient")){
			
			if ((n1 < n2 && n2 < n3) || (n1 < n2 && n2 == n3) || (n1 == n2 && n2 < n3)) {
				System.out.println("increasing");
			} else if ((n1 > n2 && n2 > n3) || (n1 > n2 && n2 == n3) || (n1 == n2 && n2 > n3) ){
				System.out.println("decreasing" );
			} else if (n1 == n2 && n2 == n3 && n1 == n3){
				System.out.println("increasing and decreasing" );
			} else {
				System.out.println("neither" );
			}
			
		} else {
			System.out.println("Error. Incorrect Mode." );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}