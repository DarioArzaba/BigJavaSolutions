/* 

9.- Improve the program discussed in How To 4.1 to allow input of quarters in addition to bills.

*/

import java.util.Scanner;

public class VendingMachineImprovement {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final int PENNIES_PER_DOLLAR = 100;
		final int PENNIES_PER_QUARTER = 25;
		int billValue = 0, quarterValue = 0;
		double money;
		
		System.out.print("Enter item price in pennies: ");
		int itemPrice = input.nextInt();
		
		boolean finished = false;
		String option;
		
		while (finished == false){
			
			money = (((double)billValue) + ((double)quarterValue*(PENNIES_PER_QUARTER/100.0)));
			
			System.out.println("\nItem Price : " + (double)itemPrice/PENNIES_PER_DOLLAR);
			System.out.println("Money      : " + money);
			System.out.println("Options");
			System.out.println("a) Enter Bills.");
			System.out.println("b) Enter Quarters.");
			System.out.println("c) Change Item Price.");
			System.out.println("d) Finish and get change.");
			
			
			System.out.print("Enter option : ");
			option = input.next();
			option = option.substring(0,1);
			
			if (option.equals("a")){
				System.out.print("Enter bills : ");
				billValue += input.nextInt();
			} else if (option.equals("b")){
				System.out.print("Enter quarters : ");
				quarterValue += input.nextInt();
			} else if (option.equals("c")){
				System.out.print("Enter item price in pennies: ");
				itemPrice = input.nextInt();
			} else if (option.equals("d")){
				money = (((double)billValue) + ((double)quarterValue*(PENNIES_PER_QUARTER/100.0)));
				if ((double)itemPrice/PENNIES_PER_DOLLAR > money){
					System.out.println("\nError. More money is needed to buy that item.");
				} else {
					finished = true;
				}
			} else {
				System.out.println("\n(" + option + ") is not a valid option. Try again.");
			}
			
		}
		
		// Compute change due
		
		int changeDue = ((PENNIES_PER_DOLLAR * billValue) + (PENNIES_PER_QUARTER * quarterValue)) - itemPrice;
		int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
		changeDue = changeDue % PENNIES_PER_DOLLAR;
		int quarters = changeDue / PENNIES_PER_QUARTER;
		
		// Print change due
		
		System.out.println("\nChange : ");
		System.out.printf("\nDollar coins: %6d", dollarCoins);
		System.out.println();
		System.out.printf("Quarters:     %6d", quarters);
		System.out.println();
		
	}
}

