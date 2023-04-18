/* 

10.- Each square on a chess board can be described by a letter and number, such as g5 in the example at right. The following pseudocode describes an algorithm that determines whether a square with a given letter and number is dark (black) or light (white).

	If the letter is an a, c, e, or g
		If the number is odd
			color = "black"
		Else
			color = "white"
	Else
		If the number is even
			color = "black"
		Else
			color = "white"
		
Using the procedure in Programming Tip 5.5, trace this pseudocode with input g5.

A.

	letter = g
	number = 5
	
	The letter is g so we enter the first branch.
	The number is also odd so we enter the inner branch.
	Therefore the color is black.
	
*/

