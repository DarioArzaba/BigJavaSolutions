/* 

10.-  A television manufacturer advertises that a television set has a certain size, measured diagonally. You wonder how the set will fit into your living room. Write an algorithm that yields the horizontal and vertical size of the television. Your inputs are the diagonal size and the aspect ratio (the ratio of width to height, usually 16 : 9 for television sets).

A.
	Start by getting the Diagonal Size (D) and the Aspect Ratio as (Width over Height).
	From pythagorean theorem: H^2 + W^2 = D^2
	From aspect ratio: W/H = 16/9
	Let's get the first equation in terms of W by solving H on the second one.
	16H = 9W -> H = ((9W)/(16))
	Substituting H in the first equation
	((9W)/(16))^2 + W^2 = D^2 -> ((81W^2)/(256)) + W^2 = D^2
	((81W^2)/(256)) + ((256W^2)/(256)) = D^2 -> ((337W^2)/(256)) = D^2
	337W^2 = 256D^2 -> W^2 = ((256D^2)/(337)) -> W = sqrt( ((256D^2)/(337)) )
	Substituting the value of D (55 inches)
	W = sqrt( (((256)(55^2))/(337)) ) -> W = 47.93
	Substituting the value of W
	H = ((9W)/(16)) -> H = (((9)(47.93))/(16)) -> H = 26.96
	End by printing the values of W and H.

*/


import java.text.DecimalFormat;

public class ScreenSizeCalculator {
		
	public static void main(String[] args) {
		
		double diagonalSize = 55;
		double width = 16;
		double height = 9;

		double numerator = width * width;
		double denominator = (height * height) + numerator;
		
		double W = Math.sqrt( (((numerator)*(diagonalSize*diagonalSize))/(denominator)) ); 
		double H = ((height*W)/(width));
		
		DecimalFormat WHFormat = new DecimalFormat("##");
		System.out.println("\n\nDiagonal Size : " + diagonalSize);
		System.out.println("Aspect Ratio :  [" + WHFormat.format(width) + ":" + WHFormat.format(height) + "]");
		DecimalFormat newFormat = new DecimalFormat("##.00");
		System.out.println("Width : " + newFormat.format(W));
		System.out.println("Height : " + newFormat.format(H));
		
		System.exit(0);
	}

}

