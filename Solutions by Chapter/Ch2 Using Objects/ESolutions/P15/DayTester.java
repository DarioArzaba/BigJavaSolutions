/* 

15.- Using the Day class, write a DayTester program that constructs a Day object representing today, 
	adds ten days to it, and then computes the difference between that day and today. 
	Print the difference and the expected value.

*/

public class DayTester {
	public static void main(String[] args) {
		Day dayObj = new Day();
		System.out.println(dayObj);
		Day dayObjPlus = dayObj.addDays(10);
		System.out.println(dayObjPlus);
		int dayDiff = dayObjPlus.daysFrom(dayObj);
		System.out.println("The difference is: "+ dayDiff);
		System.out.println("Expected difference: 10");
		System.exit(0);
	}
}