/* 

1.- Write a program that displays the dimensions of a letter-size (8.5 × 11 inches) sheet of paper in millimeters. There are 25.4 millimeters per inch. Use constants and comments in your program.

*/

import java.text.DecimalFormat;

public class LetterPaperDimensionsPrinter {
	
	static final double INCH = 25.4;
	
	public static void main(String[] args) {
		
		DecimalFormat f = new DecimalFormat("000.###");
		double paperWidth = 8.5 * INCH;
		double paperLenght = 11.0 * INCH;
		
		System.out.println("Letter - Size : 8.5 x 11 inches");
		System.out.println("Letter - Size : " + f.format(paperWidth) + " x " + f.format(paperLenght) + " millimeters");
		
		System.exit(0);
		
	}
	
}
