/* 

1.- Supply the body of a method: public void unclick(), that undoes an unwanted button click.

*/

class Counter {
	
	private int value = 0;
	
	public int getValue() {
		return value;
	}
	
	public void click() {
		value = value + 1;
	}
	
	public void reset() {
		value = 0;
	}
	
	public void undo(){
		value = Math.max((value-1), 0);
	}
	
	public void unclick() {
		value = value - 1;
	}
	
}

public class CounterUndoTest {
	
	public static void main(String[] args){
		
		Counter counterObj =  new Counter();
		counterObj.click();
		counterObj.click();
		counterObj.unclick();
		System.out.println("Clicks: " + counterObj.getValue());
		
		System.exit(0);
		
	}
	
}
/* 

10. Why is the following documentation comment questionable?

	Each account has an account number.
	@return the account number of this account

	public int getAccountNumber();
	
A. Because the first sentence doesn't describe what the method does, instead it describes the variable that the getter method is returning.

*/
/*

11.- Suppose we modify the BankAccount class so that each bank account has an account number. How does this change affect the instance variables?

A. We added:
	
	private int accountNumber

To the fields of the class.

*/


class BankAccount {
	
	private double balance;
	private int accountNumber;
	
	public BankAccount() {
		balance = 0;
		accountNumber = 0;
	}
	
	/**
	 Constructs a new bank account with a given initial balance.
	 
	 @param accountNumber the account number for this account
	 @param initialBalance the initial balance for this account
	 */
	public BankAccount(double initialBalance, int account) {
		balance = initialBalance;
		accountNumber = account
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAccountNumber() {
		return accountNumber;
	}
	
}
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
/* 

13.- The Rectangle class has four instance variables: x, y, width, and height. Give a possible implementation of the getWidth method.

A. Fallowing the standard way to implement getter methods:

	public int getWidth() {
		return width;
	}

*/
/* 

14.- Give a possible implementation of the translate method of the Rectangle class.

A. There are multiple implementations, one would be:

	public void translate(int dx, int dy) {
		int newx = this.x + dx;
		this.x = newx;
		int newy = this.y + dy;
		this.y = newy;
	}


But the real one is:

	public void translate(int dx, int dy) {
	
			int oldv = this.x;
			int newv = oldv + dx;
	
			//Allow to move leftward if it does not negative overflow
			if (dx < 0) {
				if (newv > oldv) {
					if (width >= 0) {
						width += newv - Integer.MIN_VALUE;
					}
					newv = Integer.MIN_VALUE;
				}
			} else {
				// Move Rightward or staying still if positive overflow
				if (newv < oldv) {
					if (width >= 0) {
						width += newv - Integer.MAX_VALUE;
						if (width < 0) width = Integer.MAX_VALUE;
					}
					newv = Integer.MAX_VALUE;
				}
			}
			
			this.x = newv;
	
			oldv = this.y;
			newv = oldv + dy;
			
			//Allow to move upward if it does not negative overflow
			if (dy < 0) {
				if (newv > oldv) {
					if (height >= 0) {
						height += newv - Integer.MIN_VALUE;
					}
					newv = Integer.MIN_VALUE;
				}
			} else {
				// Move Rightward or staying still if positive overflow
				if (newv < oldv) {
					if (height >= 0) {
						height += newv - Integer.MAX_VALUE;
						if (height < 0) height = Integer.MAX_VALUE;
					}
					newv = Integer.MAX_VALUE;
				}
			}
			
			this.y = newv;
		
		}

*/

/* 

15.- When you run the BankAccountTester program, how many objects of class BankAccount are constructed? How many objects of type BankAccountTester?

A. Just one BankAccount object, there are no obects of BankAccountTester since the purpouse of this object is merely to hold the main method as the access point of excecution.

*/
/* 

16.- Why is the BankAccountTester class unnecessary in development environments that allow interactive testing, such as BlueJ?

A. In development environments one can issue interactive commands to contruct BankAccount objects, invoke its methods and display their return values. Furthermore this commands can be specified in unit test files.

*/
/* 

17.- Consider a Car class that simulates fuel consumption in a car. We will assume a fixed efficiency (in miles per gallon) that is supplied in the constructor. There are methods for adding gas, driving a given distance, and checking the amount of gas left in the tank. Make a card for a Car object, choosing suitable instance variables and showing their values after the object was constructed.

A. This is called tracing an object, in this case it would be:

	Car myCar //Trace of myCar object
	Car(mpg) //Construct myCar object with efficiency in mpg
	addGas(amount) //Add a certain amount of gas in gallons.
	drive(distance) //Drive for a certain distance in miles.
	getGasLeft() //Returns the gas left in the tank in gallons.

	The object starts with two instance variables:
		gasLeft = 0;
		milesPerGallon = 25;

*/
/* 

18.- Trace the following method calls for the Car Efficiency class:

	Car myCar = new Car(25);
	myCar.addGas(20);
	myCar.drive(100);
	myCar.drive(200);
	myCar.addGas(5);

A. This would affect the instance variables in the fallowing way after each statement:

	milesPerGallon = 25; gasLeft = 0;
	gasLeft = 20;
	gasLeft = 16;
	gasLeft = 8;
	gasLeft = 13;
	
*/



/* 

19.- Suppose you are asked to simulate the odometer of the car, by adding a method getMilesDriven. Add an instance variable to the object’s card that is suitable for computing this method’s result.

A. We would add the instance variable:

	gasLeft = 0;
	milesPerGallon = 25;
	totalMiles = 0;

*/



/* 

2.- Suppose you use a class Clock with private instance variables hours and minutes. How can you access these variables in your program?

A. You should access private variables of a class only by the access methods of its instance object.

*/

/* 

20.- Trace the methods of Self Check 18, updating the instance variable that you added in Self Check 19

	milesPerGallon = 25; gasLeft = 0; totalMiles = 0;
	gasLeft = 20;
	gasLeft = 16; totalMiles = 100;
	gasLeft = 8; totalMiles = 300;
	gasLeft = 13;

*/



/* 

21.- What do local variables and parameter variables have in common? In which essential aspect do they differ?

A. Variables of both categories are related to the methods of a class. Both are created and used each time a method is called, and both cease to exist when the method exits. Parameter variables are initialized automatically with the values supplied as arguments from where the method was originally called. Local variables are inside methods and need to be initialized explicitly.

*/
/* 

22.- Why was it necessary to introduce the local variable change in the giveChange method? That is, why didn’t the method simply end with the statement return payment - purchase;

A. Because after computing the change, the payment and purchase were reset to zero. So doing the computation in the return statement would have returned zero each time.

*/
/* 

23.- Consider a CashRegister object reg1 whose payment instance variable has the value 20 and whose purchase instance variable has the value 19.5. Trace the call reg1.giveChange(). Include the local variable change. Draw an X in its column when the variable ceases to exist.

A.

	reg1.payment = 20; reg1.purchase = 19.5; change = 0;
	reg1.giveChange();
	change = 0.5;
	reg1.payment = 0; reg1.purchase = 0;
	

*/
/* 

24.- How many implicit and explicit parameters does the withdraw method of the BankAccount class have, and what are their names and types?

	public void withdraw(double amount) {
		balance = balance - amount;
	}

A. One implicit parameter balance double and one explicit parameter called amount double.

*/
/* 

25.- In the deposit method, what is the meaning of this.amount? Or, if the expression
has no meaning, why not?

	public void deposit(double amount) {
		balance = balance + this.amount;
	}

A. It is not a legal expression since the class does not specify an instance variable named amount, the only variable with this identifier is the parameter variable of the method.

*/
/* 

26.- How many implicit and explicit parameters does the main method of the BankAccountTester class have, and what are they called?

A. The main method does not invoke any parameter of the class so no implicit parameter, and one explicit parameter called args.

*/
/* 

27.- Which class needs to be modified to have the two cars positioned next to each other?

A. The CarComponent since this is the part that holds the Car information of every Car component of the drawing.

*/
/* 

28.- Which class needs to be modified to have the car tires painted in black, and what modification do you need to make?

A. Inside the draw method of the Car component class we need to add the fallowing statements:

	g2.fill(frontTire);
	g2.fill(rearTire);

*/
/* 

29.- How do you make the cars twice as big?

A. We double the measurements of the Car component class constructor.

*/
/* 

3.- Consider the Counter class. A counter’s value starts at 0 and is advanced by the click method, so it should never be negative. Suppose you found a negative value variable during testing. Where would you look for the error?

A. Since access to the priave "value" variable is only possible through methods, I would only search the methods that modify or access that variable.

*/
/* 

4.- In Chapters 1 and 2, you used System.out as a black box to cause output to appear on the screen. Who designed and implemented System.out?

A. The programmers who designed and implemented the Java Library. Specifically the PrintStream class in the java.io package.

*/

/* 

5.- Suppose you are working in a company that produces personal finance software. You are asked to design and implement a class for representing bank accounts. Who will be the users of your class?

a. Other programmers that are also developing the software. The software as a hole that the company sells is the one that will be presented to the personal finance software consumer.

*/
/* 

6.- How can you use the methods of the public interface to empty the harrysChecking bank account?

*/

class BankAccount {
	
