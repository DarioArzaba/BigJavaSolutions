/* 

28.- Write a program that prints the values

	3 * 1000 * 1000 * 1000
	3.0 * 1000 * 1000 * 1000
	Explain the results.

A.
	-1294967296
	3.0 x 10^9

The first result overflowed because since every number in the multiplication is an integer it tried to store the result in an integer, a data type that cannot store such a big number. The second result didnt overflowd because the first number was a double so java tried to store the result in a floating point number such as double, a data type that can store such a big number.

*/

