/* 

9.- In Java 8, the LocalDate class describes a calendar date that does not depend on a location or time zone. You construct a date like this:

	LocalDate today = LocalDate.now(); // Today’s date
	LocalDate eckertsBirthday = LocalDate(1919, 4, 9);

The plusDays method can be used to add a number of days to a LocalDate object:

	LocalDate later = today.plusDays(10); // Ten days from today

This method does not mutate the today object, but it returns a new object that is a given number of days away from today. To get the year of a day, call

	int year = today.getYear();

To get the weekday of a LocalDate, call

	String weekday = today.getDayOfWeek().toString();

Your task is to write a program that prints:

	The weekday of “Pi day”, that is, March 14, of the current year.
	The date and weekday of “Programmer’s day” in the current year; that is, the 256th day of the year. (The number 256, or 28, is useful for some programming tasks.)
	The date and weekday of the date that is 10,000 days earlier than today.

*/

import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalDate piDay = LocalDate.of(today.getYear(), 3, 14);
		String weekday = piDay.getDayOfWeek().toString();
		System.out.println("Pi day this year : " + piDay.toString() + " is " + weekday);
		
		LocalDate proDay = LocalDate.of(today.getYear(), 1, 1);
		LocalDate proDay256 = proDay.plusDays(256);
		String weekday2 = proDay256.getDayOfWeek().toString();
		System.out.println("Programmer's day this year : " + proDay256 + " is " + weekday2);
		
		LocalDate before = today.minusDays(10000);
		String date = "10,000 days ago was " + before.toString() + ", that day was " + before.getDayOfWeek().toString();
		System.out.println(date);
		
		System.exit(0);

	}

}
