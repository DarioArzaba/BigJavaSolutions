/* 

7.- Consider a robot that is placed in a room. Write an algorithm that enables the robot, placed anywhere in the room, to count the number of windows. For example, in the room at right, the robot (marked as R) should find that it has two windows.

A. 
	Get the robot starting position, the position of the windows and the size of the room.
	Build the room, the windows and place the robot
	Turn the robot until it is facing to the right
	Advance until you find a wall in front of you, then turn down.
	Advance until you find a wall in front of you, then turn left.
	Repeat until you have "searched arround the room"
		If you are checking the lower wall
			Turn down.
			If you have a wall in front of you go to the next wall
			Else
				If it is a window and the previous one wasn't
					Add one to the number of windows.
				Else go to your left.
		If you are checking the left wall
			Turn up.
			If you have a wall in front of you go to the next wall
			Else 
				If it is a window and the previous one wasn't
					Add one to the number of windows.
				Else go up.
		If you are checking the upper wall
			Turn right.
			If you have a wall in front of you go to the next wall
			Else 
				If it is a window and the previous one wasn't
					Add one to the number of windows.
				Else go to your right.
		If you are checking the right wall
			Turn down.
			If you have a wall in front of you have "searched arround the room"
			Else 
				If it is a window and the previous one wasn't
					Add one to the number of windows.
				Else go down.
	End by displaying the number of windows.

*/



public class RobotWindowFinder {
	
	//Modify rows, columns, robot position and window placement.
	//Corner windows are counted as two separate windows.
	static int rows = 11;
	static int columns = 12;
	static int robotX = 3;
	static int robotY = 7;
	
	static int [][] matrix = new int[rows][columns];
	static int wall = 1;
	static int window = 2;
	static int floor = 3;
	static int robot = 4;
	static int up = 1;
	static int left = 2;
	static int down = 3;
	static int right = 4;
	static int dir = right;
	static boolean placeWindows = false;
	static boolean finished = false;
	
	//Print current state of the matrix
	public static void printRoom() {
		System.out.print("\n");
		for (int i = 0; i < columns; i++){System.out.print("----");} System.out.print("\n");
		for (int i = 0; i < matrix.length; i++){ System.out.print("|");
			for (int j = 0; j < matrix[i].length; j++){
				if ((rows >= 3) && (columns >= 3)){
					if ((j == robotX) && (i == robotY)){
						matrix[i][j] = robot;
					}
				}
				if (matrix[i][j] == wall){
					System.out.print(" @ |");
				} else if ((matrix[i][j] == robot) && (dir == up)) {
					System.out.print(" ↑ |");
				} else if ((matrix[i][j] == robot) && (dir == left)) {
					System.out.print(" ← |");
				} else if ((matrix[i][j] == robot) && (dir == down)) {
					System.out.print(" ↓ |");
				} else if ((matrix[i][j] == robot) && (dir == right)) {
					System.out.print(" → |");
				} else if (matrix[i][j] == window) {
					System.out.print(" + |");
				} else if (matrix[i][j] == floor) {
					System.out.print("   |");
				}
			}
			System.out.print("\n"); for (int k = 0; k < columns; k++){ System.out.print("----"); } System.out.print("\n");
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		//Place initial floor coordinates
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = floor;
			}
		}
		
