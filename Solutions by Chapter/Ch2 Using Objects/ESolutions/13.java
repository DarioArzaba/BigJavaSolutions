/* 

13.- Write a program RandomPrice that prints a random price between $10.00 and $19.95 every time the program is run.

*/

import java.text.DecimalFormat;
import java.util.Random;

public class RandomPrice {

	public static void main(String[] args) {
		
		Random price = new Random();
		double min = 10.0;
		double max = 19.95;
		double randomPrice = min+(price.nextDouble()*(max-min));
		DecimalFormat f = new DecimalFormat("##.00");
		System.out.println("Random Price : $" + f.format(randomPrice) );
		System.exit(0);
		
	}

}
