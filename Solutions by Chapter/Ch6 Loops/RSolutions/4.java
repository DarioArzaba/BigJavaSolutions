/* 

4.- Write a while loop that prints

a. All squares less than n. For example, if n is 100, print 0 1 4 9 16 25 36 49 64 81.
b. All positive numbers that are divisible by 10 and less than n. For example, if n is 100, print 10 20 30 40 50 60 70 80 90.
c. All powers of two less than n. For example, if n is 100, print 1 2 4 8 16 32 64.

A.

	a)
		int square = -1, temp = 0;
		int n = 100;
		while (square < n){
			if(square!=-1){
				System.out.print(square + " ");
			}
			square = temp*temp;
			temp++;
		}
	
	b)
		int div = -1, temp = 1;
		int n = 100;
		while (div < n){
			if(div!=-1){
				System.out.print(div + " ");
			}
			div = temp*10;
			temp++;
		}
		
	c)
		int pow = 1, temp = 0;
		int n = 100;
		while (pow < n){
			pow = 1;
			for (int i = 1; i < temp; i++){
				pow *= 2;
			}
			if(temp != 0 && pow < n){
				System.out.print(pow + " ");
			}
			temp++;
		}
	
	

*/