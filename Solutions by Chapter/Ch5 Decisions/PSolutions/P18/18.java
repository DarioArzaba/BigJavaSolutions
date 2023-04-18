/* 

18.- Sound level (L) in  decibel (dB) is determined by:

	L = 20 * log_10( p_f / p_i )
	
P_f = Diferencia de presion en el aire en Pascals con respecto a P_i.
P_i = 20 x 10^-6

The following table gives descriptions for certain sound levels.
	
	Threshold of pain 130 dB
	Possible hearing damage 120 dB
	Jack hammer at 1 m 100 dB
	Traffic on a busy roadway at 10 m 90 dB
	Normal conversation 60 dB
	Calm library 30 dB
	Light leaf rustling 0 dB
	
Write a program that reads a value and a unit, either dB or Pa, and then prints the closest description from the list above.

*/

import java.util.Scanner;

public class SoundLevelThreshold {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nSound Level" );
		
		System.out.println("\nSound Units:" );
		System.out.println("1.- Decibel (dB)" );
		System.out.println("2.- Pascal (Pa)" );
		System.out.print("Option: " );
		int choice = input.nextInt();
		System.out.print("Value: " );
		double value = input.nextDouble();
		
		if (choice == 2){
			//Transform from Pascal to Sound Level in Decibel
			value = 20 * Math.log10( (value / 20e-6 ) );
		}
		
		
		
		if (choice == 1 || choice == 2){
			if (value < 15) {
				System.out.println("Sound Level: Light leaf rustling." );
			} else if (value < 45) {
				System.out.println("Sound Level: Calm library." );
			} else if (value < 75) {
				System.out.println("Sound Level: Normal Conversation." );
			} else if (value < 95 ) {
				System.out.println("Sound Level: Traffic on a busy roadway." );
			} else if (value < 115) {
				System.out.println("Sound Level: Possible hearing damage." );
			} else {
				System.out.println("Sound Level: Threshold of pain." );
			}
		} else {
			System.out.println("Error. That is not a valid Unit." );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}