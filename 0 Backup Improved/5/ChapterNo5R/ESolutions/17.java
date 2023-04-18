/* 

17.- Write a program that translates a number between 0 and 4 into the closest letter grade. For example, the number 2.8 (which might have been the average of several grades) would be converted to B–. Break ties in favor of the better grade; for example
	
	2.85 should be a B.
	
Use a class Grade with a method getNumericGrade.

*/

import java.util.Scanner;

public class GradeNumberTranslator {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number grade (0-4) : " );
		double grade = input.nextDouble();
		
		String letter = "";
		boolean correct = true;
		
		if (grade <= 4 && grade >= 0){
			
			if (grade == 4){
				letter = "A+";
			} else if (grade >= 3.85) {
				letter = "A";
			} else if (grade >= 3.7){
				letter = "A-";
			} else if (grade >= 3.15){
				letter = "B+";
			} else if (grade >= 2.85){
				letter = "B";
			} else if (grade >= 2.7){
				letter = "B-";
			} else if (grade >= 2.15){
				letter = "C+";
			} else if (grade >= 1.85){
				letter = "C";
			} else if (grade >= 1.7){
				letter = "C-";
			} else if (grade >= 1.15){
				letter = "D+";
			} else if (grade >= 0.85){
				letter = "D";
			} else if (grade >= 0.7){
				letter = "D-";
			} else {
				letter = "F";
			}
			
		} else {
			System.out.println("Error. The number grade must be between 0 and 4." );
			correct = false;
		}
		
		if (correct){
			System.out.println("The letter is : " + letter );
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}