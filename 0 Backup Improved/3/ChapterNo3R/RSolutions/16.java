/* 

16.- Consider the following implementation of a class Square:

public class Square {
	
	private int sideLength;
	private int area;
	
	public Square(int initialLength) {
		sideLength = initialLength;
		area = sideLength * sideLength;
	}

	public int getArea() { return area; }

	public void grow() { sideLength = 2 * sideLength; }
}

What error does this class have? How would you fix it?

A.

public class Square {
	
	private int sideLength;
	
	public Square(int initialLength) {
		sideLength = initialLength;
	}
	
	public int getArea() {
		int area = sideLength * sideLength;
		return area;
	}
	
	public void grow() {
		sideLength = 2 * sideLength;
	}

}

*/



