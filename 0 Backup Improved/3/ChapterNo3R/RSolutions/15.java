/* 

15.- Consider the following implementation of a class Square:

public class Square {

	private int sideLength;
	
	private int area; // Not a good idea
	
	public Square(int length) {
		sideLength = length;
	}
	
	public int getArea() {
		area = sideLength * sideLength;
		return area;
	}
	
}

Why is it not a good idea to introduce an instance variable for the area? Rewrite the class so that area is a local variable.

A.

	public class Square {
		private int sideLength;
		public Square(int length) {
			sideLength = length;
		}
		public int getArea() {
			int area = sideLength * sideLength;
			return area;
		}
	}

*/



