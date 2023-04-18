/* 

13.- The dew point temperature Td can be calculated (approximately) from the relative humidity RH and the actual temperature T by:

	Td = (b * f(T,RH)) / (a - f(T,RH))
	f(T,RH) = ((a * T) / (b + T)) + ln(RH)
	Where a = 17.27 and b = 237.7° C.

Write a program that reads the relative humidity (between 0 and 1) and the temperature (in degrees C) and prints the dew point value. Use the Java function log to compute the natural logarithm

*/

import java.math.BigDecimal;
import java.util.Scanner;

public class DewPointTemperatureCalculator {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		double a = 17.27;
		double b = 237.7;
		
		System.out.print("\nEnter the Relative Humidity        : ");
		double RH = input.nextDouble();
		
		while (RH >= 1 || RH <= 0){
			System.out.println("\nError. Relative Humidity must be between 0 and 1.");
			System.out.print("\nEnter the Relative Humidity : ");
			RH = input.nextDouble();
		}
		
		System.out.print("\nEnter the Temperature in Celsius   : ");
		double T = input.nextDouble();
		
		double f = ((a*T)/(b+T)) + (Math.log(RH));
		double Td = ((b*f)/(a-f));
		
		System.out.printf("\nDew Point Temperature : %.4f °C\n", Td);
		
		input.close();
		
		System.exit(0);
	}
	
}

