/* 

14.- When two points in time are compared, each given as hours (in military time, ranging from 0 and 23) and minutes, the following pseudocode determines which comes first.
	
	If hour1 < hour2
		time1 comes first.
	Else if hour1 and hour2 are the same
		If minute1 < minute2
			time1 comes first.
		Else if minute1 and minute2 are the same
			time1 and time2 are the same.
		Else
			time2 comes first.
	Else
		time2 comes first.
	
Write a program that prompts the user for two points in time and prints the time that comes first, then the other time. In your program, supply a class Time and a method public int compareTo(Time other) that returns –1 if the time comes before the other, 0 if both are the same, and 1 otherwise.

*/

import java.util.Scanner;

public class TimeComparingUsingHoursAndMinutes {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Hours of the First Time : " );
		int hour1 = input.nextInt();
		
		System.out.print("Enter the Minutes of the First Time : " );
		int minute1 = input.nextInt();
		
		System.out.print("Enter the Hours of the Second Time : " );
		int hour2 = input.nextInt();
		
		System.out.print("Enter the Minutes of the Second Time : " );
		int minute2 = input.nextInt();
		
		int result = 0;
		// -1 time1 first, 0 equal, 1 time2 first
		
		if (hour1 < hour2) {
			result = -1;
		} else if (hour1 == hour2){
			if (minute1 < minute2){
				result = -1;
			} else if (minute1 == minute2){
				result = 0;
			} else {
				result = 1;
			}
		} else {
			result = 1;
		}
		
		if (result == -1){
			System.out.println("First Time is first.");
		} else if (result == 1){
			System.out.println("Second Time is first." );
		} else {
			System.out.println("Both Times are the same." );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}


