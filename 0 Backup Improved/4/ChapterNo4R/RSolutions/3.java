/* 

3.- What is wrong with the following sequence of statements?
	
	int mystery = 1;
	mystery = mystery + 1;
	int mystery = 1 - 2 * mystery;

A. The first two are correct. The last one is defining a new variable with the same name as the one that we have already defined. In other words we are trying to define two variables with the same identifier, something that is illegal in Java. This are two solutions.

a)
	int mystery = 1;
	mystery = mystery + 1;
	mystery = 1 - 2 * mystery;
	
b)
	int mystery = 1;
	mystery = mystery + 1;
	int newMystery = 1 - 2 * mystery;

*/

