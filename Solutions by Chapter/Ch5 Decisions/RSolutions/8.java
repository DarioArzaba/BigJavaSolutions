/* 

8.- Given two pixels on a computer screen with integer coordinates (x1, y1) and (x2, y2), write conditions to test whether they are

	a. The same pixel.
	b. Very close together (with distance < 5).

A.

	A)

		if ((x1 == x2) && (y1 == y2)) {
			//They are the same pixel
		} else {
			//They are not the same pixel
		}
	
	B)
		
		if ( (Math.abs(x2-x1) < 5) && (Math.abs(y2-y1) < 5) ) {
			//They are very close together
		}

*/

