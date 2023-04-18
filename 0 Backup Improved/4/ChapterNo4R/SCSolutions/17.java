/* 

17.- Translate the pseudocode for computing the number of tiles and the gap width into Java.

Pseudocode:

	number of pairs = integer part of (total width - tile width) / (2 x tile width)
	number of tiles = 1 + 2 x number of pairs
	gap at each end = (total width - number of tiles x tile width) / 2

A.

	int pairs = (totalWidth - tileWidth) / (2 * tileWidth);
	int tiles = 1 + (2 * pairs);
	double gap = (totalWidth - (tiles * tileWidth)) / 2.0;
	

*/
