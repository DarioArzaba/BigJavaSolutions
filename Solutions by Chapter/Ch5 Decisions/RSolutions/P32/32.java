/*

32.- Simplify the following statements. Here, b is a variable of type boolean and n is a variable of type int.
	
	a. if (n == 0) { b = true; } else { b = false; }
	(Hint: What is the value of n == 0?)
	b. if (n == 0) { b = false; } else { b = true; }
	c. b = false; if (n > 1) { if (n < 2) { b = true; } }
	d. if (n < 1) { b = true; } else { b = n > 2; }
	
A.

	b = (n == 0)
	b = (n != 0)
	b = (n > 1) && (n < 2);
	b = (n < 1) || (n > 2);
	
I got stuck on this one.
https://stackoverflow.com/questions/29068422/simplify-boolean-statements-java
The trick here is to realise that in the end you are only changing the boolean based on the conditional.

*/

