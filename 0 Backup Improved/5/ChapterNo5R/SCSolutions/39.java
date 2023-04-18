/*

39.- Your task is to rewrite lines 19–26 of the ElevatorSimulation2 program so that there is a single if statement with a complex condition. What is the condition?

	if (. . .) {
		System.out.println("Error: Invalid floor number");
	}

A. (floor == 13 || floor <= 0 || floor > 20)

*/

import java.util.Scanner;

public class ElevatorSimulation2 {
	
	public static void main(String[]args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Floor: ");
		
		if(in.hasNextInt()) {
			
			int floor=in.nextInt();
			
			if( floor == 13 || floor <= 0 || floor > 20 ) {
				System.out.println("Error: Invalid floor number. ");
			} else {
				int actualFloor=floor;
				if(floor>13) {
					actualFloor=floor-1;
				}
				System.out.println("The elevator will travel to the actual floor "  + actualFloor);
			}
			
		} else {
			System.out.println("Error: Not an integer.");
		}
		
		System.exit(0);
		
	}
}
