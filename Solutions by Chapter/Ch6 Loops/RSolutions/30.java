/* 

30.- The nested loops:

	for (int i = 1; i <= height; i++) {
		for (int j = 1; j <= width; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	display a rectangle of a given width and height, such as
	
	****
	****
	****

Write a single for loop that displays the same rectangle.

A.
	
	int width = 4;
	int height = 3;
	boolean finished = false;
	int counterW = 0;
	int counterH = 0;
	
	while (!finished) {
		
		if (counterW != width) {
			System.out.print("*");
			counterW++;
		} else {
			System.out.println();
			counterW = 0;
			counterH++;
			if (counterH == height){
				finished = true;
			}
		}
	
	}


*/