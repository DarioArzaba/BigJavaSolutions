/* 

4.- What do these code fragments print?
	
	a. int n = 1;
	int m = -1;
	if (n < -m) { System.out.print(n); }
	else { System.out.print(m); }
	
	b. int n = 1;
	int m = -1;
	if (-n >= m) { System.out.print(n); }
	else { System.out.print(m); }
	
	c. double x = 0;
	double y = 1;
	if (Math.abs(x - y) < 1) { System.out.print(x); }
	else { System.out.print(y); }
	
	d. double x = Math.sqrt(2);
	double y = 2;
	if (x * x == y) { System.out.print(x); }
	else { System.out.print(y);

A.
	A) The minus is applied to m before the comparation.
	Therefore it is asking if 1 is less than 1. No. So it prints (m) = -1.
	
	B) The minus is applied to n before the comparation.
	Therefore it is asking if -1 is greater than or equal to -1. Yes. So it prints (n) = 1.
	
	C) The absolute value of 0-1 is 1.
	Therefore it is asking if 1 is less than 1. No. So it prints (y) = 1;
	
	D) Applying sqrt to a double produces some roundoff error. So squaring it does not give exactly the previous number. That is why even though the equality is mathematically correct the program will say they are different numbers and print (y) = 2. Here you need to compare a small range of (y) values arround the expected result of 2 to fallow math.

*/

