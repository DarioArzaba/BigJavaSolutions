/* 

11.- Implement a class Employee. An employee has a name (a string) and a salary (a double). Provide a constructor with two arguments public Employee(String employeeName, double currentSalary) and methods:

	public String getName()
	public double getSalary()
	public void raiseSalary(double byPercent)
	
	These methods return the name and salary, and raise the employee’s salary by a certain percentage. Sample usage:

	Employee harry = new Employee("Hacker, Harry", 50000);
	harry.raiseSalary(10); // Harry gets a 10 percent raise
	Supply an EmployeeTester class that tests all methods.

*/

class Employee {
	
	private String name;
	private double salary;
	
	Employee(String name, double salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void raiseSalary(double byPercent) {
		this.salary += (this.salary * byPercent) / 100;
	}
	
}

public class EmployeeTester {
	
	public static void main(String[] args){
		
		Employee harry = new Employee("Hacker, Harry", 12345);
		System.out.println(harry.getName() + " salary is " + harry.getSalary());
		harry.raiseSalary(10);
		System.out.println("After a %10 increase now it is: ");
		System.out.println(harry.getName() + " salary is " + harry.getSalary());
		
		System.exit(0);
	}

}

