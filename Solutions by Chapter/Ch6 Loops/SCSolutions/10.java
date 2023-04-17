/* 

10.- The following pseudocode is intended to count the number of digits in the number n:
	
	count = 1
	temp = n
	while (temp > 10)
		Increment count.
		Divide temp by 10.0.
		
Trace the pseudocode for n = 123 and n = 100. What error do you find?

A.

	Count   Temp
	1		123
	2		12.3
	3		1.23
	Correct (123) has 3 digits.

	Count	Temp
	1		100
	2		10.0
	Incorrect (100) has 3, not 2 digits.
	
Off by one error.
Fix = use temp >= 10 as the condition.

*/