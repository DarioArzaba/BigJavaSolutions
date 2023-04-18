/* 

26.- Why are separate viewer and component classes used for graphical programs?

A. The viewer class JFrame cannot be worked on directly, it doesn't have a working paintComponent method that gets called automatically for modular programming reasons (it is easier to add multiple components). So components have to be created separately, and then added to the viewer window using the add() method.

*/

