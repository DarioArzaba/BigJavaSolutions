/* 

45.- In many games, you throw a pair of dice to get a value between 2 and 12. What is wrong with this simulated throw of a pair of dice?

	int sum = 2 + generator.nextInt(11);

A. The call produces a value between 2 and 12. However when using dice not all outcomes are equally probable. The correct formula would be:

	int sum = 2 + generator.nextInt(6) + generator.nextInt(6);
	
*/
