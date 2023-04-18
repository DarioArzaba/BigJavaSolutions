/* 

12.- Implement a class Car with the following properties. A car has a certain fuel efficiency (measured in miles/gallon or liters/km—pick one) and a certain amount of fuel in the gas tank. The efficiency is specified in the constructor, and the initial fuel level is 0. Supply a method drive that simulates driving the car for a certain distance, reducing the amount of gasoline in the fuel tank. Also supply methods getGasInTank, returning the current amount of gasoline in the fuel tank, and addGas, to add gasoline to the fuel tank. Sample usage: 

	Car myHybrid = new Car(50); // 50 miles per gallon 
	myHybrid.addGas(20); // Tank 20 gallons 
	myHybrid.drive(100); // Drive 100 miles 
	double gasLeft = myHybrid.getGasInTank(); // Get gas remaining in tank 
	
	You may assume that the drive method is never called with a distance that consumes more than the available gas. Supply a CarTester class that tests all methods.

*/

class Car {
	
	private double gas = 0;
	private double efficiency;

	public Car(double carEfficiency) {
		efficiency = carEfficiency;
	}
	
	public void addGas(double addMore) {
		gas += addMore;
	}
	
	public void drive(double distance) {
		gas -= (distance/efficiency);
		if (gas <= 0) { gas = 0; }
	}
	
	public double getGasInTank() {
		return gas;
	}
	
}


public class CarTester {
	
	public static void main(String[] args){
		
		Car myHybrid = new Car(50);
		myHybrid.addGas(20);
		myHybrid.drive(100);
		double gasLeft = myHybrid.getGasInTank();
		System.out.println("Gas Left : " + gasLeft);
		
		System.exit(0);
	}

}