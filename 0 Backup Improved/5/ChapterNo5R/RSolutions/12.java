/* 

12.- In a scheduling program, we want to check whether two appointments overlap. For simplicity, appointments start at a full hour, and we use military time (with hours 0–23). The following pseudocode describes an algorithm that determines whether the appointment with start time start1 and end time end1 overlaps with the appointment with start time start2 and end time end2.

	If start1 > start2
		s = start1
	Else
		s = start2
	If end1 < end2
		e = endl
	Else
		e = end2
	If s < e
		The appointments overlap.
	Else
		The appointments don’t overlap.
	
Trace this algorithm with an appointment from 10–12 and one from 11–13, then with an appointment from 10–11 and one from 12–13.

A.

	10 - 12 and 11 - 13
	10 is not bigger than 11 so (s) = 11
	12 is less than 13 so (e) = 12
	11 is less than 12 so the appointments overlap.
	
	10 - 11 and 12 - 13
	10 is not bigger than 12 so (s) = 12
	11 is less than 13 so (e) = 11
	12 is not less than 11 so the appointments dont overlap
	
*/

