/* 

20.- Provide trace tables of the following loops:

	a. int s = 1;
	int n = 1;
	while (s < 10) { s = s + n; }
	n++;
	
	b. int s = 1;
	for (int n = 1; n < 5; n++) { s = s + n; }
	
	c. int s = 1;
	int n = 1;
	do
	{
	s = s + n;
	n++;
	}
	while (s < 10 * n);

A.
	
	a)
		s = 1, n = 1
		s = 2, n = 1
		s = 3, n = 1
		s = 4, n = 1
		s = 5, n = 1
		s = 6, n = 1
		s = 7, n = 1
		s = 8, n = 1
		s = 9, n = 1
		
	b)
		s = 1, n = 1
		s = 2, n = 2
		s = 4, n = 3
		s = 7, n = 4
		
	c)
		s = 1, n = 1
		s = 2, n = 2
		s = 4, n = 3
		s = 7, n = 4
		s = 11, n = 5
		s = 16, n = 6
		s = 22, n = 7
		s = 29, n = 8
		s = 37, n = 9
		s = 46, n = 10
		s = 56, n = 11
		s = 67, n = 12
		s = 79, n = 13
		s = 92, n = 14
		s = 106, n = 15
		s = 121, n = 16
		s = 137, n = 17
		s = 154, n = 18
		s = 172, n = 19
		s = 191, n = 20
		s = 211, n = 21

*/