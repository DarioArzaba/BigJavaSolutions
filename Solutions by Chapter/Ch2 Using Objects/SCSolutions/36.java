/* 

36.- Suppose we had called box.translate(25, 15) instead of box.translate(15, 25). What are the expected outputs?

A. 

	x: 30, y: 25

*/

import java.awt.Rectangle;

public class NewMoveTester {
		
	public static void main(String[] args){
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		
		box.translate(25, 15);
		System.out.print("x: ");
		System.out.println(box.getX());
		System.out.print("y: ");
		System.out.println(box.getY());
		System.exit(0);
		
	}

}
