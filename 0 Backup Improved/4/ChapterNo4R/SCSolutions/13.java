/* 

13.- What is problematic about the following statement sequence?

	System.out.print("Please enter the unit price: ");
	double unitPrice = in.nextInt();

A. The second statement calls for an Int from the Scanner however the int value is being stored on a Double. This would be fine since Int values can be transformed into Doubles on the fly, however if the user enters a double value as intended then the Scanner will throw an error (input mismatch exception) since it expected an int value.

*/

