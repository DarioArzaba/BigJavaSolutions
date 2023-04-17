/*

23.- The average person can jump off the ground with a velocity of 7 mph without fear of leaving the planet. However, if an astronaut jumps with this velocity while standing on Halley’s Comet, will the astronaut ever come back down? Create a program that allows the user to input a launch velocity (in mph) from the surface of Halley’s Comet and determine whether a jumper will return to the surface. If not, the program should calculate how much more massive the comet must be in order to return the jumper to the surface.

Escape velocity is v = Root(2* (G*M)/(R)) m/s
G = 6.67e-11	Mass = 1.3e22	Radius = 1.153e6		mph*0.44704= m/s		m/s*2.23694=mph

*/

import java.util.Scanner;

public class GravityCalculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nHalley's Comet Successful Launch" );
		
		final double G = 6.67e-11;
		final double R = 1153000;
		final double mphToMS = 0.44704;
		double M = 1.3e22;
		
		System.out.print("\nLaunch Velocity in (mph) : " );
		double v = input.nextDouble();
		v *= mphToMS;
		//Correctly calculates scape velocity in ms
		double scapeV = Math.sqrt((2)*((G*M)/(R)));
		
		if (scapeV > v){
			System.out.println("The jumper will return to the surface." );
		} else {
			System.out.println("The jumper will not return to the surface." );
			boolean massFound = false;
			while(!massFound){
				int stopSearch = 1000000000;
				
				scapeV = Math.sqrt((2)*((G*M)/(R)));
				if (scapeV > v || stopSearch == 0){
					massFound = true;
					if (stopSearch != 0){
						System.out.println("The mass needed is : " + M );
					} else {
						System.out.println("To massive to calculate :( : " + M );
					}
				} else {
					stopSearch -= 1;
					M += 1e21;
				}
			}
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}