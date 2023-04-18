/* 

9.- In the Java library, a color is specified by its red, green, and blue components between 0 and 255. 
	Write a program BrighterDemo that constructs a Color object with red, green, and blue values of 50, 100, and 150. 
	Then apply the brighter method of the Color class and print the red, green, and blue values of the resulting color.

*/

import java.awt.Color;

public class BrighterDemo {
	public static void main(String[] args) {
		Color colorTest = new Color(50,100,150);
		colorTest = colorTest.brighter();
		System.out.println("Output Color: " + colorTest);
		System.exit(0);
	}
}
