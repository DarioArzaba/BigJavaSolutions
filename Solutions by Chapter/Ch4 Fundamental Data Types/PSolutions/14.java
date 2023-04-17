/*

14.- The pipe clip temperature sensors shown here are robust sensors that can be clipped directly onto copper pipes to measure the temperature of the liquids in the pipes. Each sensor contains a device called a thermistor. Thermistors are semiconductor devices that exhibit a temperature-dependent resistance described by:

	R = (Ri)(e ^ ((B)*((((1)/(T)))-(((1)/(Ti))))))
	Where R is the resistance in Ohms.
	T is the temperature in K.
	Ri is the resistance at temperature Ti.
	B is a material dependant constant of the thermistor in K
	

Thermistors are specified by providing values for Ri, Ti, and B.
In this case Ri = 1075, Ti = 358.15, B = 3969.
From the formula the temperature of the liquid in Celsius is therefore:

	T = (((B*Ti)/((Ti*ln(((R)/(Ri))))+B)))-(273.15)

Write a Java program that prompts the user for the thermistor resistance R and prints a message giving the liquid temperature in °C.
*/

import java.math.BigDecimal;
import java.util.Scanner;

public class ThermistorLiquidTemperatureCalculator {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		final double B = 3969;
		final double Ti = 358.15;
		final double Ri = 1075;
		
		System.out.print("\nEnter the Thermistor Resistance in Ohms  : ");
		double R = input.nextDouble();
		
		double T = (((B*Ti)/((Ti*Math.log(((R)/(Ri))))+B)))-(273.15);
		
		System.out.printf("\nTemperature of the Liquid                : %.5f °C \n", T);
		
		input.close();
		
		System.exit(0);
	}
	
}

