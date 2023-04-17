/* 

32.- In a travel simulation, Harry will visit one of his friends that are located in three states. He has ten friends in California, three in Nevada, and two in Utah. How do you produce a random number between 1 and 3, denoting the destination state, with a probability that is proportional to the number of friends in each state?

A.
	1.-	California = 10 = 66.5%
	2.-	Nevada = 3 = 20
	3.-	Utah = 2 = 13.5
	Total Friends = 15
	
	Generate random number 0 to 100
	If it is within [0;66.5] --> I got my random number 1.
	If it is within [66.5;86.5] --> I got my random number 2.
	If it is within [86.5;100] --> I got my random number 3.

*/