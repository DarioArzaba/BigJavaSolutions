/* 

23.- The getWidth method returns the width of a Rectangle object. What does the following statement print?

	System.out.println(new Rectangle().getWidth());

A. 0.0

*/

import java.awt.Rectangle;

public class GetWidthMethod {
		
	public static void main(String[] args){

		System.out.println("The Width of a newly created Rectangle is " + (new Rectangle().getWidth()));
		System.exit(0);
		
	}

}
