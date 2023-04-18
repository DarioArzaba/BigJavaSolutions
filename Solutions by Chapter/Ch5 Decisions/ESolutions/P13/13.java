/* 

13.- Add error handling to Exercise E5.12. If the user does not enter a number when expected, or provides an invalid unit for the altitude, print an error message and end the program.

*/

import java.util.Scanner;

public class WaterBoilingPointInputValidation {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		boolean invalidNumber = false;
		boolean invalidScale = false;
		
		System.out.print("Enter Scale (C) or (F) : " );
		if (input.hasNext("C") || input.hasNext("F")){
			String scale = input.next();
			System.out.print("Enter Temperature : " );
			if (input.hasNextDouble()){
				double temp = input.nextDouble();
				System.out.print("Enter Altitude Units (m) or (f) : " );
				if (input.hasNext("m") || input.hasNext("f")){
					String altScale = input.next();
					System.out.print("Enter Altitude : " );
					if (input.hasNextDouble()){
						double alt = input.nextDouble();
						if (alt >= 0){
							
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
							
						} else {
							System.out.println("Error. Invalid Altitude Number." );
						}
					} else{
						System.out.println("Error. Invalid Altitude Number." );
					}
				} else{
					System.out.println("Error. Invalid Altitude Unit." );
				}
			} else{
				System.out.println("Error. Invalid Temperature Number." );
			}
		} else{
			System.out.println("Error. Invalid Temperature Scale." );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}

