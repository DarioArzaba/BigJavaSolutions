/* 

15.- Repeat Exercise P5.14, modifying the program so that it prompts for the frequency instead.

*/


import java.util.Scanner;

public class ElectromagneticSpectrumFrequency {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nElectromagnetic Spectrum" );
		
		System.out.print("\nEnter Frequency of Light in Hz: " );
		double wavelength = input.nextDouble();
		
		if (wavelength > 3e19){
			System.out.println("\nElectromagnetic Type: Gamma Rays" );
			System.out.println("Wavelength in (m): < 1 x 10^-11" );
		} else if (wavelength > 3e16){
			System.out.println("\nElectromagnetic Type: X-Rays" );
			System.out.println("Wavelength in (m): 1 x 10^-11 - 1 x 10^-8" );
		} else if (wavelength > 7.5e14){
			System.out.println("\nElectromagnetic Type: Ultraviolet" );
			System.out.println("Wavelength in (m): 1 x 10^-8 - 4 x 10^-7" );
		} else if (wavelength > 4e14){
			System.out.println("\nElectromagnetic Type: Visible" );
			System.out.println("Wavelength in (m): 4 x 10^-7 - 7 x 10^-7" );
		} else if (wavelength > 3e11){
			System.out.println("\nElectromagnetic Type: Infrared" );
			System.out.println("Wavelength in (m): 7 x 10^-7 - 1 x 10^-3" );
		} else if (wavelength > 3e9){
			System.out.println("\nElectromagnetic Type: Microwave" );
			System.out.println("Wavelength in (m): 1 x 10^-3 - 1 x 10^-1" );
		} else {
			System.out.println("\nElectromagnetic Type: Radio Waves" );
			System.out.println("Wavelength in (m): > 1 x 10^-1" );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}