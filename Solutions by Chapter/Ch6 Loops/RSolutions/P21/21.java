/* 

21.- What do the following loops print? Work out the answer by tracing the code, not by using the computer.

	a.
	int s = 1;
	for (int n = 1; n <= 5; n++) {
		s = s + n;
		System.out.print(s + " ");
	}
	
	b.
	int s = 1;
	for (int n = 1; s <= 10; System.out.print(s + " ")) {
		n = n + 2;
		s = s + n;
	}
	
	c.
	int s = 1;
	int n;
	for (n = 1; n <= 5; n++) {
		s = s + n;
		n++;
	}
	System.out.print(s + " " + n);
	
A.

	a)
		s = 1, n = 1
		s = 2, n = 2
		s = 4, n = 3
		s = 7, n = 4
		s = 11, n = 5
		s = 16, n = 6
		Prints (2 4 7 11 16)
	
	b)
		n = 1, s = 1
		n = 3, s = 4
		n = 5, s = 9
		n = 7, s = 16
		Prints (4 9 16)
	
	c)
	
		s = 1, n = 1
		s = 2, n = 3
		s = 5, n = 5
		s = 10, n = 7
		Prints (10 7)

*/