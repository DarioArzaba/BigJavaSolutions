/* 

28.- In Section 6.7.5, the code for finding the largest and smallest input initializes the largest and smallest variables with an input value. Why can’t you initialize them with zero?

	double largest = in.nextDouble();
	while (in.hasNextDouble()) {
		double input = in.nextDouble();
		if (input > largest) {
			largest = input;
		}
	}

	double smallest = in.nextDouble();
	while (in.hasNextDouble()) {
		double input = in.nextDouble();
		if (input < smallest) {
			smallest = input;
		}
	}

A.
	Because the condition inside the while loops checks the input stream to see if it has a Double, if it weren't for the first initialization Double the program would not enter the loop. You could probably use a Do loop as an alternative but that would defeat the Fail Check purpose of the condition itself.
	
	

*/