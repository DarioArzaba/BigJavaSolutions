/* 

9.- Giving change. Implement a program that directs a cashier how to give change. The program has

	Two inputs: the amount due and the amount received from the customer.
	Display the dollars, quarters, dimes, nickels, and pennies

that the customer should receive in return. In order to avoid roundoff errors, the program user should supply both amounts in pennies, for example 274 instead of 2.74.

*/


import java.util.Scanner;

public class ChangeGiverInCoinsSimulator {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter Amount of Money Due in Pennies      : ");
		int due = input.nextInt();
		
		System.out.print("\nEnter Amount of Money Received in Pennies : ");
		int received = input.nextInt();
		
		int change = received - due;
		
		int dollars = (change / 100);
		
		int quarters = (change - (dollars*100)) / 25;
		
		int dimes = (change - (dollars*100) - (quarters*25)) / 10;
		
		//NICKELS WILL ALWAYS BE ZERO :-/ ?
		
		int nickels = (change - (dollars*100) - (quarters*25) - (dimes*10)) / 5;
		
		int pennies = (change - (dollars*100) - (quarters*25) - (dimes*10) - (nickels*5)) / 1;
		
		System.out.println("\nCHANGE");
		System.out.printf("\nDollars  : %d", dollars);
		System.out.printf("\nQuarters : %d", quarters);
		System.out.printf("\nDimes    : %d", dimes);
		System.out.printf("\nNickels  : %d", nickels);
		System.out.printf("\nPennies  : %d", pennies);
		
		input.close();
		
		System.exit(0);
		
	}
	
}
