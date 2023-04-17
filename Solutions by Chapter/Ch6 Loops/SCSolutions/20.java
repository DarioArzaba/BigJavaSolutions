/* 

20.- Write a do loop that reads integers and computes their sum. Stop when reading a zero or the same value twice in a row.
For example, if the input is 1 2 3 4 4, then the sum is 14 and the loop stops.

A.

	int x = 0;
	int previous;
	do {
		previous = x;
		x = in.nextInt();
		sum = sum + x;
	} while ((x != 0) && (previous != x));

*/
