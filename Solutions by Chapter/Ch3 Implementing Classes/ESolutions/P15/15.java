/* 

15.- Write a class Bug that models a bug moving along a horizontal line. The bug moves either to the right or left. Initially, the bug moves to the right, but it can turn to change its direction. In each move, its position changes by one unit in the current direction. Provide a constructor 

	public Bug(int initialPosition)
	public void turn()
	public void move()
	public int getPosition()

	Bug bugsy = new Bug(10);
	bugsy.move(); // Now the position is 11
	bugsy.turn();
	bugsy.move(); // Now the position is 10

	Your BugTester should construct a bug, make it move and turn a few times, and print the actual and expected position.

*/

class Bug {
	
	private int position;
	private boolean left = false;
	private boolean right = true;
	
	public Bug(int iniPosition) {
		position = iniPosition;
	}
	
	public void turn() {
		if (right == true) {
			left = true;
			right = false;
		} else {
			left = false;
			right = true;
		}
	}
	
	public void move() {
		if (left == true) {
			position--;
		} else {
			position++;
		}
	}
	public int getPosition() {
		return position;
	}
}

public class BugMoveTester {
	
	public static void main(String[] args){
		
		Bug littleBug = new Bug(10);
		littleBug.move();
		littleBug.move();
		littleBug.turn();
		littleBug.move();
		System.out.println("Position: " + littleBug.getPosition());
		System.out.println("Expected: 11");
		
		System.exit(0);
	}

}