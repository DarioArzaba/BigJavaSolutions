/*

2.- Easter Sunday is the first Sunday after the first full moon of spring. To compute the date, you can use this algorithm, invented by the mathematician Carl Friedrich Gauss in 1800:

	1. Let y be the year (such as 1800 or 2001).
	2. Divide y by 19 and call the remainder a. Ignore the quotient.
	3. Divide y by 100 to get a quotient b and a remainder c.
	4. Divide b by 4 to get a quotient d and a remainder e.
	5. Divide 8 * b + 13 by 25 to get a quotient g. Ignore the remainder.
	6. Divide 19 * a + b - d - g + 15 by 30 to get a remainder h. Ignore the quotient.
	7. Divide c by 4 to get a quotient j and a remainder k.
	8. Divide a + 11 * h by 319 to get a quotient m. Ignore the remainder.
	9. Divide 2 * e + 2 * j - k - h + m + 32 by 7 to get a remainder r. Ignore the quotient.
	10. Divide h - m + r + 90 by 25 to get a quotient n. Ignore the remainder.
	11. Divide h - m + r + n + 19 by 32 to get a remainder p. Ignore the quotient.

Then Easter falls on day p of month n. For example, if y is 2001:

	a = 6
	b = 20
	c = 1
	d = 5
	e = 0
	g = 6
	h = 18
	j = 0
	k = 1
	m = 0
	r = 6
	n = 4
	p = 15

Therefore, in 2001, Easter Sunday fell on April 15. Write a program that prompts the
user for a year and prints out the month and day of Easter Sunday

https://en.wikipedia.org/wiki/Computus#Gauss's_Easter_algorithm
https://math.stackexchange.com/questions/896954/decoding-gauss-easter-algorithm

*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class EasterSunday {
	
	private int y = 0;
	
	public EasterSunday(int year){
		this.y = year;
	}
	
	public int getYear (){
		return this.y;
	}
	
	public String getEasterSunday(){
		
		String date = new String();
		
		int a = this.y % 19;
		int b = this.y / 100;
		int c = this.y % 100;
		int d = b / 4;
		int e = b % 4;
		int g = ( (8*b) + 13) / (25);
		int h = ( (19*a) + b - d - g + 15) % (30);
		int j = c / 4;
		int k = c % 4;
		int m = (a + (11*h)) / (319);
		int r = ((2*e) + (2*j) - k - h + m + 32) % (7);
		int n = (h - m + r + 90) / (25);
		int p = (h - m + r + n + 19) % (32);
		
		String[] months = {"January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		date = months[n-1] + " " + Integer.toString(p);
		
		return date;
		
	}
	
	
}

public class EasterSundayTester {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter a year : "  );
		
		int year = input.nextInt();
		
		EasterSunday date = new EasterSunday(year);
		
		System.out.println("On " + date.getYear() + " Easter Sunday is : " + date.getEasterSunday());
		
		input.close();
		
		System.exit(0);
	}
	
}
