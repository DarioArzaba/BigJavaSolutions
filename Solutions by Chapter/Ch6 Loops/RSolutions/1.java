/* 

1.- Given the variables

	String stars = "*****";
	String stripes = "=====";

what do these loops print?

a.
	int i = 0;
	while (i < 5) {
		System.out.println(stars.substring(0, i));
		i++;
	}

b.
	int i = 0;
	while (i < 5) {
		System.out.print(stars.substring(0, i));
		System.out.println(stripes.substring(i, 5));
		i++;
	}
	
c.
	int i = 0;
	while (i < 10) {
		if (i % 2 == 0) {
			System.out.println(stars);
		} else {
			System.out.println(stripes);
		}
	}

A.

	a)
	
		*
		**
		***
		****
	
	b)
		
		=====
		*====
		**===
		***==
		****=
	
	c)
	
		*****
		*****
		*****
		*****
		... Infinite Loop.

*/
