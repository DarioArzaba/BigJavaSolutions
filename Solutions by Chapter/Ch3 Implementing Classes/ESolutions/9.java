/* 

9.- Add a method printReceipt to the CashRegister class. The method should print the prices of all purchased items and the total amount due. Hint: You will need to form a string of all prices. Use the concat method of the String class to add additional items to that string. To turn a price into a string, use the call String.valueOf(price).

*/

class CashRegister {
	
	private double taxRate, taxablePurchase, payment, purchase;
	private String receipt;
	
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
		purchase += amount;
		receipt = receipt.concat("$" + amount + "\n");
	}
	
	public void recordTaxablePurchase(double amount) {
		double taxAmount = (amount * taxRate / 100);
		double taxTotalPurchase = taxAmount + amount;
		taxablePurchase += taxTotalPurchase;
		receipt = receipt.concat("$" + amount + " + %" + taxRate + " = $" + taxTotalPurchase + "\n");
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

	public double giveChange() {
		double change;
		if (payment >= this.getSalesTotal()) {
			change = payment - this.getSalesTotal();	
		} else {
			change = 0;
		}
		purchase = 0;
		payment = 0;
		return change;
	}
	
	public String getReceipt() {
		String totalReceipt = receipt 
				+ "Total: $" + this.getSalesTotal() 
				+ "\nPayment: $" + this.getPaymentTotal() 
				+ "\nChange: $" + this.giveChange();
		return totalReceipt;
	}
	
}

public class CashRegisterTest {
	
	public static void main(String[] args){
		
		CashRegister register = new CashRegister();
		
		register.recordPurchase(100);
		register.setTaxrate(10);
		register.recordTaxablePurchase(130);
		register.recordPurchase(13);
		register.recordTaxablePurchase(60);
		register.receivePayment(500);
		System.out.println(register.getReceipt());
		
		System.exit(0);
	}

}
