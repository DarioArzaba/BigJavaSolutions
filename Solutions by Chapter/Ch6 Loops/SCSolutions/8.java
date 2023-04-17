/* 

8.- Hand­trace the following code, assuming that a is 2 and n is 4. Then explain what the code does for arbitrary values of a and n.
	
	int r = 1;
	int i = 1;
	while (i <= n) {
		r = r * a;
		i++;
	}

A.
	
	a  n  r  i
	2  4  1  1
	2  4  2  2
	2  4  4  3
	2  4  8  4
	2  4  16 5
	
Therefore r = a^n

*/