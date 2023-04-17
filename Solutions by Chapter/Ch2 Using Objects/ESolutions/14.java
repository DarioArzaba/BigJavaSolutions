/* 

14.- Look at the API of the Point class and find out how to construct a Point object. In a PointTester program, construct two points with coordinates (3, 4) and (–3, –4). Find the distance between them, using the distance method. Print the distance, as well as the expected value. (Draw a sketch on graph paper to find the value you will expect.)

*/

import java.awt.Point;

public class PointTester {

	public static void main(String[] args) {
		
		Point firstPoint = new Point(3, 4);
		Point secondPoint = new Point(-3, -4);
		System.out.println("The distance is: " + firstPoint.distance(secondPoint));
		double res1= Math.abs((firstPoint.getX()-secondPoint.getX()));
		double res2= Math.abs((firstPoint.getY()-secondPoint.getY()));
		System.out.println("Expected Distance Method One: " +  Math.sqrt((res1*res1)+(res2*res2)));
		System.out.println("Expected Distance Method Two: " +  Math.hypot(res1,res2));
		System.exit(0);
		
	}
}
