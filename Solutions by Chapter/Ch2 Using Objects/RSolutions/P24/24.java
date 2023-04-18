/* 

24.- Why does the argument of the paintComponent method have type Graphics and not Graphics2D?

A. Legacy Code. Graphics was the primitive data type defined by the paintComponent method, and back then it was enough. But with time the graphic requirements grew, and instead of replacing the Graphics object, we simply extended its functionality with the more advanced methods of Graphics2D.

*/

