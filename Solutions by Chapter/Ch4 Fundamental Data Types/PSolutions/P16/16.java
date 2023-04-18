/* 

16.- Consider the following tuning circuit connected to an antenna, where C is a variable capacitor whose capacitance ranges from C min to C max.

The circuit selects a frequency f for the antenna (f = (2*Pi)/(Sqrt(L*C))).

To design the circuit with a frequency on mind take C as (C = Sqrt(C min * C max)) and L as (L = (4*Pi2)/(f2*C)). This allows the circuit to be tuned to any frequency inside the range of f min (f min = (2*Pi)/(Sqrt(L*C max))) to f max (f max = (2*Pi)/(Sqrt(L*C min))), including f.

Write a Java program to design a tuning circuit for a given frequency, using a variable capacitor with given values for Cmin and Cmax. (A typical input is f = 16.7 MHz, Cmin = 14 pF, and Cmax = 365 pF.) The program should read in f (in Hz), Cmin and Cmax (in F), and print the required inductance value and the range of frequencies to which the circuit can be tuned by varying the capacitance

*/

import java.math.BigDecimal;
import java.util.Scanner;

public class TuningCircuitSimulator {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		//From picoFarads to Farads multiply by e-12
		
		//1.4e-11
		
		System.out.print("\nEnter C min in Farads : ");
		BigDecimal Cmin = new BigDecimal(input.nextDouble());
		
		//3.65e-10
		
		System.out.print("\nEnter C max in Farads : ");
		BigDecimal Cmax = new BigDecimal(input.nextDouble());
		
		//From MHz to H multiply by e6
		
		//1.67e7
		
		System.out.print("\nEnter Frequency in Hz : ");
		BigDecimal F = new BigDecimal(input.nextDouble());
		
		BigDecimal C = BigDecimal.valueOf(Math.sqrt((Cmin.multiply(Cmax)).doubleValue()));
		
		//Is the formula (f = (2*Pi)/(Sqrt(L*C))) correct?
		//In some places it is shown as (f = (1) /(2*Pi*Sqrt(L*C)))
		
		BigDecimal L = (BigDecimal.valueOf(4.0*(Math.PI*Math.PI))).divide((C.multiply(F.pow(2))) , 20, BigDecimal.ROUND_HALF_UP );
		
		System.out.println("\nRequired Inductance (L) : " + L.setScale(10, BigDecimal.ROUND_HALF_UP) + " H");
		
		BigDecimal Fmin = (BigDecimal.valueOf(2.0*Math.PI)).divide( (BigDecimal.valueOf(Math.sqrt((L.multiply(Cmax)).doubleValue()))) , 20, BigDecimal.ROUND_HALF_UP );
		
		BigDecimal Fmax = (BigDecimal.valueOf(2.0*Math.PI)).divide( (BigDecimal.valueOf(Math.sqrt((L.multiply(Cmin)).doubleValue()))) , 20, BigDecimal.ROUND_HALF_UP );
		
		System.out.println("\nRange of Frequencies    : (" + Fmin.setScale(5, BigDecimal.ROUND_HALF_UP) + " Hz) - (" + Fmax.setScale(5 ,BigDecimal.ROUND_HALF_UP) + " Hz)");
		
		input.close();
		
		System.exit(0);
	}
	
}
