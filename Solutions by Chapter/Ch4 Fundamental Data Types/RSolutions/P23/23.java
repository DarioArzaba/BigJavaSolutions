/* 

23.- You are cutting off a piece of pie like this, where c is the length of the straight part (called the chord length) and h is the height of the piece. There is an approximate formula for the area:

	A = (2/3)*c*h + (h^3)/(2*c)
	
However, h is not so easy to measure, whereas the diameter d of a pie is usually well-known. Calculate the area where the diameter of the pie is 12 inches and the chord length of the segment is 10 inches. Generalize to an algorithm that yields the area for any diameter and chord length.

A.

		A = (0.5)*(acos((((2*r^2)+c^2)/(2*r^2)))-sin(acos((((2*r^2)+c^2)/(2*r^2)))))*(r^2)
		
		double d = 12;
		double c = 10;
		double r = (d/2);
		double theta = Math.acos((r*r + r*r - c*c)/(2*r*r));
		double a = (0.5) * (theta - Math.sin(theta)) * r*r;

*/

