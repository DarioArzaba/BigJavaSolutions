/* 

1.- In some Asian countries, the number 14 is considered unlucky. Some building owners play it safe and skip both the thirteenth and the fourteenth floor. How would you modify the sample program to handle such a building?

*/

import java.util.Scanner;

public class ElevatorSimulationPartTwo {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Floor: ");
		
		int floor = in.nextInt();
		
		int actualFloor;
		
		if (floor == 13 || floor == 14){
			actualFloor = 12; //Do Nothing
		} else if (floor > 14) {
			actualFloor = floor - 2;
		}  else {
			actualFloor = floor;
		}
		
		System.out.println("The elevator will travel to the actual floor " + actualFloor);
		
		System.exit(0);
		
	}
	
}