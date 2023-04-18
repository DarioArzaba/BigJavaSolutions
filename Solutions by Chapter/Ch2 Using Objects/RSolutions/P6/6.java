/* 

What is wrong with the following sequence of statements?

	int mystery = 1;
	mystery = mystery + 1;
	int mystery = 1 - 2 * mystery;

A. You are creating two variables with the same identifier, now Java doesn't have a way to discern between the two and generates a compile time error.

	Error: Duplicate local variable mystery

*/

