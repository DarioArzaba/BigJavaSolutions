/* 

17.- Write pseudocode for a program that reads a sequence of student records and prints the total score for each student. Each record has the student’s first and last name, followed by a sequence of test scores and a sentinel of –1. The sequence is terminated by the word END. Here is a sample sequence:

Harry Morgan 94 71 86 95 -1
Sally Lin 99 98 100 95 90 -1
END

Provide a trace table for this sample input.

Repeat until sentinel is equal to end
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
	Ask to end?
	get sentinel ending string
	if sentinel is equal to "END"
		add it to output

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
	sentinel = N
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
	sentinel = END
	

*/