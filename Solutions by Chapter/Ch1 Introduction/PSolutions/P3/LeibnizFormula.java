/* 

3.- The value of Pi can be computed according to the Leibniz formula for Pi. 
	Write an algorithm to compute Pi. 
	Because the formula is an infinite series and an algorithm must stop after a finite number of steps, 
	you should stop when you have the result determined to six significant digits.

A.

	Start by defining the Denominator equal to 1.
	Define the Result equal to 0.
	Repeat unit you get the first 6 significant digits of Pi:
		If the iteration is even
			Redefine de result as the result plus 1 over the denominator
		Else if the iteration is odd
			Redefine de result as the result minus 1 over the denominator
		Add 2 to the denominator
	Multiply the result by 4
	End by returning the value of the Final Result.

*/

import java.text.DecimalFormat;

public class LeibnizFormula {
	
	public static void main(String[] args){
		
		double denominator = 1;
		double result = 0;
		
		int counter = 10000000;
		for (int i = 0; i < counter; i++) {
			if ((i % 2) == (0)){
				result += (1/denominator);
			} else {
				result -= (1/denominator);
			}
			denominator += 2;
		}
		result *= 4;
		
		DecimalFormat newFormat = new DecimalFormat("##.000000");
		System.out.println("The approximate value of Pi is: " + newFormat.format(result));		
		System.exit(0);
		
	}
		
}

