/* 

21.- A mass m = 2 kilograms is attached to the end of a rope of length r = 3 meters. The mass is whirled around at high speed. The rope can withstand a maximum tension of T = 60 Newtons. Write a program that accepts a rotation speed v and determines whether such a speed will cause the rope to break. T = (m*v^2)/r.

*/

import java.util.Scanner;

public class CentripetalRopeTension {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nCentripetal Rope Breaking Point" );
		
		final double mass = 2.0;
		final double ropeLenght = 3.0;
		final double ropeMaxTension = 60;
		
		System.out.print("\nRotation Speed (v) : " );
		double V = input.nextDouble();
		
		//T = mv^2 / r
		
		double tension = (mass*(V*V))/(ropeLenght);
		
		if (tension > ropeMaxTension) {
			System.out.print("\nThat speed will break the rope." );
		} else {
			System.out.print("\nThat speed will not break the rope." );
		}
		
		//Max V -> v = root((T*r)/(m))
		//With this data = 3*root(10) or 0.48683...
		
		input.close();
		
		System.exit(0);
		
	}
	
}