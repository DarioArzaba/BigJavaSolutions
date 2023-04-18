/* 

24.- The following pseudocode describes how to obtain the name of a day, given the day number (0 = Sunday, 1 = Monday, and so on.) Declare a string called names containing "SunMonTueWedThuFriSat". Compute the starting position as 3 x the day number. Extract the substring of names at the starting position with length 3. Check this pseudocode, using the day number 4. Draw a diagram of the string that is being computed, similar to Figure 3.

A.

	int Sunday = 0;
	int Monday = 1;
	int Tuesday = 2;
	int Wednesday = 3;
	int Thursday = 4;
	int Friday = 5;
	int Saturday = 6;
	int dayNumber = Thursday;
	String names = "SunMonTueWedThuFriSat";
	int index = 3 * dayNumber;
	String dayName = names.substring(index, index+3);
	

*/

