/* 

25.- What is wrong with the following loop for reading a sequence of values?

	System.out.print("Enter values, Q to quit: ");
	do {
		double value = in.nextDouble();
		sum = sum + value;
		count++;
	} while (in.hasNextDouble());

A. If the user does not provide a numeric input the call in.nextDouble() will result in an error.
And  the fail check for the error should be at the start of the loop, not at the end.

*/

