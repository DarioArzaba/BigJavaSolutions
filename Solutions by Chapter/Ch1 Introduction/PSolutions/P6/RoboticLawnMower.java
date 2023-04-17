/* 

6.- Write an algorithm that allows a robot to mow a rectangular lawn, provided it has been placed in a corner.

A.
	
	Start by defining if the robot Finished as false;
	Repeat while Finished is not true (meaning false);
		Cut the grass you are standing on.
		Sense the color in front of you.
		If it is of uncut grass then move forward.
		Else, if it is a wall or cut grass turn left.
		Senece the color in front of you.
		If it is of uncut grass then move forward.
		Else, if it is another wall or cut grass turn right twice
		Senece the color in front of you.
		If it is of uncut grass then move forward.
		Else, define Finished as true;
	End by returning the mowed lawn.

*/


public class RoboticLawnMower {
	
	static int rows = 9;
	static int columns = 12;
	static int dir = 4;
	
	static int [][] matrix = new int[rows][columns];
	static int wall = 1;
	static int cutGrass = 2;
	static int grass = 3;
	static int robot = 4;
	static int up = 1;
	static int left = 2;
	static int down = 3;
	static int right = 4;
	static int robotX = 1;
	static int robotY = 1;
	static boolean finished = false;
	
	//Print current state of the matrix
	public static void printGrass() {

		//Top Line
		System.out.print("\n");
		for (int i = 0; i < columns; i++){
			System.out.print("----");
		} 
		
		//Middle Lines
		System.out.print("\n");
		for (int i = 0; i < matrix.length; i++){ System.out.print("|");
			for (int j = 0; j < matrix[i].length; j++){
				//Print robot
				if ((rows >= 3) && (columns >= 3)){
					if ((j == robotX) && (i == robotY)){
						matrix[i][j] = robot;
					}
				}
				//Print contents based on the state of the matrix
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
				} else if (matrix[i][j] == cutGrass) {
					System.out.print("   |");
				} else if (matrix[i][j] == grass){
					System.out.print(" s |");
				}
			}

			//Bottom line
			System.out.print("\n"); 
			for (int k = 0; k < columns; k++){ 
				System.out.print("----"); 
			} 
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		//Fix initial robot Y coordinates
		if ((rows >= 3) && (columns >= 3)){
			robotY = (matrix.length-2);
		} else {
			robotX = 0;
			robotY = 0;
		}

		//Place initial grass coordinates
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = grass;	
			}
		}
		
		//Place initial wall and robot coordinates
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				if ( (j == 0) || (j == (matrix[i].length-1)) || (i == 0) || (i == (matrix.length-1))){ 
					matrix[i][j] = wall; 
				}
				if ((rows >= 3) && (columns >= 3)){
					if ((j == robotX) && (i == robotY)){ 
						matrix[i][j] = robot; 
					} 
				}
							
			}
		}
		
		//Calculate the total number of grass
		int numGrass = 0;
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				if (matrix[i][j] == grass){
					numGrass++;
				}
			}
		}
		
		//Define initial direction of the robot
		if ((dir == down)|| (dir == left)) { 
			dir = up; 
		}

		//Validate matrix
		boolean correctMatrix = false;
		if ((rows >= 1) && (columns >= 2)) {
			correctMatrix = true;
		}

		//Cut grass
		if ((dir == up)&&(correctMatrix)) {
			//Cut grass (direction up) and move robot coordinates until total grass number is 0
			while (finished == false){
				if (dir == up){
					if (matrix[robotY-1][robotX] == grass ){ matrix[robotY][robotX] = cutGrass; numGrass--; robotY--; }
					else { dir = right; }
				} else if (dir == right){
					if (matrix[robotY][robotX+1] == grass ){ matrix[robotY][robotX] = cutGrass; numGrass--; robotX++; }
					else { dir = down; }
				} else if (dir == down){
					if (matrix[robotY+1][robotX] == grass ){ matrix[robotY][robotX] = cutGrass; numGrass--; robotY++; } 
					else { dir = left; }
				} else if (dir == left){
					if (matrix[robotY][robotX-1] == grass ){ matrix[robotY][robotX] = cutGrass; numGrass--; robotX--; } 
					else { dir = up; }
				}
				printGrass();
				Thread.sleep(250);
				System.out.print("\n\n Tiles of grass left: " + numGrass);
				if (numGrass == 0){ finished = true; System.out.print("\n\n Robot: I finished! \n\n"); }
			}
		} else if ((dir == right)&&(correctMatrix)){
			//Cut grass (direction right) and move robot coordinates until total grass number is 0
			while (finished == false){
				if (dir == right){
					if (matrix[robotY][robotX+1] == grass ){ matrix[robotY][robotX] = cutGrass; numGrass--; robotX++; }
					else { dir = up; }
				} else if (dir == up){
					if (matrix[robotY-1][robotX] == grass ){ matrix[robotY][robotX] = cutGrass; numGrass--; robotY--; }
					else { dir = left; }
				} else if (dir == left){
					if (matrix[robotY][robotX-1] == grass ){ matrix[robotY][robotX] = cutGrass; numGrass--; robotX--; } 
					else { dir = down; }
				} else if (dir == down){
					if (matrix[robotY+1][robotX] == grass ){ matrix[robotY][robotX] = cutGrass; numGrass--; robotY++; } 
					else { dir = right; }
				}
				printGrass();
				Thread.sleep(250);
				System.out.print("\n\n Tiles of grass left: " + numGrass);
				if (numGrass == 0){ finished = true; System.out.print("\n\n Robot: I finished! \n\n");}
				
			}
		} else {
			//Error if matrix didn't pass the validation
			System.out.print("Error: At least 2 Columns and 1 Row needed!");
		}

		System.exit(0);

	}

}

