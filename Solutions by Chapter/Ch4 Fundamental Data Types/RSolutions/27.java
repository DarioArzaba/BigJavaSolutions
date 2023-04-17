/* 

27.- For each of the following computations in Java, determine whether the result is exact, an overflow, or a roundoff error.
	
	a. 2.0 - 1.1
	b. 1.0E6 * 1.0E6
	c. 65536 * 65536
	d. 1_000_000L * 1_000_000L

A.
	Roundoff (0.899... when it meant 0.9)
	Exact (Result can be stored in a double)
	Overflow (Result cannot be stored in an int)
	Exact (Result can be stored in a Long)

*/

