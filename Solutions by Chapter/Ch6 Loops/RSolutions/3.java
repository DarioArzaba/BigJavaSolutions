/* 

3.- What do these code snippets print?

	a.
	int result = 0;
	for (int i = 1; i <= 10; i++) { result = result + i; }
	System.out.println(result);

	b.
	int result = 1;
	for (int i = 1; i <= 10; i++) { result = i - result; }
	System.out.println(result);

	c.
	int result = 1;
	for (int i = 5; i > 0; i--) { result = result * i; }
	System.out.println(result);

	d.
	int result = 1;
	for (int i = 1; i <= 10; i = i * 2) { result = result * i; }
	System.out.println(result);

A.

	a)
		0+1+2+3+4+5+6+7+8+9+10 = 55
		
	b)
		(10-(9-(8-(7-(6-(5-(4-(3-(2-(1-1)))))))))) = 6
		
	c)
		(1*(2*(3*(4*(5*1))))) = 120

	d)
		((((1*1)*(1*2))*((1*2)*2))*((2*2)*2)) = 64
		
*/