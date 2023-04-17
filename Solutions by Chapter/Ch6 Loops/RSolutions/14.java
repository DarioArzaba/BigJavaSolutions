/* 

14.- Write pseudocode for a program that prints a calendar such as the following.
	
	Su  M  T  W Th  F Sa
			  1  2  3  4
	 5  6  7  8  9 10 11
	12 13 14 15 16 17 18
	19 20 21 22 23 24 25
	26 27 28 29 30 31

A.
	
	Print calendar string day
	Set place to 4
	set day to 1
	repeat until day is less than 32
		if place is equal to 8
			print a new line character
		else
			if day is less than 10
				print space + day
			else
				print day
			add one to place
		add one to day
	

*/