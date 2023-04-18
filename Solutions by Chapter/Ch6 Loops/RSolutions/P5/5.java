/* 

5.- Write a loop that computes:

a. The sum of all even numbers between 2 and 100 (inclusive).
b. The sum of all squares between 1 and 100 (inclusive).
c. The sum of all odd numbers between a and b (inclusive).
d. The sum of all odd digits of n. (For example, if n is 32677, the sum would be 3 + 7 + 7 = 17.)

A.

	a)
		int sum = 0;
		for (int i = 0; i <= 100; i=i+2) {
			sum += i;
		}
		System.out.println("Sum: " + sum);
		
	b)
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += (i*i);
		}
		System.out.println("Sum: " + sum);
		
	c)
		int a = 1;
		int b = 7;
		//Test that both (a) and (b) are odd
		int sum = 0;
		for (int i = a; i <= b; i+=2) {
			sum += i;
		}
		System.out.println("Sum: " + sum);
		
		
	d)
		int num = 32677;
		int sum = 0;
		while (num > 0){
			//Get last digit
			int digit = num % 10;
			//If digit is even add it
			if (digit % 2 != 0) {
				sum += digit;
			}
			//Delete last digit from the number.
			num /= 10;
		}
		System.out.println("Sum: " + sum);

		
*/



