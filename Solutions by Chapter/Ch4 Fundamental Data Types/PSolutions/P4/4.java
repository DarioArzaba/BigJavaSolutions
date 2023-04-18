/*

4.- A boat floats in a two-dimensional ocean. It has a position and a direction. It can move by a given distance in its current direction, and it can turn by a given angle.

	public double getX()
	public double getY()
	public double getDirection()
	public void turn(double degrees)
	public void move(double distance)

*/

import java.util.Scanner;

class BoatSimulator {
	
	private double positionX = 0, positionY = 0, direction = 0;
	
	public BoatSimulator (double pX, double pY, double d){
		positionX = pX;
		positionY = pY;
		direction = d;
		if (direction < 0){
			direction = Math.abs(360.0 + direction);
		}
		direction = direction % 360.0;
	}
	
	public double getX(){
		return positionX;
	}
	
	public double getY(){
		return positionY;
	}
	
	public double getDirection(){
		return direction;
	}
	
	public void turn(double degrees){
		direction = direction + degrees;
		if (direction < 0){
			direction = Math.abs(360.0 + direction);
		}
		direction = direction % 360.0;
	}
	
	public void move(double distance){
		double componentX = Math.cos(Math.toRadians(direction))*distance;
		double componentY = Math.sin(Math.toRadians(direction))*distance;
		positionX = positionX + componentX;
		positionY = positionY + componentY;
	}
	
}

public class BoatSimulatorTester {
	
	public static void main(String[] args)  {
		
		BoatSimulator boat = new BoatSimulator(0,0,10);
		
		boat.turn(-30);
		boat.move(10);
		boat.turn(45);
		boat.move(15.5);
		
		System.out.printf("Current boat X position : %.4f \n", boat.getX());
		System.out.printf("Current boat Y position : %.4f \n", boat.getY() );
		System.out.printf("Current boat direction  : %.4f \n", boat.getDirection() );
		
		boat.turn(615.23);
		boat.move(13.39);
		
		System.out.printf("\nNew boat X position : %.4f \n", boat.getX());
		System.out.printf("New boat Y position : %.4f \n", boat.getY() );
		System.out.printf("New boat direction  : %.4f \n", boat.getDirection() );
		
		System.exit(0);
	}
	
}

