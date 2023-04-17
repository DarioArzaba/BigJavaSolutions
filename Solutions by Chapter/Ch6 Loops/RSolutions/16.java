/* 

16.- Write pseudocode for a program that reads a student record, consisting of the student’s first and last name, followed by a sequence of test scores and a sentinel of –1. The program should print the student’s average score. Then provide a trace table for this sample input:

Harry Morgan 94 71 86 95 -1
	
	Repeat until value is equal to -1
		if value is different from -1
			if name is true
				get first name
				add first name to output
				get second name
				add second name to output
				set name to false
			else
				get number
				set value to that number
				add value to the output
				add value to sumValues
				add 1 to numberValues
	

	name = true, firstName = "", secondName = "", value = 0, output = ""
	name = false, firstName = Harry, secondName = Morgan, value = 0
	output = Harry Morgan
	name = false, firstName = Harry, secondName = Morgan, value = 94
	output = Harry Morgan 94
	name = false, firstName = Harry, secondName = Morgan, value = 71
	output = Harry Morgan 94 71
	name = false, firstName = Harry, secondName = Morgan, value = 86
	output = Harry Morgan 94 71 86
	name = false, firstName = Harry, secondName = Morgan, value = 95
	output = Harry Morgan 94 71 86 95
	name = false, firstName = Harry, secondName = Morgan, value = -1
	output = Harry Morgan 94 71 86 95 -1
	avarage = sumValues / numberValues

*/