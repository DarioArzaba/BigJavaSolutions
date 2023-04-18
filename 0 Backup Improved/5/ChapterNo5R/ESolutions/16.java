/* 

16.- Write a program that translates a letter grade into a number grade. Letter grades are A, B, C, D, and F, possibly followed by + or –. Their numeric values are 4, 3, 2, 1, and 0. There is no F+ or F–. A + increases the numeric value by 0.3, a – decreases it by 0.3. However, an A+ has value 4.0.
		
		Enter a letter grade: B-
		The numeric value is 2.7.
	
Use a class Grade with a method getNumericGrade.

*/

import java.util.Scanner;

public class GetNumericGradeFromLetterGrade {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade : " );
		String grade = input.next();
		
		double result = 0;
		
		if (grade.substring(0,1).equals("A")){
			if (grade.substring(1,2).equals("+")){
				result = 4.0;
			} else if (grade.substring(1,2).equals("-")) {
				result = 3.7;
			} else {
				result = 4.0
			}
		} else if (grade.substring(0,1).equals("B")){
			if (grade.substring(1,2).equals("+")){
				result = 3.3;
			} else if (grade.substring(1,2).equals("-")) {
				result = 2.7;
			} else {
				result = 3.0
			}
		} else if (grade.substring(0,1).equals("C")){
			if (grade.substring(1,2).equals("+")){
				result = 2.3;
			} else if (grade.substring(1,2).equals("-")) {
				result = 1.7;
			} else {
				result = 2.0
			}
		} else if (grade.substring(0,1).equals("D")){
			if (grade.substring(1,2).equals("+")){
				result = 1.3;
			} else if (grade.substring(1,2).equals("-")) {
				result = 0.7;
			} else {
				result = 1.0
			}
		} else if (grade.substring(0,1).equals("F")){
			result = 0;
		} else {
			System.out.println("Error. The letter grade is invalid." );
		}
		
		System.out.println("The numeric value is : " + result );
		
		input.close();
		
		System.exit(0);
		
	}
	
}
