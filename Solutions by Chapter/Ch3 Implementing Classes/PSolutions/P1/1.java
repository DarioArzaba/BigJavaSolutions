/* 

1.- Enhance the CashRegister class so that it counts the purchased items. Provide a getItemCount method that returns the count.

*/

class CashRegister  {
	
	private double taxRate;
	private double purchase;
	private double taxablePurchase;
	private double payment;
	private int countItems;
	
	/**
	 * Constructs a cash register with no money in it.
	 *
	 * @param rate the tax rate for taxable purchases
	 */
	public CashRegister(double rate) {
		taxRate = rate;
		purchase = 0;
		payment = 0;
		countItems = 0;
	}
	
	/**
	 * Records the sale of a tax-free item.
	 *
	 * @param amount the price of the item
	 */
	public void recordPurchase(double amount) {
		purchase = purchase + amount;
		countItems++;
	}
	
	/**
	 * Records the sale of a taxable item.
	 *
	 * @param amount the price of the item
	 */
	public void recordTaxablePurchase(double amount) {
		taxablePurchase = taxablePurchase + amount;
	}
	
	/**
	 * Processes a payment received from the customer.
	 *
	 * @param amount the amount of the payment
	 */
	public void receivePayment(double amount) {
		payment = payment + amount;
	}
	
	/**
	 * Processes the sales tax due.
	 *
	 * @return the sales tax due
	 */
	public double getSalesTax() {
		return taxablePurchase * taxRate / 100;
	}
	
	/**
	 * Counts numbers of items purchased.
	 *
	 * @return number of items
	 */
	public int getItemCount()  {
		return countItems;
	}
	
	/**
	 * Computes the change due and resets the machine for the next customer.
	 *
	 * @return the change due to the customer
	 */
	public double giveChange() {
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
	
}
