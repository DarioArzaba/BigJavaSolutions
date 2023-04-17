/*

12.- Why does the following code not succeed in robbing mom’s bank account?

public class BankRobber {
	public static void main(String[] args) {
		BankAccount momsSavings = new BankAccount(1000);
		momsSavings.balance = 0;
	}
}

A. Because balance is a private variable of the BankAccount class that can be accessed only throw the allowed methods or from within the BankAccount class.

*/
