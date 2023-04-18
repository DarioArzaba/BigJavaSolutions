/* 

29.- What are nested loops? Give an example where a nested loop is typically used.

A. Nested loops inside the block code of another loop. This implies that the inside loop gets executed on each iteration of its parent loop. They are typically used to linearly correlate two or more variables, like when you relate the cells of a table from its collums and rows, meaning that for every ineration of a row you must iterate all the columns. This grid pattern can be descibed in terms of matrices of two or more dimentions.

	for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				//Do something m*n times
			}
			//Do something n times
	}
	

*/