	private double balance;
	
	public BankAccount() {
		balance = 0;
	}
	
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public double getBalance() {
		return balance;
	}
	
}

public class WithdrawFromBankAccountBalance {
	
	public static void main(String[] args){
		
		BankAccount harrysChecking = new BankAccount(1000);
		
		harrysChecking.withdraw(harrysChecking.getBalance());
		
		System.out.println("Harrys Balance: " + harrysChecking.getBalance());
		
		System.exit(0);
		
	}
	
}

/* 

7.- What is wrong with this sequence of statements?

BankAccount harrysChecking = new BankAccount(10000);
System.out.println(harrysChecking.withdraw(500));

A. The withdraw method clearly takes away money from the private "value" variable of every bank account but it does not return the new value. The problem here is that the method println expects a String for its argument but instead it gets nothing (void) in return from the withdraw method. To obtain the new balance after the withdrawal you would need to use the getBalance method.

*/
/* 

8.- Suppose you want a more powerful bank account abstraction that keeps track of an account number in addition to the balance. How would you change the public interface to accommodate this enhancement?

*/

class BankAccount {
	
	private double balance;
	private int accountNumber;
	
	public BankAccount() {
		balance = 0;
		accountNumber = 0;
	}
	
	public BankAccount(double initialBalance, int account) {
		balance = initialBalance;
		accountNumber = account
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAccountNumber() {
		return accountNumber;
	}
	
}
/* 

9.- Suppose we enhance the BankAccount class so that each account has an account number. Supply a documentation comment for the constructor public BankAccount(int accountNumber, double initialBalance).

*/

class BankAccount {
	
	private double balance;
	private int accountNumber;
	
	public BankAccount() {
		balance = 0;
		accountNumber = 0;
	}
	
	/**
	 Constructs a new bank account with a given initial balance.
	 
	 @param accountNumber the account number for this account
	 @param initialBalance the initial balance for this account
	 */
	public BankAccount(double initialBalance, int account) {
		balance = initialBalance;
		accountNumber = account
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAccountNumber() {
		return accountNumber;
	}
	
}
