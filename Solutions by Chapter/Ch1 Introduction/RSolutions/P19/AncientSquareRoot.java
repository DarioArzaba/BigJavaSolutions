/* 

19.- The ancient Babylonians had an algorithm for determining the square root of a number (a). Start with an initial guess of (a / 2). Then find the average of your guess (g) and (a/g). That’s your next guess. Repeat until two consecutive guesses are close enough. Write the pseudocode for this algorithm.

A.  

	Start by getting (a)
	Define (g1) as (a/2)
	Define (g2) as ((g1+(a/g1))/2)
	Repeat until g1 and g2 are close enough:
		Save the last value of g2 in g1
		Redefine g2 as ((g1+(a/g1))/2);
	End by returning (g2)

*/

public class AncientSquareRoot {
	
	public static void main(String[] args){
		
		double number = 140;
		double firstGuess = 0;
		double secondGuess = 0;
		
		firstGuess = (number / 2);
		secondGuess = (((firstGuess)+(number/firstGuess))/(2));
		
		while ( (firstGuess-secondGuess) > 0.001){
			firstGuess = secondGuess;
			secondGuess = (((firstGuess)+(number/firstGuess))/(2));
		}		
		
		System.out.println("The square root of " + number + " is approximately: " + secondGuess);
		System.exit(0);
	}
	
}

