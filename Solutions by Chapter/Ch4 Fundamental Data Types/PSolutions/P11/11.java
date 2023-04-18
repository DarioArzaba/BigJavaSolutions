/* 

11.- A video club wants to reward its best members with a discount based on the member’s number of movie rentals and the number of new members referred by the member. The discount is in percent and is equal to the sum of the rentals and the referrals, but it cannot exceed 75 percent. (Hint: Math.min.) Write a program DiscountCalculator to calculate the value of the discount.

	Enter the number of movie rentals: 56
	Enter the number of members referred to the video club: 3
	The discount is equal to: 59.00 percent.

*/


import java.math.BigDecimal;
import java.util.Scanner;

public class StoreDiscountMovies {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter the Number of Movie Rentals    : ");
		int numMovies = input.nextInt();
		
		System.out.print("\nEnter the Number of Members referred : ");
		int numReferred = input.nextInt();
		
		int discount = Math.min(numMovies + numReferred, 75);
		
		System.out.printf("\nThe discount is equal to : %.2f percent \n", (double)discount);
		
		input.close();
		
		System.exit(0);
	}
	
}



