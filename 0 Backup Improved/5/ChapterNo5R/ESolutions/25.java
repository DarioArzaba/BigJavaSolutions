/* 

25.- A supermarket awards coupons depending on how much a customer spends on groceries. For example, if you spend $50, you will get a coupon worth eight percent of that amount. The following table shows the percent used to calculate the coupon awarded for different amounts spent. Write a program that calculates and prints the value of the coupon a person can receive based on groceries purchased. Here is a sample run:

	Please enter the cost of your groceries: 14
	You win a discount coupon of $ 1.12. (8% of your purchase)
	Money Spent Coupon Percentage
	Less than $10 No coupon
	From $10 to $60 8%
	More than $60 to $150 10%
	More than $150 to $210 12%
	More than $210 14%

*/

import java.util.Scanner;

public class DiscountSupermarketAwardCoupons {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the cost of your groceries : " );
		double m = input.nextDouble();
		double discount = 0, porcent = 0;
		
		if (m >= 210.0) {
			porcent = 0.14;
		} else if (m >= 150.0){
			porcent = 0.12;
		} else if (m >= 60.0){
			porcent = 0.10;
		} else if (m >= 10.0){
			porcent = 0.08;
		} else {
			porcent = 0.0;
		}
		
		discount = m * porcent;
		System.out.println("You win a discount coupon of $ " + discount + ". (" + (int)(porcent*100) + "% of your purchase)" );
		
		input.close();
		
		System.exit(0);
		
	}
	
}

