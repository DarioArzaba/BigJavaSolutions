/* 

24.- Write a program that asks the user to enter a month (1 for January, 2 for February, etc.) and then prints the number of days in the month. For February, print “28 days”.
	
	Enter a month: 5
	30 days
	
	Do not use a separate if/else branch for each month. Use Boolean operators.

*/

import java.util.Scanner;

public class DaysInMonthCalculator {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Month : " );
		int m = input.nextInt();
		
		if (m == 2) {
			System.out.println("28 days");
		} else if (m == 4 || m == 6 || m == 9 || m == 11){
			System.out.println("30 days");
		} else {
			System.out.println("31 days");
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}
