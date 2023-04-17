/* 

9.- Roman numbers. Write a program that converts a positive integer into the Roman number system. The Roman number system has digits:

	I 1
	V 5
	X 10
	L 50
	C 100
	D 500
	M 1,000

Numbers are formed according to the following rules:
	
	a. Only numbers up to 3,999 are represented.
	b. As in the decimal system, the thousands, hundreds, tens, and ones are expressed separately.
	c. The numbers 1 to 9 are expressed as
		I 1 IV 4 VII 7 II 2 V 5 VIII 8 III 3 VI 6 IX 9
		As you can see, an I preceding a V or X is subtracted from the value,
		you can never have more than three I’s in a row.
	d. Tens and hundreds are done the same way, except that the letters X, L, C and C, D, M are used instead of I, V, X, respectively.
	
Your program should take an input, such as 1978, and convert it to Roman numerals,
	
	MCMLXXVIII.

*/

import java.util.Scanner;

public class RomanNumeralsCalculator {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Positive Integer Number : " );
		int number = input.nextInt();
		
		if (number < 40000 && number > 0){
			
			StringBuilder num = new StringBuilder();
			
			int times = 0;
			
			String[] romans = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
			
			int[] ints = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
			
			int intsElements = 12;
			
			//Will check the number for each roman symbol from the largest to the smallest.
			for (int i = intsElements; i >= 0; i--){
				
				//How many times can the current roman symbol be applied?
				times = (number / ints [i]);
				
				//The new number is the number without the symbol
				number = number - (times * ints[i]);
				
				//For each time the simbol could be applied, apply it.
				while (times > 0){
					num.append(romans[i]);
					times--;
				}
				
			}
			
			System.out.println("In Roman Numerals " + num );
			
		} else {
			System.out.println("Error. Number must be between 0 and 3999." );
		}
		
		StringBuilder sb = new StringBuilder();
		int times = 0;
		
		input.close();
		
		System.exit(0);
		
	}
	
}

