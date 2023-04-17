/*

12.- Consider the following circuit.
	
		  -- R2 --
		  |		  |
----- R1 -|		  |-------
		  |		  |
		  -- R3 --
		 
	R2 and R3 are in parallel connected in series to R1.
	
Write a program that reads the resistances of the three resistors and computes the total resistance.

*/

import java.math.BigDecimal;
import java.util.Scanner;

public class CircuitOhmsCalculator {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter the Resistance of R1 in Ohms : ");
		double R1 = input.nextDouble();
		
		System.out.print("\nEnter the Resistance of R2 in Ohms : ");
		double R2 = input.nextDouble();
		
		System.out.print("\nEnter the Resistance of R3 in Ohms : ");
		double R3 = input.nextDouble();
		
		//RT of resistances in series = R1 + R2 ...
		//RT of resistances in parallel = 1/R1 + 1/R2 ...
		
		double RT = ((R1) + ((1.0)/((1.0/R2)+(1.0/R3)))  );
		
		System.out.printf("\nTotal Circuit Resistance : %.4f Ohms\n", RT);
		
		input.close();
		
		System.exit(0);
	}
	
}

