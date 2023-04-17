/* 

2.- Write a program that computes taxes for the following schedule.
	
	If your status is Single and
	if the taxable income is over 		but not over 		the tax is 			of the amount over
	$0 									$8,000 				10% 				$0
	$8,000  							$32,000 			$800 + 15% 			$8,000
	$32,000  												$4,400 + 25% 		$32,000
	
	If your status is Married and
	if the taxable income is over 		but not over 		the tax is 			of the amount over
	$0 									$16,000 			10% 				$0
	$16,000 							$64,000 			$1,600 + 15% 		$16,000
	$64,000 												$8,800 + 25% 		$64,000

*/

import java.util.Scanner;

public class TaxComputeSchedule {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Are you single or married (s/m): " );
		String status = input.next();
		status = status.toLowerCase();
		
		System.out.print("Enter you income : " );
		double income = input.nextDouble();
		
		double tax = 0;
		boolean error = false;
		
		if (status.substring(0,1).equals("s")){
			
			if (income >= 32000){
				tax = (4400) + ((income)*(0.25));
			} else if (income >= 8000){
				tax = (800) + ((income)*(0.15));
			} else if (income >= 0){
				tax = ((income)*(0.1));
			} else {
				System.out.println("Error. The income cannot be negative." );
				error = true;
			}
			
		} else if (status.substring(0,1).equals("m")){
			
			if (income >= 64000){
				tax = (8800) + ((income)*(0.25));
			} else if (income >= 16000){
				tax = (1600) + ((income)*(0.15));
			} else if (income >= 0){
				tax = ((income)*(0.1));
			} else {
				System.out.println("Error. The income cannot be negative." );
				error = true;
			}
			
		} else {
			System.out.println("Error. Invalid marital status." );
			error = true;
		}
		
		if (!error){
			System.out.println("Tax: " + tax);
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}

