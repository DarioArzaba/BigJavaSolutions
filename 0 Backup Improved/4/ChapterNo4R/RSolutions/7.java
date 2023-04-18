/* 

7.- Suppose direction is an integer angle between 0 and 359 degrees. You turn by a given angle and update the direction as direction = (direction + turn) % 360; In which situation do you get the wrong result? How can you fix that without using	the Math.floorMod method described in Java 8 Note 4.1?

A. You get a wrong result when you travel in a negative direction and go beyond 0 getting a negative result. Math.floorMod will allways get the biggest positive number in the case that it goes lower than 0, in escence if it goes beyond 0 it will reset to 360 instead of going into the negative numbers.

*/