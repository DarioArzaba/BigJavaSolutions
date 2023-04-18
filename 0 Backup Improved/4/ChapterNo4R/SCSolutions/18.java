/* 

18.- Suppose the architect specifies a pattern with black, gray, and white tiles, like this:

B - G - W - G - B - G - W - G - B

Again, the first and last tile should be black. How do you need to modify the algorithm?

A. Now the series is of groups of four tiles G - W - G - B after the initial black tile. Therefore the new algorithm is:

	number of groups = integer part of (total width - tile width) / (4 * tile width)
	number of tiles = 1 + (4 * number of groups)
	gap at each end = (total width - number of tiles x tile width) / 2

*/
