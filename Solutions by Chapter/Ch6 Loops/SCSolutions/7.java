/* 

7.- Hand­trace the following code, showing the value of n and the output. What potential error do you notice?
	
	int n = 1;
	while (n <= 3) {
		System.out.print(n + ", ");
		n++;
	}

A.

	1
	1, 2,
	1, 2, 3,
	
Potential Error: There is an extra comma after the last value.

*/