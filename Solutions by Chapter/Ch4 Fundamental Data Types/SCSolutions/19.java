/* 

19.- A robot needs to tile a floor with alternating black and white tiles (Checkboard Pattern). Develop an algorithm that yields the color (0 for black, 1 for white), given the row and column number. Start with specific values for the row and column, and then generalize.

A.
	The color of the cell will depend only on whether the row and column numbers are even or odd. If both are even or odd it means it will be black (0) otherwise it will be (1)
	
	color = ((row%2) + (column %2)) % 2
	
*/
