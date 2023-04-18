/* 

7.- Using the Day class of Worked Example 2.1, write a program that generates a Day object representing February 28 of this year, and three more such objects that represent February 28 of the next three years. Advance each object by one day, and print each object. Also print the expected values.

*/

import java.time.LocalDate;

public class DayTester {
	
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		int thisYear = today.getYear();
		
		Day dayObj1 = new Day(thisYear, 2, 28);
		dayObj1 = dayObj1.addDays(1);
		System.out.println(dayObj1);
		System.out.println("Expected: "+ thisYear+"-03-01 ");
	
		Day dayObj2 = new Day((thisYear+1), 2, 28);
		dayObj2 = dayObj2.addDays(1);
		System.out.println(dayObj2);
		System.out.println("Expected: "+ (thisYear+1)+"-03-01 ");
		
		Day dayObj3 = new Day((thisYear+2), 2, 28);
		dayObj3 = dayObj3.addDays(1);
		System.out.println(dayObj3);
		System.out.println("Expected: "+ (thisYear+2)+"-03-01 ");
		
		Day dayObj4 = new Day((thisYear+3), 2, 28);
		dayObj4 = dayObj4.addDays(1);
		System.out.println(dayObj4);
		System.out.println("Expected: "+ (thisYear+3)+"-03-01 ");
		
		System.exit(0);
		
	}
	
}