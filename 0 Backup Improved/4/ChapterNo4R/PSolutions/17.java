/* 

17.- According to the Coulomb force law, the electric force between two charged particles of charge Q1 and Q2 Coulombs, that are a distance r meters apart, is:

	F = (Q1*Q2) / (4*Pi*E*r*r) Newtons.
	E = 8.854 x 10E-12 Farads per Meter

Write a program that calculates the force on a pair of charged particles, based on the user input of Q1 Coulombs, Q2 Coulombs, and r meters, and then computes and displays the electric force.

*/


import java.math.BigDecimal;
import java.util.Scanner;

public class CoulombForceLawCalculator {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		final BigDecimal E = new BigDecimal(8.854e-12);
		
		System.out.print("\nEnter Q1 in Coulombs     : ");
		BigDecimal Q1 = new BigDecimal(input.nextDouble());
		
		System.out.print("\nEnter Q2 in Coulombs     : ");
		BigDecimal Q2 = new BigDecimal(input.nextDouble());
		
		System.out.print("\nEnter Distance in Meters : ");
		BigDecimal R = new BigDecimal(input.nextDouble());
		
		BigDecimal force = ((Q1.multiply(Q2)).divide((E.multiply(BigDecimal.valueOf(4.0*Math.PI)).multiply(R.pow(2))), 20, BigDecimal.ROUND_HALF_UP));
		
		System.out.println("\nForce : " + force.setScale(30, BigDecimal.ROUND_HALF_UP) + " N");
		
		input.close();
		
		System.exit(0);
	}
	
}
