/* 

5.- Write an algorithm to create a tile pattern composed of black and white tiles, 
	with a fringe of black tiles all around and two or three black tiles in the center, equally spaced from the boundary. 
	The inputs to your algorithm are the total number of rows and columns in the pattern.

A.
	Start by getting the number of Rows and Columns.
	Rows should be an odd number to display the center black tiles!
	Define the Middle Row as the integral part of dividing the Rows by 2
	Define the Middle Column as the integral part of dividing the Columns by 2
	For each tile of the pattern
		If we are currently placing the first or last tile of the files or the columns
			Place a black tile here
		Else if the number of Columns is even and we are on the middle row and middle column
			Place a black tile here
			Place a black tile on the Column before
		Else if the number of Columns is odd and we are on the middle row and middle column
			Place a black tile here
			Place a black tile on the Column before and after.
	For each tile of the pattern
		If the tile isn't black then place a white tile
	End by returning the finished pattern.

*/

public class TilePattern {
	
	public static void main(String[] args){
		
		int rows = 7;
		int columns = 9;
		
		boolean[][] matrix = new boolean[rows][columns];
		int middleRow = rows/2;
		int middleColumn = columns/2;
		boolean columnsEven;

		if ((columns%2==0)){
			columnsEven = true;
		} else {
			columnsEven = false;
		}
		
		//Calculate Matrix
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				matrix[i][j] = true;	
			}
		}

		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				if ( (j == 0) || (j == (matrix[i].length-1)) || (i == 0) || (i == (matrix.length-1))){
					matrix[i][j] = false;
				} else if ((columnsEven==true) && ((i==middleRow)&&(j==middleColumn))) {
					matrix[i][j] = false;
					matrix[i][j-1] = false;
				} else if ((columnsEven==false) && ((i==middleRow)&&(j==middleColumn))) {
					matrix[i][j] = false;
					matrix[i][j-1] = false;
					matrix[i][j+1] = false;
				}
			}
		}
		
		//Print the matrix
		System.out.print("\n\n");
		for (int i = 0; i < columns; i++){ System.out.print("----"); }
		System.out.print("\n");
		for (int i = 0; i < matrix.length; i++){
			System.out.print("|");
			for (int j = 0; j < matrix[i].length; j++){
				if (matrix[i][j] == false){ System.out.print(" @ |"); } 
				else { System.out.print("   |"); }
			}
			System.out.print("\n");
			for (int k = 0; k < columns; k++){ System.out.print("----"); }
			System.out.print("\n");
		}
		
		System.exit(0);
	}

}


