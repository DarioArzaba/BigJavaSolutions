/* 

6.- Write a program that reads in the x- and y-coordinates of three corner points of a triangle and prints out whether it has an obtuse angle, a right angle, or only acute angles.

*/

import java.util.Scanner;

class AngleCalculator {
	
	private double x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
	
	public AngleCalculator (double x1, double y1, double x2, double y2, double x3, double y3){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	
	public String state() {
		String state = "";
		double e = 1e-10;
		if ((Math.abs(getAngleA() - 90) < e) || (Math.abs(getAngleB() - 90) < e) || (Math.abs(getAngleC() - 90) < e) ){
			state = "right angle";
		} else if ( getAngleA() > 90 || getAngleB() > 90 || getAngleC() > 90 ) {
			state = "obtuse angle";
		} else if (getAngleA() < 90 || getAngleB() < 90 || getAngleC() < 90) {
			state = "all acute angles";
		} else {
			state = "unknown";
		}
		
		
		return state;
	}
	
	public double getLengtha(){
		double length = Math.hypot((x2-x1),(y2-y1));
		return length;
	}
	
	public double getLengthb(){
		double length = Math.hypot((x3-x2),(y3-y2));
		return length;
	}
	
	public double getLengthc(){
		double length = Math.hypot((x1-x3),(y1-y3));
		return length;
	}
	
	public double getAngleA(){
		//Cosine Law a2 = b2 + c2 − 2bc cos(A)
		double angle = Math.toDegrees(Math.acos( ((getLengthb()*getLengthb())+(getLengthc()*getLengthc())-(getLengtha()*getLengtha())) / (2*getLengthb()*getLengthc())));
		return angle;
	}
	
	public double getAngleB(){
		//Cosine Law b2 = a2 + c2 − 2ac cos(B)
		double angle = Math.toDegrees(Math.acos( ((getLengthc()*getLengthc())+(getLengtha()*getLengtha())-(getLengthb()*getLengthb())) / (2*getLengthc()*getLengtha()) ) );
		return angle;
	}
	
	public double getAngleC(){
		//Cosine Law c2 = a2 + b2 - 2ab cos(C)
		double angle = Math.toDegrees(Math.acos( ((getLengtha()*getLengtha())+(getLengthb()*getLengthb())-(getLengthc()*getLengthc())) / (2*getLengtha()*getLengthb()) ) );
		return angle;
	}
	
}

public class AngleCalculatorTester {
	
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
		
		System.out.print("Third Point X Coordinate : " );
		double x3 = input.nextDouble();
		
		System.out.print("Third Point Y Coordinate : " );
		double y3 = input.nextDouble();
		
		AngleCalculator triangle = new AngleCalculator(x1, y1, x2, y2, x3, y3);
		
		System.out.print("Triangle State : " + triangle.state());
		
		input.close();
		
		System.exit(0);
		
	}
	
}

