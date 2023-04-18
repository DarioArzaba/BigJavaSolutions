/* 

8.- Write a class Battery that models a rechargeable battery. A battery has a constructor

	public Battery(double capacity)

where capacity is a value measured in milliampere hours. A typical AA battery has a capacity of 2000 to 3000 mAh. The method

	public void drain(double amount)

drains the capacity of the battery by the given amount. The method

	public void charge()

charges the battery to its original capacity. The method

	public double getRemainingCapacity()

gets the remaining capacity of the battery.

*/

class Battery  {
	
	private double originalCapacity;
	private double currentCapacity;
	
	/**
	 * Constructs a battery with capacity parameter
	 * @param capacity initial battery capacity
	 */
	Battery(double capacity) {
		originalCapacity = capacity;
		currentCapacity = capacity;
	}
	
	/**
	 * Drains the capacity of the battery by the given amount.
	 * @param amount the amount to drain capacity
	 */
	void drain(double amount) {
		currentCapacity = Math.max(currentCapacity - amount, 0);
	}
	
	/**
	 * Charges the battery to its original capacity.
	 * Math.max(x, y) will return the greater value.
	 */
	void charge() {
		currentCapacity = originalCapacity;
	}
	
	/**
	 * Gets the remaining capacity of the battery.
	 * @return current capacity of the battery
	 */
	double getRemainingCapacity() {
		return currentCapacity;
	}
	
}

public class BatteryTesterRecharge {
	public static void main(String[] args) {
		
		Battery battery = new Battery(80);
		
		System.out.print("Initial capacity: ");
		System.out.println(battery.getRemainingCapacity());
		
		battery.drain(79);
		
		System.out.print("After Use capacity: ");
		System.out.println(battery.getRemainingCapacity());
		
		battery.charge();
		
		System.out.print("After Charge capacity: ");
		System.out.println(battery.getRemainingCapacity());
		
		System.exit(0);
		
	}
}
