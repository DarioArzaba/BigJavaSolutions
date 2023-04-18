/* 

19.- The electric circuit shown below is designed to measure the temperature of the gas in a chamber.
The resistor R is enclosed in the chamber. The relation between Resistance in Ohms and temperature in Celsius is:

	R = R_i + (k*T)

In this device, assume R_i = 100 and k = 0.5

The voltmeter displays the value of the voltage, Vm , across the sensor.
This voltage Vm indicates the temperature, T, of the gas according to the equation
		
T = R/k - R_i/k
T = R_s/k * Vm/Vs-Vm - R_i/k

Suppose the voltmeter voltage is constrained to the range Vmin = 12 volts ≤ Vm ≤ V max = 18 volts.

Write a program that accepts a value of Vm and checks that it is between 12 and 18.
The program should return the gas temperature in degrees Celsius.

*/

import java.util.Scanner;

public class GasChamberTemperatureCircuit {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nTemperature of Gas in Chamber" );
		
		System.out.println("\nVoltimeter Reading of the Circuit:" );
		double Vm = input.nextDouble();
		
		if (Vm >= 12 && Vm <= 18){
			
			double T = (75/0.5) * (Vm/(20-Vm)) - (100/0.5);
			System.out.println("Gas Temperature : " + T + " °C" );
			
		} else {
			System.out.println("Error. Voltmeter constrained to 12V - 18V." );
		}
		
		
		input.close();
		
		System.exit(0);
		
	}
	
}