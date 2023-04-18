/* 

24. Suppose each photo in the sequence had a price tag. Give an algorithm for finding the most expensive photo.

A.

Pick the first photo and call it "the most expensive so far".
For each photo in the sequence
	If it is more expensive than the "the most expensive so far"
		Discard "the most expensive so far".
		Call this photo "the most expensive so far".
The photo called "the most expensive so far" is the most expensive photo in the sequence.

*/
