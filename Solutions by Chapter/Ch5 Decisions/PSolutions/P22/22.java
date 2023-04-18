/*

22.- A mass m is attached to the end of a rope of length r = 3 meters. The rope can only be whirled around at speeds of 1, 10, 20, or 40 meters per second. The rope can withstand a maximum tension of T = 60 Newtons. Write a program where the user enters the value of the mass m, and the program determines the greatest speed at which it can be whirled without breaking the rope. Hint: T = (m*v^2)/r.

*/

import java.util.Scanner;

public class centripetalRopeBreakPoint {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nCentripetal Rope Breaking Point" );
		
		final double ropeLenght = 3.0;
		final double ropeMaxTension = 60;
		
		System.out.print("\nMass (m) : " );
		double mass = input.nextDouble();
		
		//1 10 20 40
		//T = mv^2 / r
		
		//False means the rope hasn't broken yet
		
		boolean t1 = ((mass*(1*1))/(ropeLenght))>ropeMaxTension;
		boolean t2 = ((mass*(10*10))/(ropeLenght))>ropeMaxTension;
		boolean t3 = ((mass*(20*20))/(ropeLenght))>ropeMaxTension;
		boolean t4 = ((mass*(40*40))/(ropeLenght))>ropeMaxTension;
		
		if (!t4) {
			System.out.print("\nMax speed Mode = 40 ms" );
		} else if (!t3) {
			System.out.print("\nMax speed Mode = 20 ms" );
		} else if (!t2) {
			System.out.print("\nMax speed Mode = 10 ms" );
		} else if (!t1) {
			System.out.print("\nMax speed Mode = 1 ms" );
		} else {
			System.out.print("\nSafe speed Mode not available." );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}