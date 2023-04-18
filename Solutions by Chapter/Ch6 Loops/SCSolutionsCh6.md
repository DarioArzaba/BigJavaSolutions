 

1. How many years does it take for the investment to triple? Modify the program and run it.

* The investment tripled after 23 years.



class Investment {
	
	private double balance;
	private double rate;
	private int year;

	public Investment(double aBalance, double aRate) { balance = aBalance;
		rate = aRate;
		year = 0;
	}
	
	public void waitForBalance(double targetBalance) {
		while (balance < targetBalance) {
			year++;
			double interest = balance * rate / 100;
			balance = balance + interest;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	public int getYears() {
		return year;
	}
}

public class InvestmentRunner {
	public static void main(String[] args) {
		final double INITIAL_BALANCE = 10000;
		final double RATE = 5;
		Investment invest = new Investment(INITIAL_BALANCE, RATE);
		invest.waitForBalance(3 * INITIAL_BALANCE);
		int years = invest.getYears();
		System.out.println("The investment tripled after " + years + " years");
	}
}

 

 

2. If the interest rate is 10 percent per year, how many years does it take for the investment to double? Modify the program and run it.

* The investment doubled after 8 years



class Investment {
	
	private double balance;
	private double rate;
	private int year;
	
	public Investment(double aBalance, double aRate) { balance = aBalance;
		rate = aRate;
		year = 0;
	}
	
	public void waitForBalance(double targetBalance) {
		while (balance < targetBalance) {
			year++;
			double interest = balance * rate / 100;
			balance = balance + interest;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	public int getYears() {
		return year;
	}
}

public class InvestmentRunner {
	public static void main(String[] args) {
		final double INITIAL_BALANCE = 10000;
		final double RATE = 10;
		Investment invest = new Investment(INITIAL_BALANCE, RATE);
		invest.waitForBalance(2 * INITIAL_BALANCE);
		int years = invest.getYears();
		System.out.println("The investment doubled after " + years + " years");
	}
}



3. Modify the program so that the balance after each year is printed. How did you do that?



class Investment {
	
	private double balance;
	private double rate;
	private int year;
	
	public Investment(double aBalance, double aRate) { balance = aBalance;
		rate = aRate;
		year = 0;
	}
	
	public void waitForBalance(double targetBalance) {
		while (balance < targetBalance) {
			year++;
			double interest = balance * rate / 100;
			balance = balance + interest;
			System.out.println(balance);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	public int getYears() {
		return year;
	}
}

public class InvestmentRunner {
	public static void main(String[] args) {
		final double INITIAL_BALANCE = 10000;
		final double RATE = 5;
		Investment invest = new Investment(INITIAL_BALANCE, RATE);
		invest.waitForBalance(2 * INITIAL_BALANCE);
		int years = invest.getYears();
		System.out.println("The investment doubled after " + years + " years");
	}
}
 


4. Suppose we change the program so that the condition of the while loop is

	while (balance <= targetBalance)

What is the effect on the program? Why?

* The program prints the same output. Because the balance after 14 years is slightly below $20,000. And after 15 years, it is slightly above $20,000.



class Investment {
	
	private double balance;
	private double rate;
	private int year;
	
	public Investment(double aBalance, double aRate) { balance = aBalance;
		rate = aRate;
		year = 0;
	}
	
	public void waitForBalance(double targetBalance) {
		while (balance <= targetBalance) {
			year++;
			double interest = balance * rate / 100;
			balance = balance + interest;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	public int getYears() {
		return year;
	}
}

public class InvestmentRunner {
	public static void main(String[] args) {
		final double INITIAL_BALANCE = 10000;
		final double RATE = 5;
		Investment invest = new Investment(INITIAL_BALANCE, RATE);
		invest.waitForBalance(3 * INITIAL_BALANCE);
		int years = invest.getYears();
		System.out.println("The investment tripled after " + years + " years");
	}
}
 

5. What does the following loop print?

	int n = 1;
	while (n < 100) {
		n = 2 * n;
		System.out.print(n + " ");
	}

A.

	2
	4
	8
	16
	32
	64
	128


 
 

6. Hand­trace the following code, showing the value of n and the output.
	
	int n = 5;
	while (n >= 0) {
		n--;
		System.out.print(n);
	}

A.

	4
	3
	3
	2
	1
	0
	-1
	

 

7. Hand­trace the following code, showing the value of n and the output. What potential error do you notice?
	
	int n = 1;
	while (n <= 3) {
		System.out.print(n + ", ");
		n++;
	}

A.

	1
	1, 2,
	1, 2, 3,
	
Potential Error: There is an extra comma after the last value.


 

8. Hand­trace the following code, assuming that a is 2 and n is 4. Then explain what the code does for arbitrary values of a and n.
	
	int r = 1;
	int i = 1;
	while (i <= n) {
		r = r * a;
		i++;
	}

A.
	
	a  n  r  i
	2  4  1  1
	2  4  2  2
	2  4  4  3
	2  4  8  4
	2  4  16 5
	
Therefore r = a^n


 

9. Trace the following code. What error do you observe?
	
	int n = 1;
	while (n != 50) {
		System.out.println(n);
		n = n + 10;
	}

A.

	n    output
	1    1
	11   11
	21   21
	31   31
	41   41
	51   51
	61   61
	...  Infinite Loop.

Error = n is never equal to 50.
Fix = n starts at 0.





10. The following pseudocode is intended to count the number of digits in the number n:
	
	count = 1
	temp = n
	while (temp > 10)
		Increment count.
		Divide temp by 10.0.
		
Trace the pseudocode for n = 123 and n = 100. What error do you find?

A.

	Count   Temp
	1		123
	2		12.3
	3		1.23
	Correct (123) has 3 digits.

	Count	Temp
	1		100
	2		10.0
	Incorrect (100) has 3, not 2 digits.
	
Off by one error.
Fix = use temp >= 10 as the condition.


 

11. Write the for loop of the Investment class as a while loop.



class Investment {
	
	private double balance;
	private double rate;
	private int year;
	
	public Investment(double aBalance, double aRate) {
		balance = aBalance;
		rate = aRate;
		year = 0;
	}
	
	public void waitForBalance(double targetBalance) {
		
		while (balance < targetBalance) {
			year++;
			double interest = balance * rate / 100;
			balance = balance + interest;
		}
		
	}
	
	public void waitYears(int numberOfYears) {
		
		//Here was the for loops
		int year = 1;
		while (year <= numberOfYears) {
			double interest = balance * RATE / 100;
			balance = balance + interest;
			year++;
		}
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getYears() {
		return year;
	}
}

public class InvestmentRunner {
	public static void main(String[] args) {
		
		final double INITIAL_BALANCE = 10000;
		final double RATE = 5;
		final int YEARS = 20;
		Investment invest = new Investment(INITIAL_BALANCE, RATE);
		invest.waitYears(YEARS);
		double balance = invest.getBalance();
		System.out.printf("The balance after %d years is %.2f\n", YEARS, balance);
		
	}
}

 

12. How many numbers does this loop print?
	
	for (int n = 10; n >= 0; n--) {
		System.out.println(n);
	}

A.

	10
	9
	8
	7
	6
	5
	4
	3
	2
	1
	0


 

13. Write a for loop that prints all even numbers between 10 and 20 (inclusive).

A.

	for (int i = 10; i <= 20; i = i+2){
		System.out.println(i);
	}


 

14. Write a for loop that computes the sum of the integers from 1 to n.

A.

	int sum = 0;
	for (int i = 1; i <= n; i++){
		sum = sum + i;
	}


 

15. How would you modify the InvestmentRunner.java program to print the balances after 20, 40, …, 100 years?



class Investment {
	
	private double balance;
	private double rate;
	private int year;
	
	public Investment(double aBalance, double aRate) {
		balance = aBalance;
		rate = aRate;
		year = 0;
	}
	
	public void waitForBalance(double targetBalance) {
		
		while (balance < targetBalance) {
			year++;
			double interest = balance * rate / 100;
			balance = balance + interest;
		}
		
	}
	
	public void waitYears(int numberOfYears) {
		
		for (int i = 1; i <= numberOfYears; i++) {
			double interest = balance * rate / 100;
			balance = balance + interest;
		}
		year = year + n;
		
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getYears() {
		return year;
	}
}

public class InvestmentRunner {
	public static void main(String[] args) {
		
		final double INITIAL_BALANCE = 10000;
		final double RATE = 5;
		final int YEARS = 20;
		Investment invest = new Investment(INITIAL_BALANCE, RATE);
		final int PERIODS = 5;
		for (int i = 1; i <= PERIODS; i++) {
			invest.waitYears(YEARS);
			System.out.printf( "The balance after %d years is %.2f\n", invest.getYears(), invest.getBalance());
		}
	}
}

 

16. Suppose that we want to check for inputs that are at least 0 and at most 100.

A.

	do {
		System.out.print("Enter an integer between 0 and 100: ");
		value = in.nextInt();
	} while (value < 0 || value > 100);


 

17. Rewrite the input validation do loop using a while loop. What is the disadvantage of your solution?

A.

	int value = 100;
	while (value >= 100) {
		System.out.print("Enter a value < 100: ");
		value = in.nextInt();
	}

The disadvantage is that we had to initialize the variable (value) with a dummy value of 100 in order to enter the loop at least once.


 

18. Suppose Java didn’t have a do loop. Could you rewrite any do loop as a while loop?

A.

	boolean first = true;
	while (first || condition) {
		body;
		first = false;
	}


 

19. Write a do loop that reads integers and computes their sum. Stop when reading the value 0.

A.

	int x;
	int sum = 0;
	do {
		x = in.nextInt();
		sum = sum + x;
	} while (x != 0);



20. Write a do loop that reads integers and computes their sum. Stop when reading a zero or the same value twice in a row.
For example, if the input is 1 2 3 4 4, then the sum is 14 and the loop stops.

A.

	int x = 0;
	int previous;
	do {
		previous = x;
		x = in.nextInt();
		sum = sum + x;
	} while ((x != 0) && (previous != x));


 

21. What does the SentinelDemo.java program print when the user immediately types –1 when prompted for a value?

* No data


 

22. Why does the SentinelDemo.java program have two checks of the form salary != -1

A.

	First check ends the input loop.
	Second check stops the program from registering the sentinel value as an input.


 

23. What would happen if the declaration of the salary variable in SentinelDemo.java was changed to

	double salary = -1;

* The while loop would never be executed. Therefore no input would be entered and the program would output "No Data".


 

24. In the last example of this section, we prompt the user “Enter values, Q to quit: ” What happens when the user enters a different letter?

* The nextDouble method works as expected, also printing false. The program will work with any key other than a digit, however the prompt asks for a Q in order to guide the user.


 

25. What is wrong with the following loop for reading a sequence of values?

	System.out.print("Enter values, Q to quit: ");
	do {
		double value = in.nextDouble();
		sum = sum + value;
		count++;
	} while (in.hasNextDouble());

* If the user does not provide a numeric input the call in.nextDouble() will result in an error.
And  the fail check for the error should be at the start of the loop, not at the end.



 

26. Provide a storyboard panel for a program that reads a number of test scores and prints the average score. The program only needs to process one set of scores. Don’t worry about error handling.

* Needs drawing.



 

27. Google has a simple interface for converting units. You just type the question, and you get the answer.
Make storyboards for an equivalent interface in a Java program. Show a scenario in which all goes well, and show the handling of two kinds of errors.

* Needs drawing.


 

28. Suppose we want to drop the lowest score before computing the average. Provide a storyboard for the situation in which a user only provides one score.

* One score is not enough for the computation.



 

29. What is the problem with implementing the following storyboard in Java

* Needs drawing.


 

30. Produce a storyboard for a program that compares the growth of a $10,000 investment for a given number of years under two interest rates.

* Needs drawing.


 

31. What total is computed when no user input is provided in the algorithm in Section 6.7.1?

A.

	total = 0


 

32. How do you compute the total of all positive inputs?

A.

	double total = 0;
	while (in.hasNextDouble()) {
		double input = in.nextDouble();
		if (input > 0) {
			total = total + input;
		}
	}


 

33. What are the values of position and ch when no match is found in the algorithm in Section 6.7.3?

A.

	Position = str.length()
	ch = ?
	

 

34. What is wrong with the following loop for finding the position of the first space in a string?

	boolean found = false;
	for (int position = 0; !found && position < str.length(); position++) {
		char ch = str.charAt(position);
		if (ch == ' ') {
			found = true;
		}
	}

A.

	The loop ends when the match is found
	however there is no counter updating the current position of said match.


 

35. How do you find the position of the last space in a string?

	boolean found = false;
	int i = str.length() - 1;
	while (!found && i >= 0) {
		char ch = str.charAt(i);
		if (ch == ' ') {
			found = true;
			}
		else {
		i--;
		}
	}


 

36. What happens with the algorithm in Section 6.7.6 when no input is provided at all? How can you overcome that problem?

* When no input is provided the in.nextDouble() fails and the program terminates.
A solution is to use a boolean to check whether the loop has entered for the first time:

	double input = 0;
	boolean first = true;
	while (in.hasNextDouble()) {
		double previous = input;
		input = in.nextDouble();
		if (first) {
			first = false;
		}
		else if (input == previous) {
			System.out.println("Duplicate input");
		}
	}


 

37. Why is there a statement System.out.println(); in the outer loop but not in the inner loop?

* All the values in the inner loop should be displayed on the same line, to diferentiate the outer and inner loop.


 

38. How would you change the program to display all powers from x0 to x5?

A.
	NMAX = 5
	for (int n = 0; n <= NMAX; n++)


 

39. If you make the change in Self Check 38, how many values are displayed?

CHANGE:
	
	NMAX = 5
	for (int n = 0; n <= NMAX; n++)
	
* 60 (10 * 6)


 

40. What do the following nested loops display?

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 4; j++) {
			System.out.print(i + j);
		}
		System.out.println();
	}

A.

	0123
	1234
	2345


 

41. Write nested loops that make the following pattern of brackets:

[][][][]
[][][][]
[][][][]

A.

	for (int i = 1; i <= 3; i++) {
		for (int j = 1; j <= 4; j++) {
			System.out.print("[]");
		}
		System.out.println();
	}


 

42. How do you simulate a coin toss with the Random class?

A.
	Random generator = new Random();
	generator.nextInt(2);
	
	0 = heads
	1 = tails



 

43. How do you simulate the picking of a random playing card?

	0 - 3  = suits.
	0 - 12 = numbers.
	
	suit = generator.nextInt(4);
	number = generator.nextInt(13);


 

44. How would you modify the DieSimulator program to simulate tossing a pair of dice?

A.
	
	Die d1 = new Die(6);
	Die d2 = new Die(6);
	System.out.println( d1.cast() + " " + d2.cast());


 

45. In many games, you throw a pair of dice to get a value between 2 and 12. What is wrong with this simulated throw of a pair of dice?

	int sum = 2 + generator.nextInt(11);

* The call produces a value between 2 and 12. However when using dice not all outcomes are equally probable. The correct formula would be:

	int sum = 2 + generator.nextInt(6) + generator.nextInt(6);
	

 

46. How do you generate a random floating­point number ≥ 0 and < 100?

A.
	
	Random generator = new Random();
	double number = generator.nextDouble()*100.0;


 

47. In the debugger, you are reaching a call to System.out.println. Should you step into the method or step over it?

* Over it. If you step into it you will open the internals of the Println method, which you rarelly do when working with an aproved method from the Java API.


 

48. In the debugger, you are reaching the beginning of a method with a couple of loops inside. You want to find out the return value that is computed at the end of the method. Should you set a breakpoint, or should you step through the method?

* Set a breakpoint, unless you are searching for a problematic statement inside the loop steping throw them will be repetitive.


 

49. When using the debugger, you find that a variable has an unexpected value. How can you go backwards to see when the variable changed?

* Usually you can't go backwards. Restart the program and search for the statements before and after the variable change to the unexpected value using breakpoints.


 


50. When using a debugger, should you insert statements to print the values of variables?

* No. The debugger does that for you.


 

51. Instead of using a debugger, could you simply trace a program by hand?

* Yes, but only for reasonable small programs.


