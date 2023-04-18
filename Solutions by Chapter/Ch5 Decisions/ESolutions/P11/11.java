/* 

11.- Write a program that reads a temperature value and the letter C for Celsius or F for Fahrenheit. Print whether water is liquid, solid, or gaseous at the given temperature at sea level.

*/

import java.util.Scanner;

public class WaterStateSimulation {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Scale (C) or (F) : " );
		String scale = input.next();
		
		System.out.print("Enter Temperature : " );
		double temp = input.nextDouble();
		
		if ((scale.equals("C") && temp >= 100) || (scale.equals("F") && temp >= 212)){
			System.out.print("Water is Gaseous" );
		} else if ((scale.equals("C") && temp > 0) || (scale.equals("F") && temp > 32)){
			System.out.print("Water is Liquid" );
		} else {
			System.out.print("Water is Solid" );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}
