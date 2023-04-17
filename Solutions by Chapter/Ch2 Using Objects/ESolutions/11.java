/* 

11.- Apply the darker method of the Color class twice to the object Color.RED. Call your class DarkerDemo.

*/

import java.awt.Color;

public class DarkerDemo {

	public static void main(String[] args) {

		Color colorTest = Color.RED;
		colorTest = colorTest.darker();
		colorTest = colorTest.darker();
		System.out.println("Output Color: " + colorTest);
		System.exit(0);
		
	}

}