		//Place initial wall, windows and robot coordinates
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				//Place walls
				if ( (j == 0) || (j == (matrix[i].length-1)) || (i == 0) || (i == (matrix.length-1))){ matrix[i][j] = wall; }
				//Place windows
				if ((i==0&&j==3)||(i==0&&j==4)||(i==6&&j==11)||(i==7&&j==11)) 
				{placeWindows = true;}
				if (placeWindows){  matrix[i][j] = window; placeWindows = false; }
				//Place robot
				if ((rows >= 3) && (columns >= 3)){
					if ((j == robotX) && (i == robotY)){ matrix[i][j] = robot; } 
				}
			}
		}
		
		boolean foundCorner = false;
		boolean firstTurn = false;
		boolean correctMatrix = false;
		boolean sameWindow = false;
		int wallNumber = 1;
		int numberWindows = 0;
		
		//Validate matrix
		if ((rows >= 1) && (columns >= 2)){ correctMatrix = true; }

		if (correctMatrix) {			
			while (finished == false){

				//Get into the bottom left corner (starting point)
				if (foundCorner == false){
					if (firstTurn == false){
						if (matrix[robotY][robotX+1] == floor){ matrix[robotY][robotX] = floor; robotX++; } 
						else if ((matrix[robotY][robotX+1] == wall)||(matrix[robotY][robotX+1] == window)){ firstTurn = true; dir = down; }
					}
					if ((dir == down) && (foundCorner == false)) {
						if (matrix[robotY+1][robotX] == floor){ matrix[robotY][robotX] = floor; robotY++; } 
						else if ((matrix[robotY+1][robotX] == wall)||(matrix[robotY][robotX+1] == window)){ foundCorner = true; dir = left; }
					}
				}

				//Search for windows going arround the room against the 4 walls (until it finishes)
				if (foundCorner == true){
					if (wallNumber == 1){
						dir = down;
						printRoom();
						System.out.println("\n\n Windows: " + numberWindows + " \n");
						Thread.sleep(250);
						if ((matrix[robotY][robotX-1] == window) || (matrix[robotY][robotX-1] == wall)) { wallNumber = 2; } 
						if ((matrix[robotY+1][robotX] == window) && (wallNumber == 1)) { 
							if (sameWindow == false) {numberWindows++;} 
							dir = left; matrix[robotY][robotX] = floor; robotX--; sameWindow = true; } 
						else if (wallNumber == 1) { dir = left; matrix[robotY][robotX] = floor; robotX--; sameWindow = false; }	
					} else if (wallNumber == 2){
						dir = left;
						printRoom();
						System.out.println("\n\n Windows: " + numberWindows + " \n");
						Thread.sleep(250);
						if ((matrix[robotY-1][robotX] == window) || (matrix[robotY-1][robotX] == wall)) { wallNumber = 3; } 
						if ((matrix[robotY][robotX-1] == window) && (wallNumber == 2)) { 
							if (sameWindow == false) {numberWindows++;}
							dir = up; matrix[robotY][robotX] = floor; robotY--; sameWindow = true; }
						else if (wallNumber == 2) { dir = up; matrix[robotY][robotX] = floor; robotY--; sameWindow = false; }
					} else if (wallNumber == 3){
						dir = up;
						printRoom();
						System.out.println("\n\n Windows: " + numberWindows + " \n");
						Thread.sleep(250);
						if ((matrix[robotY][robotX+1] == window) || (matrix[robotY][robotX+1] == wall)) { wallNumber = 4; } 
						if ((matrix[robotY-1][robotX] == window) && (wallNumber == 3)) { 
							if (sameWindow == false) {numberWindows++;} 
							dir = right; matrix[robotY][robotX] = floor; robotX++; sameWindow = true; } 
						else if (wallNumber == 3) { dir = right; matrix[robotY][robotX] = floor; robotX++; sameWindow = false; }
					} else if (wallNumber == 4){
						dir = right;
						printRoom();
						System.out.println("\n\n Windows: " + numberWindows + " \n");
						Thread.sleep(250);
						if ((matrix[robotY+1][robotX] == window) || (matrix[robotY+1][robotX] == wall)) {
							if (matrix[robotY][robotX+1] == window) { 
								if (sameWindow == false) {numberWindows++;} 
								dir = down; sameWindow = true; } 
							else { dir = down; sameWindow = false; }
							finished = true;
						}
						if (finished == false){
							if (matrix[robotY][robotX+1] == window) { 
								if (sameWindow == false) {numberWindows++;} 
								dir = down; matrix[robotY][robotX] = floor; robotY++; sameWindow = true; } 
							else { dir = down; matrix[robotY][robotX] = floor; robotY++; sameWindow = false; }	
						}
					}
				}
				printRoom();
				System.out.println("\n\n Windows: " + numberWindows + " \n");
				Thread.sleep(250);
			}
		} else {
			//Error if matrix didn't pass the validation
			System.out.print("Error: At least 2 Columns and 1 Row needed!");
		}
		System.exit(0);
	}

}

