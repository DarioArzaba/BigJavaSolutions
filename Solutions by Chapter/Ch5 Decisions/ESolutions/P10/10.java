/* 

10.- Write a program that reads in the name and salary of an employee. Here the salary will denote an hourly wage, such as $9.25. Then ask how many hours the employee worked in the past week. Be sure to accept fractional hours. Compute the pay. Any overtime work (over 40 hours per week) is paid at 150 percent of the regular wage. Print a paycheck for the employee. In your solution, implement a class Paycheck.

*/

import java.util.Scanner;

public class HourSalaryCalculator {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Name : " );
		String name = input.next();
		
		System.out.print("Enter Hourly Wage : " );
		double salary = input.nextDouble();
		
		System.out.print("Enter hours worked last week : " );
		double hours = input.nextDouble();
		
		double totalSalary;
		
		if (hours > 40){
			totalSalary = salary*40;
			hours -= 40;
			salary *= 1.5;
			totalSalary += (salary*hours);
		} else {
			totalSalary = salary*hours;
		}
		
		System.out.println("Employee : " + name );
		System.out.printf("Salary Per Week : %.2f " , totalSalary );
		
		input.close();
		
		System.exit(0);
		
	}
	
}

