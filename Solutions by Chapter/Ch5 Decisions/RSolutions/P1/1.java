/* 

1.- What is the value of each variable after the if statement?
	
	a. int n = 1; int k = 2; int r = n;
	if (k < n) { r = k; }
	
	b. int n = 1; int k = 2; int r;
	if (n < k) { r = k; }
	else { r = k + n; }
	
	c. int n = 1; int k = 2; int r = k;
	if (r < k) { n = r; }
	else { k = n; }
	
	d. int n = 1; int k = 2; int r = 3;
	if (r < n + k) { r = 2 * n; }
	else { k = 2 * r; }

A.

	A) Is K lower than N? No. Therefore R stays the same.
	n = 1, k = 2, r = 1.
	B) Is N lower than K? Yes. Therefore R = K.
	n = 1, k = 2, r = 2.
	C) Is R lower than K? No. Therefore K = N.
	n = 1, k = 1, r = 2.
	D) Is R lower than (N+K)? No. Therefore K = 2*R.
	n = 1, k = 6, r = 3.
	
*/



