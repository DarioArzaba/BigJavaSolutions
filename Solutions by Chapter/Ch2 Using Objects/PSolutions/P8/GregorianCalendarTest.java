/* 

8.- The (GregorianCalendar) class describes a time object based on the Gregorian calendar. 

	GregorianCalendar cal = new GregorianCalendar(); // Today’s date
	GregorianCalendar eckertsBirthday = new GregorianCalendar(1919, Calendar.APRIL, 9);
	
The (add) method is used to add a number of days. The (get) method allows to get diferent fields.

	cal.add(Calendar.DAY_OF_MONTH, 10); // Now cal is ten days from today
	int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
	int month = cal.get(Calendar.MONTH);
	int year = cal.get(Calendar.YEAR);
	int weekday = cal.get(Calendar.DAY_OF_WEEK);
	
Write a program that prints the date and weekday 100 days from today. The weekday of your birthday. The date 10000 days from your birthday.

*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarTest{

	public static void main(String[] args) {

		GregorianCalendar cal = new GregorianCalendar();
		cal.add(Calendar.DAY_OF_MONTH, 100);
		System.out.println("In one hundred days: " + cal.getTime());
		
		GregorianCalendar myBirthday = new GregorianCalendar(1987, Calendar.OCTOBER, 29);
		int weekday = myBirthday.get(Calendar.DAY_OF_WEEK);
		switch (weekday) {
			case 1:
				System.out.println("My BDay was on a Sunday");
				break;
			case 2:
				System.out.println("My BDay was on a Monday");
				break;
			case 3:
				System.out.println("My BDay was on a Tuesday");
				break;
			case 4:
				System.out.println("My BDay was on a Wendsday");
				break;
			case 5:
				System.out.println("My BDay was on a Thursday");
				break;
			case 6:
				System.out.println("My BDay was on a Friday");
				break;
			default:
				System.out.println("My BDay was on a Saturday");
		}
		
		myBirthday.add(Calendar.DAY_OF_MONTH, 10000);
		System.out.println("10K away from my BDay: " + myBirthday.getTime());
		
		System.exit(0);
	
	}

}
