/*

5.- The CashRegister class has an unfortunate limitation: It is closely tied to the coin system in the United States and Canada. Research the system used in most of Europe. Your goal is to produce a cash register that works with euros and cents. Rather than designing another limited CashRegister implementation for the European market,you should design a separate Coin class and a cash register that can work with coins of all types

*/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//Change the coin system you want to use Dollars or Euros

class CashRegister extends Euros {
	
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
	
	public void addAmountPayment(double amount){
		payment += amount;
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

class Dollars {
	
	public double enterDollars(int dollars){
		return dollars;
	}
	
	public double enterQuarters(int quarters){
		double quartersInDollars = quarters*0.25;
		return quartersInDollars;
	}
	
	public double enterDimes(int dimes){
		double dimesInDollars = dimes*0.10;
		return dimesInDollars;
	}
	
	public double enterNickels(int nickels){
		double nickelsInDollars = nickels*0.05;
		return nickelsInDollars;
	}
	
	public double enterPennies(int pennies){
		double penniesInDollars = pennies*0.01;
		return penniesInDollars;
	}
	
}

class Euros {
	
	public double enterDoubleEuroCoins(int doubleEuro){
		return doubleEuro * 2.0;
	}
	
	public double enterEuroCoins(int euro){
		return euro;
	}
	
	public double enterfifty(int fiftyCents){
		return fiftyCents*0.50;
	}
	
	public double enterTwenty(int twentyCents){
		return twentyCents*0.20;
	}
	
	public double enterTen(int tenCents){
		return tenCents*0.10;
	}
	
	public double enterFive(int fiveCents){
		return fiveCents*0.05;
	}
	
	public double enterTwo(int twoCents){
		return twoCents*0.02;
	}
	
	public double enterCent(int cents){
		return cents*0.01;
	}
	
}

public class CashRegisterEuroAndDollarTester {
	
	public static void main(String[] args){
		
		CashRegister register = new CashRegister();
		
		/*
		register.recordPurchase(20.37);
		register.addAmountPayment(register.enterDollars(20));
		register.addAmountPayment(register.enterQuarters(2));
		System.out.println("Change: " + register.giveChange());
		System.out.println("Expected: 0.13");
		register.reset();
		*/
		
		register.recordPurchase(30.37);
		register.addAmountPayment(register.enterDoubleEuroCoins(10));
		register.addAmountPayment(register.enterEuroCoins(10));
		register.addAmountPayment(register.enterfifty(1));
		System.out.println("Change: " + register.giveChange());
		System.out.println("Expected: 0.13");
		register.reset();
		
		System.exit(0);
		
	}
	
}

