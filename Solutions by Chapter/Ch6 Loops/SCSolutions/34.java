/* 

34.- What is wrong with the following loop for finding the position of the first space in a string?

	boolean found = false;
	for (int position = 0; !found && position < str.length(); position++) {
		char ch = str.charAt(position);
		if (ch == ' ') {
			found = true;
		}
	}

A.

	The loop ends when the match is found
	however there is no counter updating the current position of said match.

*/
