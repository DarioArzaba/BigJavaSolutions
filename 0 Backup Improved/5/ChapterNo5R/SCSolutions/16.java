/* 

16.- Beginners sometimes write statements such as the following:
	
	if (price > 100) {
		discountedPrice = price - 20;
	} else if (price <= 100) {
		discountedPrice = price - 10;
	}
	
Explain how this code can be improved.

A.

	if (price > 100) {
		discountedPrice = price - 20;
	} else {
		discountedPrice = price - 10;
	}

We are testing only two possible states for price: above or below 100.
If it is not above then it must be below.
Therefore testing if the price is below is redundant after we know it is not above.
We can delete the second test and only leave (else).

*/
