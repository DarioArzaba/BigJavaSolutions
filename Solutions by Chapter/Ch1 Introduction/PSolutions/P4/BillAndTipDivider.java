/* 

4.- Imagine that you and a number of friends go to a luxury restaurant, and when you ask for the bill 
	you want to split the amount and the tip (15 percent) between all. 
	Write pseudocode for calculating the amount of money that everyone has to pay. 
	Your program should print the amount of the bill, the tip, the total cost, and the amount each person has to pay. 
	It should also print how much of what each person pays is for the bill and how much is for the tip.

A.
	Start
		Input friendsNumber
		Input bill
		Input tipPercent
		tip = (bill*(tipPercent/100))
		billPerFriend = bill/friendsNumber
		tipPerFriend = tip/friendsNumber
		totalCost = bill + tip
		totalCostPerFriend = totalCost/friendsNumber
		Print "Total Bill: " + bill
		Print "Total Tip: " + tip
		Print "Total Cost: " + totalCost
		Print "Total Bill per Friend: " + billPerFriend
		Print "Total Tip per Friend: " + tipPerFriend
		Print "Total per Friend: " + totalCostPerFriend
	End

*/

public class BillAndTipDivider {
	
	public static void main(String[] args){
		
		int friendsNumber = 7;
		double bill = 1562.49;
		double tipPercent = 15;
		
		double tip = (bill*(tipPercent/100));		
		double billPerFriend = (bill/friendsNumber);
		double tipPerFriend = (tip/friendsNumber);
		double totalCost = bill + tip;
		double totalPerFriend = (totalCost/friendsNumber);
		
		System.out.println("Total Bill: " + bill);
		System.out.println("Total Tip: " + tip);
		System.out.println("Total Cost: " + totalCost);
		System.out.println("Total Bill Per Friend: " + billPerFriend);
		System.out.println("Total Tip Per Friend: " + tipPerFriend);
		System.out.println("Total Per Friend: " + totalPerFriend);
		System.exit(0);
		
	}
	
}

