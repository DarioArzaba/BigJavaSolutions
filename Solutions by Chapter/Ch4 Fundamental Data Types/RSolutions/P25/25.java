/* 

25.- The following pseudocode describes how to swap two letters in a word.

	We are given a string str and two positions i and j. (i comes before j)
	Set first to the substring from the start of the string to the last position before i.
	Set middle to the substring from positions i + 1 to j - 1.
	Set last to the substring from position j + 1 to the end of the string.
	Concatenate the following five strings: first, the string containing just the character at position j,
	middle, the string containing just the character at position i, and last.
	
	Check this pseudocode, using the string "Gateway" and positions 2 and 4. Draw a
	diagram of the string that is being computed, similar to Figure 3.

A.

	String str = "Gateway";
	int i = 2;
	int j = 4;
	String first = str.substring(0, i);
	String middle = str.substring(i+1, j);
	String last = str.substring(j+1, str.length());
	String newStr = first + str.charAt(j) + middle + str.charAt(i) + last;
	System.out.println(newStr);
	//Expected: Gawetay




*/

