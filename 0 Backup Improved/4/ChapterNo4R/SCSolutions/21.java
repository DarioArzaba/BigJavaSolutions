/* 

21.- The shape of a bottle is approximated by two cylinders of radius r1 and r2 and heights h1 and h2, joined by a cone section of height h3. Develop pseudocode to compute the volume of the bottle.

A.

	bottomVolume = Pi * (r1)^2 * h1
	topVolume = Pi * (r2)^2 * h2
	middleVolume = (Pi * ((r1)^2 + (r1 * r2) + (r2)^2) * h3) / 3 )
	totalVolume = bottomVolume + topVolume + middleVolume

*/