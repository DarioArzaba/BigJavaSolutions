/*

33.- What is wrong with the following program?
	
	System.out.print("Enter the number of quarters: ");
	int quarters = in.nextInt();
	if (in.hasNextInt()) {
		total = total + quarters * 0.25;
		System.out.println("Total: " + total);
	} else {
		System.out.println("Input error.");
	}

A.

	The quarters declaration should be made after the input validation inside the if block.
	
*/

