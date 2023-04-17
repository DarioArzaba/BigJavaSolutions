/* 

11.- Cameras today can correct “red eye” problems caused when the photo flash makes eyes look red. Write pseudocode for an algorithm that can detect red eyes. Your input is a pattern of colors. You are given the number of rows and columns. For any row or column number, you can query the color, which will be red, black, or something else. If you find that the center of the black pixels coincides with the center of the red pixels, you have found a red eye, and your output should be “yes”. Otherwise, your output is “no”.

A. 
	Start by getting the "eye" input
	Define the number red pixels from the left and from the right as 0.
	Query colors (from left to right, top to bottom) until you encounter the first black pixel and save the row number.
	From that point query colors until you dont get a black pixel on a hole row, save the previous row number.
	Get the avarage of both row numbers to get a New row number
	Start querying colors on the New row number until you get a red colors.
	For each red pixel color add one to pixels from the left until you get a black pixel color.
	Start counting the number of black pixels adding one per pixel found until you get a red pixel color
	For each red pixel color add one to pixels from the right until you get something else for a color.
	If the number of red pixels from the left and from the right are equal return YES
	Else return NO as the final output.

*/

//Real image processing to remove red eyes involves a more complicated imput, so i think a simulation isn't required.
//The important question beign asked here is if the center of the black pixels will coincide with the center of the red pixels. That can be answered simply by looking if the black pixels are concentric on their middle row with respect to the red pixels.

