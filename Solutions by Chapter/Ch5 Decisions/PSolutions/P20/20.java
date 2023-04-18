/* 

21.- Crop damage due to frost is one of the many risks confronting farmers. The figure below shows a simple alarm circuit designed to warn of frost. The alarm circuit uses a device called a thermistor to sound a buzzer when the temperature drops below freezing. Thermistors are semiconductor devices that exhibit a temperature dependent resistance described by the equation:

	R = Ri*e^(B* (1/T) - (1/T1))
	
R = resistance in ohms
T = temperatura in kelvin
Ri = initial resistance in ohms
Ti = initial resistance in kelvin
B = constant

The circuit will sound when:
	
	(R2)/(R+R2) < (R4)/(R3+R4)

With

		The thermistor used in the alarm circuit has R0 = 33,192 Ω at T0 = 40 °C, and
		β = 3,310 °K. (Notice that β has units of °K. The temperature in °K is obtained by
		adding 273° to the temperature in °C.) The resistors R2, R3, and R4 have a resistance
		of 156.3 kΩ = 156,300 Ω.
		Write a Java program that prompts the user for a temperature in °F and prints a
		message indicating whether or not the alarm will sound at that temperature.

*/

import java.util.Scanner;

public class ThermistorCropFrost {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nFrost Damage Temperature" );
		
		final double R_i = 33192.0;
		final double B = 3310.0;
		final double T_i = 313.15;
		final double R_234 = 156300.0;
		
		System.out.print("\nOutside Temperature in F: " );
		double F = input.nextDouble();
		double T = ((F-32.0)/1.8)+273.15;
		
		double R = (R_i)*(Math.exp(((B/T) - (B/T_i)) ));
		
		if ( (R_234/(R_234 + R)) < 0.5) {
			System.out.print("\nBuzzer will trigger. Bzzzzzz." );
		} else {
			System.out.print("\nBuzzer will not trigger. (Silence)" );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}