/* 

6.- Write a program LotteryPrinter that picks a combination in a lottery. 
	In this lottery, players can choose 6 numbers (possibly repeated) between 1 and 49. 
	Construct an object of the Random class (see Exercise E2.12) 
	and invoke an appropriate method to generate each number. 
	(In a real lottery, repetitions aren’t allowed, 
	but we haven’t yet discussed the programming constructs that would be required 
	to deal with that problem.) 
	
	Your program should print out a sentence such as 
	“Play this combination— it’ll make you rich!”, 
	followed by a lottery combination.

*/

import java.util.Random;

public class LotteryPrinter {
	
	public static void main(String[] args) {
	
		Random lottery = new Random();
		int lotteryNumber = ( lottery.nextInt(49) + 1 );
		System.out.println("\nPlay this combination it’ll make you rich!\n");
		for (int i = 0; i < 5 ; i++ ) {
			System.out.print(lotteryNumber + "-");
			lotteryNumber = ( lottery.nextInt(49) + 1 );
			if (i == 4){
				System.out.print(lotteryNumber + "\n\n");
			}
		}
		System.exit(0);
	
	}

}

