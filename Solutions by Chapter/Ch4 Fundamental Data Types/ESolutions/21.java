/* 

21.- Enhance the CashRegister class by adding separate methods enterDollars, enterQuarters, enterDimes, enterNickels, and enterPennies.

Use this tester class:
public class CashRegisterTester
{
	public static void main (String[] args)
	{
		CashRegister register = new CashRegister();
		register.recordPurchase(20.37);
		register.enterDollars(20);
		register.enterQuarters(2);
		System.out.println("Change: " + register.giveChange());
		System.out.println("Expected: 0.13");
	}
}

*/

import java.math.BigDecimal;
import java.math.RoundingMode;

class CashRegister {
	
	private double taxRate, taxablePurchase, payment, purchase;
	private String receipt;
	private int numPurchase, numDay = 1;
	
	CashRegister() {
		taxRate = 0;
		purchase = 0;
		payment = 0;
		receipt = "";
	}
	
	CashRegister(double rate) {
		taxRate = rate;
		purchase = 0;
		payment = 0;
		receipt = "";
	}
	
	public void recordPurchase(double amount) {
		numPurchase++;
		purchase += amount;
		receipt = receipt.concat("Item " + numPurchase + ": $" + amount + "\n");
	}
	
	public void recordTaxablePurchase(double amount) {
		numPurchase++;
		double taxAmount = (amount * taxRate / 100);
		double taxTotalPurchase = taxAmount + amount;
		taxablePurchase += taxTotalPurchase;
		receipt = receipt.concat("Item " + numPurchase + ": $" + amount + " + %" + taxRate + " = $" + taxTotalPurchase + "\n");
	}
	
	public void receivePayment(double amount) {
		payment += amount;
	}
	
	public void enterDollars(int dollars){
		payment += dollars;
	}
	
	public void enterQuarters(int quarters){
		double quartersInDollars = quarters*0.25;
		payment += quartersInDollars;
	}
	
	public void enterDimes(int dimes){
		double dimesInDollars = dimes*0.10;
		payment += dimesInDollars;
	}
	
	public void enterNickels(int nickels){
		double nickelsInDollars = nickels*0.05;
		payment += nickelsInDollars;
	}
	
	public void enterPennies(int pennies){
		double penniesInDollars = pennies*0.01;
		payment += penniesInDollars;
	}
	
	public void setTaxrate(double rate) {
		taxRate = rate;
	}
	
	public double getSalesTotal() {
		return purchase + taxablePurchase;
	}
	
	public double getPaymentTotal() {
		return payment;
	}
	
	public int getSalesCount() {
		return numPurchase;
	}
	
	public void reset() {
		taxRate = 0;
		taxablePurchase = 0;
		purchase = 0;
		payment = 0;
		receipt = "";
		numPurchase = 0;
		numDay++;
	}
	
	public double giveChange() {
		double change;
		if (payment >= this.getSalesTotal()) {
			change = payment - this.getSalesTotal();
		} else {
			change = 0;
		}
		purchase = 0;
		payment = 0;
		
		change = new BigDecimal(change).setScale(2, RoundingMode.HALF_UP).doubleValue();
		
		return change;
	}
	
	public String getReceipt() {
		String totalReceipt = "Day Number: " + numDay + "\n" + receipt
				+ "Total: $" + this.getSalesTotal()
				+ "\nPayment: $" + this.getPaymentTotal()
				+ "\nChange: $" + this.giveChange();
		return totalReceipt;
	}
	
}

public class CashRegisterTester {
	
	public static void main(String[] args){
		
		CashRegister register = new CashRegister();
		register.recordPurchase(20.37);
		register.enterDollars(20);
		register.enterQuarters(2);
		System.out.println("Change: " + register.giveChange());
		System.out.println("Expected: 0.13");
		
		System.exit(0);
		
	}
	
}