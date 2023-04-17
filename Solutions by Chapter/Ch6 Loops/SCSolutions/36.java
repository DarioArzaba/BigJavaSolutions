/* 

36.- What happens with the algorithm in Section 6.7.6 when no input is provided at all? How can you overcome that problem?

A. When no input is provided the in.nextDouble() fails and the program terminates.
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

*/
