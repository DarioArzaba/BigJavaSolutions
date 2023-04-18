/*

24.- Rewrite the condition in Section 5.3 to use < operators instead of >= operators. What is the impact on the order of the comparisons?

A.

	if (richter >= 8.0) {
		description = "Most structures fall";
	} else if (richter >= 7.0) {
		description = "Many buildings destroyed";
	} else if (richter >= 6.0) {
		description = "Many buildings considerably damaged, some collapse";
	} else if (richter >= 4.5) {
		description = "Damage to poorly constructed buildings";
	} else {
		description = "No destruction of buildings";
	}

A. It reverses their order

	if ( richter < 4.5 ) {
		description = "No destruction of buildings";
	} else if (richter < 6.0) {
		description = "Damage to poorly constructed buildings";
	} else if (richter < 7.0) {
		description = "Many buildings considerably damaged, some collapse";
	} else if (richter < 8.0) {
		description = "Many buildings destroyed";
	} else {
		description = "Most structures fall";
	}
	

*/

