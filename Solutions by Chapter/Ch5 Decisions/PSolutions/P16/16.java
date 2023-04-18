/* 

16.- Repeat Exercise P5.14, modifying the program so that it first asks the user whether the input will be a wavelength or a frequency.

*/


import java.util.Scanner;

public class ElectromagneticSpectrumBoth {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nElectromagnetic Spectrum" );
		
		System.out.println("Search light wave using : " );
		System.out.println("1.- Frequency in Hz" );
		System.out.println("2.- Wavelength in m" );
		System.out.print("Option: " );
		
		int option = input.nextInt();
		
		if (option == 1) {
			
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
		} else if (option == 2){
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
		} else {
			System.out.println("\nError. " + option + " is not a valid option." );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}