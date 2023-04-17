/* 

19.- Rewrite the following do loop into a while loop:

	int n = in.nextInt();
	double x = 0;
	double s;
	do
	{
	s = 1.0 / (1 + n * n);
	n++;
	x = x + s;
	}
	while (s > 0.01);

A.

	int n = in.nextInt();
	double x = 0;
	double s = 0;
	s = (1.0)/((n*n)+1);
	n++;
	x+=s;
	while (s > 0.01){
		s = (1.0)/((n*n)+1);
		n++;
		x+=s;
	}

*/