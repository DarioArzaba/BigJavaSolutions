/* 

9.- Trace the following code. What error do you observe?
	
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

*/