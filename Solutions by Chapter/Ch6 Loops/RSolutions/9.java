/* 

9.- Write a program trace for the pseudocode in Exercise E6.7, assuming the input values are 4 7 –2 –5 0

	boolean first = true;
	int value, min;
	String input = "4 7 -2 -5 0";
	while ( input != empty() ){
		value = nextInput();
		if (first == true) {
			min = value;
			first = false;
		} else if (value < min) {
			min = value;
		}
	}
	System.out.print(min);

A.
	
	//Initial Values
	first = true , value = 0, min = 0
	//Get first value from input, set min to this value and set first to false
	first = true , value = 4, min = 4
	//Get the next value. If it is less than the current min, update the min.
	first = false, value = 7, min = 4
	first = false, value = -2, min = -2
	first = false, value = -5, min = -5
	first = false, value = 0, min = -5

	The minimun value from the input is -5

*/
