/*

32.- Suppose you are designing a part of a program for a medical robot that has a sensor returning an x- and y-location (measured in cm). You need to check whether the sensor location is inside the circle, outside the circle, or on the boundary (specifically, having a distance of less than 1 mm from the boundary). Assume the circle has center (0, 0) and a radius of 2 cm. Give a set of test cases.

A.

Test Case 	|	Expected Ouput 		|	 Comment
(0.5, 0.5) 		inside
(4, 2) 			outside
(0, 2) 			on the boundary 		Exactly on the boundary
(1.414, 1.414)  on the boundary 		Close to the boundary
(0, 1.9) 		inside 					Not less than 1 mm from the boundary
(0, 2.1) 		outside 				Not less than 1 mm from the boundary

*/
