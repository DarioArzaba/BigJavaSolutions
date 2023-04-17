/* 

10.- Implement a class RoachPopulation that simulates the growth of a roach population. The constructor takes the size of the initial roach population. The breed method simulates a period in which the roaches breed, which doubles their population. The

	spray(double percent)

method simulates spraying with insecticide, which reduces the population by the given percentage. The

	getRoaches
 
method returns the current number of roaches. A program called RoachSimulation simulates a population that starts out with
10 roaches. Breed, spray to reduce the population by 10 percent, and print the roach count. Repeat three more times.

*/

class RoachPopulation {
	
	private int roaches;
	
	/**
	 * Constructs roaches population with initial number parameter.
	 * @param initial the initial number of roaches
	 */
	RoachPopulation(int initial) {
		roaches = initial;
	}
	
	/**
	 * Doubles population of roaches.
	 */
	void breed() {
		roaches *= 2;
	}
	
	/**
	 * Reduces number of roaches by the given percent.
	 * @param percent the number of roaches to reduce
	 */
	void spray(double percent) {
		roaches = (int)(roaches - ((roaches * percent) / 100));
	}
	
	/**
	 * Gets the current number of roaches.
	 * @return the number of roaches
	 */
	int getRoaches() {
		return roaches;
	}
	
}

public class RoachPopulationSimulation  {
	public static void main(String[] args) {
		
		RoachPopulation roaches = new RoachPopulation(10);
		
		System.out.print("Roaches: ");
		System.out.println(roaches.getRoaches());
		
		roaches.spray(10.0);
		System.out.print("Roaches: ");
		System.out.println(roaches.getRoaches());
		
		roaches.breed();
		roaches.spray(10.0);
		System.out.print("Roaches: ");
		System.out.println(roaches.getRoaches());
		
		roaches.breed();
		roaches.spray(10.0);
		System.out.print("Roaches: ");
		System.out.println(roaches.getRoaches());
		
		System.exit(0);
	}
}