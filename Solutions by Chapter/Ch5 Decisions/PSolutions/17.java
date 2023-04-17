/* 

17.- A minivan has two sliding doors. Each door can be opened by either a dashboard switch, its inside handle, or its outside handle. However, the inside handles do not work if a child lock switch is activated. In order for the sliding doors to open, the gear shift must be in park, and the master unlock switch must be activated. (This book’s author is the long-suffering owner of just such a vehicle.) Your task is to simulate a portion of the control software for the vehicle.

	The input is
		A sequence of values for the switches and the gear shift, in the following order:
			Dashboard switches for left and right sliding door, child lock, and master unlock (0 for off or 1 for activated)
			Inside and outside handles on the left and right sliding doors (0 or 1)
			The gear shift setting (one of P N D 1 2 3 R).
			
	A typical input would be 0 0 0 1 0 1 0 0 P.
	Print “left door opens” and/or “right door opens” as appropriate. If neither door opens, print “both doors stay closed”.

*/

import java.util.Scanner;

public class MinivanDoorsSimulator {
	
	public static void main(String[] args) {
		
		boolean leftDoor = false;
		boolean rightDoor = false;
		boolean leftDoorSwitch, rightDoorSwitch, childLockSwitch, masterUnlockSwitch, leftInsideHandle, leftOutsideHandle, rightInsideHandle, rightOutsideHandle;
		String gearShift = "";
		
		Scanner input = new Scanner(System.in);
		String switchInput = "";
		
		
		System.out.println("\nMinivan Doors" );
		
		System.out.println("\nAnswer (1) for yes and (0) for no." );
		
		//Questions
		System.out.print("Left door lock on ? " );
		int choice = input.nextInt();
		leftDoorSwitch = (choice == 1) ? true : false;
		if (choice == 1) { switchInput += "1 "; } else { switchInput += "0 "; }
		
		System.out.print("Right door lock on ? " );
		choice = input.nextInt();
		rightDoorSwitch = (choice == 1) ? true : false;
		if (choice == 1) { switchInput += "1 "; } else { switchInput += "0 "; }
		
		System.out.print("Child Lock switch on ? " );
		choice = input.nextInt();
		childLockSwitch = (choice == 1) ? true : false;
		if (choice == 1) { switchInput += "1 "; } else { switchInput += "0 "; }
		
		System.out.print("Master Lock on ? " );
		choice = input.nextInt();
		masterUnlockSwitch = (choice == 1) ? true : false;
		if (choice == 1) { switchInput += "1 "; } else { switchInput += "0 "; }
		
		System.out.print("Used Left Inside Handle ? " );
		choice = input.nextInt();
		leftInsideHandle = (choice == 1) ? true : false;
		if (choice == 1) { switchInput += "1 "; } else { switchInput += "0 "; }
		
		System.out.print("Used Left Ouside Handle ? " );
		choice = input.nextInt();
		leftOutsideHandle = (choice == 1) ? true : false;
		if (choice == 1) { switchInput += "1 "; } else { switchInput += "0 "; }
		
		System.out.print("Used Right Inside Handle? " );
		choice = input.nextInt();
		rightInsideHandle = (choice == 1) ? true : false;
		if (choice == 1) { switchInput += "1 "; } else { switchInput += "0 "; }
		
		System.out.print("Used Right Outside Handle ? " );
		choice = input.nextInt();
		rightOutsideHandle = (choice == 1) ? true : false;
		if (choice == 1) { switchInput += "1 "; } else { switchInput += "0 "; }
		
		System.out.print("Gear Shift Position ? " );
		gearShift = (input.next()).substring(0,1);
		switchInput += gearShift;
		
		if (gearShift.equals("P") && masterUnlockSwitch == false){
			if (childLockSwitch == true) {
				if (leftDoorSwitch == false && leftOutsideHandle == true){
					leftDoor = true;
				}
				if (rightDoorSwitch == false && rightOutsideHandle == true){
					rightDoor = true;
				}
			} else {
				if (leftDoorSwitch == false && (leftOutsideHandle == true || leftInsideHandle == true)){
					leftDoor = true;
				}
				if (rightDoorSwitch == false && (rightOutsideHandle == true ||  rightInsideHandle == true)) {
					rightDoor = true;
				}
			}
		}
		
		if (leftDoor == false && rightDoor == false) {
			System.out.println("\nBoth doors stay closed." );
		} else {
			if (leftDoor == true){
				System.out.println("\nLeft door opens." );
			}
			if (rightDoor == true){
				System.out.println("\nRight door opens." );
			}
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}