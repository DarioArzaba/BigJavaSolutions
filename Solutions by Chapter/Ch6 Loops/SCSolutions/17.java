/* 

17.- Rewrite the input validation do loop using a while loop. What is the disadvantage of your solution?

A.

	int value = 100;
	while (value >= 100) {
		System.out.print("Enter a value < 100: ");
		value = in.nextInt();
	}

The disadvantage is that we had to initialize the variable (value) with a dummy value of 100 in order to enter the loop at least once.

*/
