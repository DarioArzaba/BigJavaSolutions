/* 

6.- Provide trace tables for these loops.

a. int i = 0; int j = 10; int n = 0;
while (i < j) { i++; j--; n++; }

b. int i = 0; int j = 0; int n = 0;
while (i < 10) { i++; n = n + i + j; j++; }

c. int i = 10; int j = 0; int n = 0;
while (i > 0) { i--; j++; n = n + i - j; }

d. int i = 0; int j = 10; int n = 0;
while (i != j) { i = i + 2; j = j - 2; n++; }

A.
	a)
		i = 0, j = 10, n = 0
		i = 1, j = 9, n = 1
		i = 2, j = 8, n = 2
		i = 3, j = 7, n = 3
		i = 4, j = 6, n = 4
		i = 5, j = 5, n = 5
		
	b)
		i = 0, j = 0, n = 0
		i = 1, j = 1, n = 1
		i = 2, j = 2, n = 3
		i = 3, j = 3, n = 6
		i = 4, j = 4, n = 10
		i = 5, j = 5, n = 15
		i = 6, j = 6, n = 21
		i = 7, j = 7, n = 28
		i = 8, j = 8, n = 36
		i = 9, j = 9, n = 45
		i = 10, j = 10, n = 55
		
	c)
		i = 10, j = 0, n = 0
		i = 9, j = 1, n = 9
		i = 8, j = 2, n = 16
		i = 7, j = 3, n = 21
		i = 6, j = 4, n = 24
		i = 5, j = 5, n = 25
		i = 4, j = 6, n = 24
		i = 3, j = 7, n = 21
		i = 2, j = 8, n = 16
		i = 1, j = 9, n = 9
		i = 0, j = 10, n = 0
	
	d)
		i = 0, j = 10, n = 0
		i = 2, j = 8, n = 1
		i = 4, j = 6, n = 2
		i = 6, j = 4, n = 3
		i = 8, j = 2, n = 4
		i = 10, j = 0, n = 5
		... Infinite Loop
		(i) will never be the same as (j)

*/