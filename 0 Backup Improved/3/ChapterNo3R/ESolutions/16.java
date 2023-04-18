/* 

16.- Implement a class Moth that models a moth flying along a straight line. The moth has a position, which is the distance from a fixed origin. When the moth moves toward a point of light, its new position is halfway between its old position and the position of the light source. Supply:

	public Moth(double initialPosition)
	public void moveToLight(double lightPosition)
	public double getPosition()

	Your MothTester should construct a moth, move it toward a couple of light sources, and check that the moth’s position is as expected.

*/

class Moth {
	
	private double position;
	
	public Moth(double initialPosition) {
		position = initialPosition;
	}
	
	public void moveToLight(double lightPosition) {
		double distance = Math.abs(position - lightPosition);
		if (lightPosition > position) {
			position += (distance/2);
		} else {
			position -= (distance/2);
		}
	}
	
	public double getPosition() {
		return position;
	}
	
	
}

public class MothTester {
	
	public static void main(String[] args){
		
		Moth moth = new Moth(5);
		System.out.println("Position: " + moth.getPosition());
		moth.moveToLight(9);
		System.out.println("Position: " + moth.getPosition());
		moth.moveToLight(1);
		System.out.println("Position: " + moth.getPosition());
		moth.moveToLight(-10);
		System.out.println("Position: " + moth.getPosition());
		
		System.exit(0);
	
	}

}
