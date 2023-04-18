/* 

23.- Give an example of a for loop where symmetric bounds are more natural. Give an example of a for loop where asymmetric bounds are more natural.

A.
	In general it is better to use symetric bounds when you know both limits of the counter.
	This will give a one to one relation to the number of iterations:
	
	for (int i = 1; i <= 10; i++) { // Do something 10 times }
	
	For iterations where your limits are that of an arrays, like in a string.
	Then it is more convinient to use asymetric bounds to mantain the index relationship.
	
	for (int i = 0; i < str.length(); i++) { //Do something from 0 to length }
	
	If we tried to use symetric bounds with these types of contructs we would need
	to use a minus one to forbid out of index errors. The magic one is confusing.
	
	for (int i = 0; i <= str.length() - 1; i++) // Use < instead

	

*/