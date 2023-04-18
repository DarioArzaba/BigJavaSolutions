/* 

8.- Show that the BankAccount(double initialBalance) constructor is not strictly
necessary. That is, if we removed that constructor from the public interface, how could a programmer still obtain BankAccount objects with an arbitrary balance? Conversely, could we keep only the BankAccount(double initialBalance) constructor and remove the BankAccount() constructor?

A.
	//The answer is yes and yes.
	BankAccount account = new BankAccount().deposit(ArbitraryBalance);
	BankAccount account = new BankAccount(0);


*/

