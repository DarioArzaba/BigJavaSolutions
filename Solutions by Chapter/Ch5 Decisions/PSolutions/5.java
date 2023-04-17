/* 

5.- Write a program that reads in the x- and y-coordinates of two corner points of a rectangle and then prints out whether the rectangle is a square, or is in “portrait” or “landscape” orientation.

*/

import java.util.Scanner;

class PortraitLandscape {
	
	private double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
	
	public PortraitLandscape (double x1, double y1, double x2, double y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public String state() {
		String state = "";
		
		if ( (Math.abs(x2-x1)) == (Math.abs(y2-y1)) ){
			state = "square";
		} else if ((Math.abs(x2-x1)) > (Math.abs(y2-y1)) ){
			state = "landscape";
		} else {
			state = "portrait";
		}
		
		return state;
	}
	
}

public class PortrairLandscapeTester {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("First Point X Coordinate : " );
		double x1 = input.nextDouble();
		
		System.out.print("First Point Y Coordinate : " );
		double y1 = input.nextDouble();
		
		System.out.print("Second Point X Coordinate : " );
		double x2 = input.nextDouble();
		
		System.out.print("Second Point Y Coordinate : " );
		double y2 = input.nextDouble();
		
		PortraitLandscape recInfo = new PortraitLandscape(x1, y1, x2, y2);
		
		System.out.print("Rectangle State : " + recInfo.state());
		
		input.close();
		
		System.exit(0);
		
	}
	
}

