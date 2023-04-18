/* 

8.- Consider a robot that has been placed in a maze. The right-hand rule tells you how to escape from a maze: Always have the right hand next to a wall, and eventually you will find an exit. Write an algorithm that lets the robot escape the maze. You may assume that there is an exit that is reachable by the right-hand rule. Your challenge is to deal with situations in which the path turns. The robot can’t see turns. It can only see what is directly in front of it.

A. 
	Start by getting the starting position of the robot in the maze.
	If you have a wall in front of you
		Turn until you have nothing
	Repeat unitl you have the exit in front of you
		Turn to your right
		If you have a wall in front of you
			Turn to your left until you have nothing
		Advance

*/

//Creating a simulation of this solution would involve creating the maze, and i don't have the time to do so.
//However the searching implementation would be similar (even simpler) than the 7th problem.
