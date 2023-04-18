/* 

13.- What does the following method do? Give an example of how you can call the method.

public class BankAccount {

	public void mystery(BankAccount that, double amount) {
		this.balance = this.balance - amount;
		that.balance = that.balance + amount;
	}
	
}

A. It diminishes, by a certain amount, the money on (This) account balance and adds the same amount to another.

	accountObj.mystery(anotherAccountObj, 10.5);

*/
