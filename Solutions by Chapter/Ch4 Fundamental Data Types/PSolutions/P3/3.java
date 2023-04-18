/*

3.- In this project, you will perform calculations with triangles. A triangle is defined by the x- and y-coordinates of its three corner points. Your job is to compute the following properties of a given triangle:

	The lengths of all sides
	The angles at all corners
	The perimeter
	The area

Implement a Triangle class with appropriate methods. Supply a program that prompts a user for the corner point coordinates and produces a nicely formatted table of the triangle properties

*/

import java.util.Scanner;

class TriangleCalculator {
	
	private double p1X, p1Y, p2X, p2Y, p3X, p3Y;
	
	public TriangleCalculator (double ax, double ay, double bx, double by, double cx, double cy){
		p1X = ax;
		p1Y = ay;
		p2X = bx;
		p2Y = by;
		p3X = cx;
		p3Y = cy;
	}
	
	public double getLengtha(){
		double length = Math.hypot((p2X-p1X),(p2Y-p1Y));
		return length;
	}
	
	public double getLengthb(){
		double length = Math.hypot((p3X-p2X),(p3Y-p2Y));
		return length;
	}
	
	public double getLengthc(){
		double length = Math.hypot((p1X-p3X),(p1Y-p3Y));
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
	
	public double getPerimeter(){
		double perimeter = this.getLengtha()+this.getLengthb()+this.getLengthc();
		return perimeter;
	}
	
	public double getArea(){
		//Implemented using Heron's formula.
		//A = sqrt( p*(p-a)*(p-b)*(p-c) ) with p as the semiperimeter
		double p = getPerimeter()/2.0;
		double area = Math.sqrt(p*(p-getLengtha())*(p-getLengthb())*(p-getLengthc()));
		return area;
		
	}
	
	public void printTriangle(){
		System.out.println("\n\n---------------------------------------------------");
		System.out.println("|                   TRIANGLE                       |");
		System.out.println("---------------------------------------------------");
		System.out.println("| Side a (p1-p2) | Side b (p2-p3) | Side c (p1-p1) |");
		System.out.println("---------------------------------------------------");
		System.out.printf("| %-14.5f | %-14.5f | %-14.5f |\n", this.getLengtha(), this.getLengthb(),this.getLengthc());
		System.out.println("---------------------------------------------------");
		System.out.println("| Angle A (b-c)  | Angle B (a-c)  | Angle C (a-b)  |");
		System.out.println("---------------------------------------------------");
		System.out.printf("| %-14.5f | %-14.5f | %-14.5f |\n", this.getAngleA(), this.getAngleB(),this.getAngleC());
		System.out.println("---------------------------------------------------");
		System.out.printf("|    Perimeter   | %-31.6f |\n", this.getPerimeter());
		System.out.println("---------------------------------------------------");
		System.out.printf("|      Area      | %-31.6f |\n", this.getArea());
		System.out.println("---------------------------------------------------");
		
	}
	
}

public class TriangleFinalCalculator {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter the X coordinate of the first point : "  );
		double p1X = input.nextDouble();
		
		System.out.print("\nEnter the Y coordinate of the first point : "  );
		double p1Y = input.nextDouble();
		
		System.out.print("\nEnter the X coordinate of the second point : "  );
		double p2X = input.nextDouble();
		
		System.out.print("\nEnter the Y coordinate of the second point : "  );
		double p2Y = input.nextDouble();
		
		System.out.print("\nEnter the X coordinate of the third point : "  );
		double p3X = input.nextDouble();
		
		System.out.print("\nEnter the Y coordinate of the third point : "  );
		double p3Y = input.nextDouble();
		
		TriangleCalculator triangle = new TriangleCalculator(p1X, p1Y, p2X, p2Y, p3X, p3Y);
		
		triangle.printTriangle();
		
		input.close();
		
		System.exit(0);
	}
	
}


