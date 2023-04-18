/* 

3.- Find the errors in the following if statements.
	
	a. if x > 0 then System.out.print(x);
	b. if (1 + x > Math.pow(x, Math.sqrt(2)) { y = y + x; }
	c. if (x = 1) { y++; }
	d.
	x = in.nextInt();
	if (in.hasNextInt()) {
		sum = sum + x;
	} else {
		System.out.println("Bad input for x");
	}
	
	e.
	String letterGrade = "F";
	if (grade >= 90) { letterGrade = "A"; }
	if (grade >= 80) { letterGrade = "B"; }
	if (grade >= 70) { letterGrade = "C"; }
	if (grade >= 60) { letterGrade = "D"; }

A.
	A) No parenthesis after the (if) keyword. (then) is not a valid keyword, instead surround the statements with brackets.
	B) Only if (x) is an int number. Then it is correct meaning that if (x) is below 2.352 then it will excecute the statement.
	C) There is a single equal sign inside the parenthesis denoting an asignation not a comparation. To compare two numbers you need to use two equal signs.
	D) That if is checking if the input is a number, therefore the declaration of (x) based on the user input should be done inside the if denoting that it has passed the test and the input is in fact a valid number that can be assigned to (x).
	E) It is using individual if statements that are non exclusive. Use if else to enter the if only if the previous one failed.

*/

