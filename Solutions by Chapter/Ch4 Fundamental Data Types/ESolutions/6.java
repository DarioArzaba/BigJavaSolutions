/* 

6.- Write a program that prompts the user for a measurement in meters and then converts it to miles, feet, and inches.

*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MeasurementMetricMetersToImperial {
	
	public static void main(String[] args) {
		
		final BigDecimal MILE = new BigDecimal(0.000621371);
		final BigDecimal FEET = new BigDecimal(3.28084);
		final BigDecimal INCH = new BigDecimal(39.3701);
		
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter the Measurement in Meters  :  ");
		double num = readNumber.nextDouble();
		BigDecimal n = new BigDecimal(num);
		System.out.print("Enter the Integer Precision      :  ");
		int pre = readNumber.nextInt();
		
		BigDecimal r = (n.multiply(MILE)).setScale(pre, RoundingMode.CEILING);
		System.out.println("Measurement in Miles             : " + r.toString());
		
		r = (n.multiply(FEET)).setScale(pre, RoundingMode.CEILING);
		System.out.println("Measurement in Foot              : " + r.toString());
		
		r = (n.multiply(INCH)).setScale(pre, RoundingMode.CEILING);
		System.out.println("Measurement in Inch              : " + r.toString());
		
		System.exit(0);
		
	}
	
}
