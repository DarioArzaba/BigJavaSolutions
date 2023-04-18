/* 

33.- Look into the API documentation of the Rectangle class. What is the difference between the methods void translate(int x, int y) and void setLocation(int x, int y)?

A. 

	setLocation Description: Move this Rectangle to the specified Location. Included to parallel the functionality of the (setLocation) method in the Component Class.
	translate Description: Translates this Rectangle the indicated distance, to the right along the X coordinate and downward along the Y coordinate axis. 

From both descriptions we can figure out that the setLocation method moves the rectangle to de specified coordinates ignoring its current location, while the translate method moves the rectangles a number of pixels taking into account its current location.

String class documentation can be found in:

https://docs.oracle.com/javase/8/docs/api/java/awt/Rectangle.html#translate-int-int-

*/

