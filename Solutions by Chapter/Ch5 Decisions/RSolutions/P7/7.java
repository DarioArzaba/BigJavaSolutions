/* 

7.- Explain why it is more difficult to compare floating-point numbers than integers. Write Java code to test whether an integer n equals 10 and whether a floating-point number x is approximately equal to 10.

A. Because floating point numbers are an approximate representations of real number, simulating their infinite decimal digits. However the computer can only simulate so many digits after the decimal point incurring in a small roundoff error. When comparing two floating point numbers the roundoff error can make the numbers vary a little and throw off comparations because they are technically different numbers. Integers numbers doesn't have this problem since they don't represent decimal digits.

	if (n == 10){
		//Integer is equal to 10
	}

	if (Math.abs(x - 10.0) <= 1e-10) {
		//Double is within 0.0000000001 of 10.0
	}

*/

