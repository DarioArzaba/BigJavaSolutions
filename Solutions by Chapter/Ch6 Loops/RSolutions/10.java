/* 

10.- What is an “off­by­one” error? Give an example from your own programming experience.

An off by one error is when a loop does one less or extra loop from the intended number of repetitions.

	for (i = 0; i < 5; i++) { Repeat 5 times  i = 0, 1, 2, 3, 4 }
	for (i = 1; i < 6; i++) { Repeat 5 times  i = 1, 2, 3, 4, 5 }
	for (i = 0; i <= 5; i++) { Repeat 6 times i = 0, 1, 2, 3, 4, 5 }
	for (i = 1; i <= 6; i++) { Repeat 6 times i = 1, 2, 3, 4, 5, 6 }

*/