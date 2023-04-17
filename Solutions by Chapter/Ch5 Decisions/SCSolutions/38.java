/*

38.- In the ElevatorSimulation2 program, what is the output when the input is
	
	a. 100?
	b. –1?
	c. 20?
	d. thirteen?

A.

	A) Error. The floor must be between 1 and 20.
	B) Error. The floor must be between 1 and 20.
	C) 19.
	D) Error. The input is not an integer.

*/

import java.util.Scanner;

public class ElevatorSimulation2 {
	
	public static void main(String[]args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.print("Floor: ");
		
		if(in.hasNextInt()) {
			
			int floor=in.nextInt();
			
			if(floor==13) {
				System.out.println("Error: There is no thirteenth floor.");
			} else if(floor<=0||floor>20) {
				System.out.println("Error: The floor must be between 1 and 20.");
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