/* 

12.- The Random class implements a random number generator, which produces sequences of numbers that appear to be random. 
	To generate random integers, you construct an object of the Random class, and then apply the nextInt method. 
	For example, the call generator.nextInt(6) gives you a random number between 0 and 5. 
	Write a program DieSimulator that uses the Random class to simulate the cast of a die, 
	printing a random number between 1 and 6 every time that the program is run.

*/

import java.util.Random;

public class RandomDice {
	public static void main(String[] args) {
		Random dice = new Random();
		System.out.println("The dice was rolled: " + ( 1 + dice.nextInt(6) ));
		System.exit(0);
	}
}
