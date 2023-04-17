/* 

22.- What do the following program segments print? Find the answers by tracing the code, not by using the computer.

	a.
	int n = 1;
	for (int i = 2; i < 5; i++) { n = n + i; }
	System.out.print(n);
	
	b. int i;
	double n = 1 / 2;
	for (i = 2; i <= 5; i++) { n = n + 1.0 / i; }
	System.out.print(i);
	
	c.
	double x = 1;
	double y = 1;
	int i = 0;
	do {
		y = y / 2;
		x = x + y;
		i++;
	} while (x < 1.8);
	System.out.print(i);
	
	d.
	double x = 1;
	double y = 1;
	int i = 0;
	while (y >= 1.5) {
		x = x / 2;
		y = x + y;
		i++;
	}
	System.out.print(i);
	
	

A.

	a)
		n = 1, i = 2
		n = 3, i = 3
		n = 6, i = 4
		n = 10, i = 5
		Prints (10)
	
	b)
		n = 0.5, i = 2
		n = 1, i = 3
		n = 1.333, i = 4
		n = 1.58, i = 5
		n = 1.78, i = 6
		Prints (6)
	
	c)
		x = 1, y = 1, i = 0
		x = 1.5, y = 0.5, i = 1
		x = 1.75, y = 0.25, i = 2
		x = 1.875, y = 0.125, i = 3
		Prints (3)
		
	d)
		x = 1, y = 1, i = 0;
		Prints (0)


*/