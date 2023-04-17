/* 

14.- Write a program that prompts the user for a wavelength value and prints a description of the corresponding part of the electromagnetic spectrum, as given in the following table.
	
	Electromagnetic Spectrum
	Type	 		Wavelength (m) 			Frequency (Hz)
	Radio Waves 	> 1e–1 					< 3e9
	Microwaves 		1e–3 to 1e–1 			3e9 to 3e11
	Infrared 		7e–7 to 1e–3 			3e11 to 4e14
	Visible light 	4e–7 to 7e–7 			4e14 to 7.5e14
	Ultraviolet 	1e–8 to 4e–7 			7.5e14 to 3e16
	X-rays 			1e–11 to 1e–8 			3e16 to 3e19
	Gamma rays 		< 1e–11 					> 3e19

*/


import java.util.Scanner;

public class ElectromagneticSpectrumTable {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nElectromagnetic Spectrum" );
		
		System.out.print("\nEnter Wavelength of Light in Metres: " );
		double wavelength = input.nextDouble();
		
		if (wavelength > 1e-1){
			System.out.println("\nElectromagnetic Type: Radio Wave" );
			System.out.println("Frequency in (Hz): < 3 x 10^9" );
		} else if (wavelength > 1e-3){
			System.out.println("\nElectromagnetic Type: Microwave" );
			System.out.println("Frequency in (Hz): 3 x 10^9 - 3 x 10^11" );
		} else if (wavelength > 7e-7){
			System.out.println("\nElectromagnetic Type: Infrared" );
			System.out.println("Frequency in (Hz): 3 x 10^11 - 4 x 10^14" );
		} else if (wavelength > 4e-7){
			System.out.println("\nElectromagnetic Type: Visible" );
			System.out.println("Frequency in (Hz): 4 x 10^14 - 7.5 x 10^14" );
		} else if (wavelength > 1e-8){
			System.out.println("\nElectromagnetic Type: Ultraviolet" );
			System.out.println("Frequency in (Hz): 7.5 x 10^14 - 3 x 10^16" );
		} else if (wavelength > 1e-11){
			System.out.println("\nElectromagnetic Type: X-Rays" );
			System.out.println("Frequency in (Hz): 3 x 10^16 - 3 x 10^19" );
		} else {
			System.out.println("\nElectromagnetic Type: Gamma Rays" );
			System.out.println("Frequency in (Hz): > 3 x 10^19" );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}