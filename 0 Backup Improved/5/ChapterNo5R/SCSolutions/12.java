/* 

12. Which of the following comparisons are syntactically incorrect? Which of them are syntactically correct, but logically questionable?

	String a = "1";
	String b = "one";
	double x = 1;
	double y = 3 * (1.0 / 3);
	
	a. a == "1"
	b. a == null
	c. a.equals("")
	d. a == b
	e. a == x
	f. x == y
	g. x - y == null
	h. x.equals(y)

A.

	A) Logically Questionable: The information inside Strings cannot be compared using the double equal sign, they need to use the Equals object method. This comparation will be true since both are String Objects but it will not take into consideration their text information.
	B) Correct: You can compare a String with null using the double equal sign since null does not contain any information by definition. If the comparation is false then we will know that some information inside (a) exists.
	C) Correct: You can compare the text information inside strings using the Equals object method. This comparation will be true if (a) is an empty String.
	D) Logically Questionable: Same as A.
	E) Syntactically Incorrect: Cannot compare objects from different data types (String and Double) using the double equal sign.
	F) Logically Questionable: You can compare the information inside two Double numbers, however applying operations on a Double number creates very small round off errors that can make a number slightly different than another, even if we expect them to be mathematically the same. In this case it is preferable not to compare the result with a single number but a small range of them to catch the round off errors.
	G) Syntactically Incorrect: The Double data type does not have a Null representation like the String data type does.
	H) Syntactically Incorrect: The Equals method is not defined for Double data type like it is for Strings since it can use by default the double equal sign comparator.

*/

