/* 

10.- After closing time, the store manager would like to know how much business was transacted during the day. Modify the CashRegister class to enable this functionality. Supply methods getSalesTotal and getSalesCount to get the total amount of all sales and the number of sales. Supply a method reset that resets any counters and totals so that the next day’s sales start from zero.

*/

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
		System.out.println("Number of Sales: "+ register.getSalesCount() + "\n");
		
		register.reset();
		register.recordTaxablePurchase(130);
		register.receivePayment(140);
		System.out.println(register.getReceipt());
		System.out.println("Number of Sales: "+ register.getSalesCount());
		
		System.exit(0);
	}

}