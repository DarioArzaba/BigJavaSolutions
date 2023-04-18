/*

26.- Make up a Java code example that shows the dangling else problem using the following statement: A student with a GPA of at least 1.5, but less than 2, is on probation. With less than 1.5, the student is failing.

if ( GPA >= 1.5)
	if ( GPA < 2 )
		probation
else is failing.

A. The program does not specify if the student is failing only if the GPA is lower than 1.5 or if it is also bigger than 2.
So a student whit 0.5 or 3 could end up failing. The correct procefure would be:

if ( GPA >= 1.5) {
	if ( GPA < 2 ) {
		probation
	}
} else {
	failing
}

*/

