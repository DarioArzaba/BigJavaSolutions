/* 

35.- How do you find the position of the last space in a string?

	boolean found = false;
	int i = str.length() - 1;
	while (!found && i >= 0) {
		char ch = str.charAt(i);
		if (ch == ' ') {
			found = true;
			}
		else {
		i--;
		}
	}

*/
