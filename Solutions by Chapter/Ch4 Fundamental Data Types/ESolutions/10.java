/* 

10.- Write a program that asks the user to input

	The number of gallons of gas in the tank
	The fuel efficiency in miles per gallon
	The price of gas per gallon
	
Then print the cost per 100 miles and how far the car can go with the gas in the tank.

*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class GasEfficiencyCalculatorPerHundredMiles {
	
	public static void main(String[] args) {
		
		final int hundredMiles = 100;
		
		Scanner readNumber = new Scanner(System.in);
		System.out.print("Enter Gallons                          : ");
		BigDecimal gallons = new BigDecimal(readNumber.nextDouble());
		
		System.out.print("Enter Fuel Efficiency (Mi/Gal)         : ");
		BigDecimal efficiency = new BigDecimal(readNumber.nextDouble());
		
		System.out.print("Enter Price of Gas Per Gallon          : ");
		BigDecimal price = new BigDecimal(readNumber.nextDouble());
		
		System.out.print("Enter Precision                        : ");
		int pre = readNumber.nextInt();
		
		BigDecimal cost = (((BigDecimal.valueOf(hundredMiles)).divide(efficiency, pre,  RoundingMode.HALF_UP)).multiply(price)).setScale(pre, RoundingMode.HALF_UP);
		System.out.println("Cost per 100 miles is                  : " + cost.toString());
		
		BigDecimal miles = (gallons.multiply(efficiency)).setScale(pre, RoundingMode.HALF_UP);
		System.out.println("Total Posible Miles are                : " + miles.toString());
		
		readNumber.close();
		System.exit(0);
		
	}
	
}