/* 

10.-  Write a program LineDistanceTester that constructs a line joining the points (100, 100) 
	and (200, 200), then constructs points (100, 200), (150, 150), and (250, 50). 
	
	Print the distance from the line to each of the three points, 
	using the ptSegDist method of the Line2D class. 
	Also print the expected values. 
	(Draw a sketch on graph paper to find what values you expect.)

*/

import java.awt.Point;
import java.awt.geom.Line2D;

public class LineDistanceTester {
	
	public static void main(String[] args) {
	
		Point p1 = new Point(100,100);
		Point p2 = new Point(200,200);
		Line2D line = new Line2D.Double(p1,p2);
		Point p3 = new Point(100,200);
		Point p4 = new Point(150,150);
		Point p5 = new Point(250,50);
		System.out.println("Line from (" + line.getX1() + ", " + line.getY1() + ") to (" + line.getX2() + ", " + line.getY2()+ ")");
		System.out.println("Distance to point 1 (" + p3.getX() + ", " + p3.getY() + ") : " + line.ptSegDist(p3));
		System.out.println("Distance to point 2 (" + p4.getX() + ", " + p4.getY() + ") : " + line.ptSegDist(p4));
		System.out.println("Distance to point 3 (" + p5.getX() + ", " + p5.getY() + ") : " + line.ptSegDist(p5));
		System.exit(0);
	
	}
	
}