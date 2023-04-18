/*

22.- Explain the difference between an if/else if/else sequence and nested if statements. Give an example of each.

A. The difference is that the first one will exclude future comparations when it reaches one that turns out to be true. The second one is non exclusive and will excecute all comparations that turn out to be true, not taking into account the results of previews ones.

	int a = 10;
	int b = 0;
	if (a == 9) {
		b++;
	} else if (a > 5) {
		b++;
	} else if (a <= 10) {
		b++;
	} else {
		b++;
	}
	//B ends up with a value of 1
	
	if (a == 9) {
		if (a > 5) {
			if (a <= 10) {
				b++;
			}
		}
	}
	//B ends up with a value of 0

*/

