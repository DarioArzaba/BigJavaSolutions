/* 

12.- The boiling point of water drops by about one degree centigrade for every 300 meters (or 1,000 feet) of altitude. Improve the program of Exercise E5.11 to allow the user to supply the altitude in meters or feet.

*/

import java.util.Scanner;

public class WaterBoilingPointAltitudeSimulation {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Scale (C) or (F) : " );
		String scale = input.next();
		
		System.out.print("Enter Temperature : " );
		double temp = input.nextDouble();
		
		System.out.print("Enter Altitude Units (m) or (f) : " );
		String altScale = input.next();
		
		System.out.print("Enter Altitude : " );
		double alt = input.nextDouble();
		
		
		double boilingLimitC = 100;
		
		if (altScale.equals("m")){
			boilingLimitC -= (alt/300.0);
		} else if (altScale.equals("f")){
			boilingLimitC -= (alt/1000.0);
		}
		
		double boilingLimitF = (boilingLimitC * 1.8) + 32;
		
		if ((scale.equals("C") && temp >= boilingLimitC) || (scale.equals("F") && temp >= boilingLimitF)){
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

