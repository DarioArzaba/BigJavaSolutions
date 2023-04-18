/* 

19.- Write a program that transforms numbers 1, 2, 3, …, 12 into the corresponding month names January, February, March, …, December. Hint: Make a very long string "January February March ...", in which you add spaces such that each month name has the same length. Then use substring to extract the month you want.

*/

import java.util.Scanner;

public class MonthScannerAndPrinter {
	
	public static void main(String[] args) {
		
		String months = "January   February  March     April     May       June      July      August    September October   November  December  ";
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Month Number : " );
		int choice = input.nextInt();
		
		while (choice > 12 || choice < 1){
			System.out.println("Error. Month must be from 1 to 12." );
			System.out.print("Enter the Month Number : " );
			choice = input.nextInt();
		}
		
		String month = months.substring((choice-1)*10, choice*10 );
		System.out.print("Month                  : " + month.trim() );
		
		input.close();
		System.exit(0);
		
	}
	
}