/* 

2.- Write a program that computes and displays the perimeter of a letter-size (8.5 × 11 inches) sheet of paper and the length of its diagonal.

*/

import java.text.DecimalFormat;

public class LetterPaperPerimeterPrinter {
	
	static final double INCH = 25.4;
	
	public static void main(String[] args) {
		
		DecimalFormat f = new DecimalFormat("000.###");
		double paperWidth = 8.5 * INCH;
		double paperLenght = 11.0 * INCH;
		double perimeter = (paperLenght*2) + (paperLenght*2);
		
		System.out.println("Letter - Size : 8.5 x 11 inches");
		System.out.println("Letter - Size : " + f.format(paperWidth) + " x " + f.format(paperLenght) + " millimeters");
		System.out.println("Perimeter     : " + f.format(perimeter) + " millimeters");
		
		System.exit(0);
		
	}
	
}


