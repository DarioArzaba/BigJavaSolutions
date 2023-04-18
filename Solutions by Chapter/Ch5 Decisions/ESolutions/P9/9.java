/* 

9.- A compass needle points a given number of degrees away from North, measured clockwise. Write a program that reads the angle and prints out the nearest compass direction;  one of N, NE, E, SE, S, SW, W, NW. In the case of a tie, prefer the nearest principal direction (N, E, S, or W).

*/

import java.util.Scanner;

public class CompassDirectionFinderDegrees {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the degrees (0-360) : " );
		double a = input.nextDouble();
		
		if (a < 0){
			a = Math.abs(360.0 + a);
		}
		a %= 360.0;
		
		System.out.print("Compass : ");
		
		if (a <= 22.5 && a > 0.0){
			System.out.print("N");
		} else if (a < 67.5){
			System.out.print("NE");
		} else if (a <= 112.5){
			System.out.print("E");
		} else if (a < 157.5){
			System.out.print("SE");
		} else if (a <= 202.5){
			System.out.print("S");
		} else if (a < 247.5){
			System.out.print("SW");
		} else if (a <= 292.5){
			System.out.print("W");
		} else if (a < 337.5){
			System.out.print("NW");
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}
