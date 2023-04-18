/* 

3.- Implement a class Balloon. A balloon starts out with radius 0. Supply a method:

	public void inflate(double amount)
	
that increases the radius by the given amount. Supply a method:

	public double getVolume()

that returns the current volume of the balloon. Use Math.PI for the value of π. To
compute the cube of a value r, just use r * r * r.

*/

class Balloon {
	
	private double radius;
	
	Balloon() {
		radius = 0;
	}
	
	void inflate(double amount) {
		radius += amount;
	}
	
	double getVolume() {
		return (4.0 / 3) * Math.PI * (radius * radius * radius);
	}

}

public class BalloonInflatorAndVolume {
	
	public static void main(String[] args){
		
		Balloon balloonNew = new Balloon();
		
		System.out.println("Balloon Volume: " + balloonNew.getVolume());
		
		balloonNew.inflate(5.0);
		
		System.out.println("Balloon Volume: " + balloonNew.getVolume());
		
		balloonNew.inflate(2.0);
		
		System.out.println("Balloon Volume: " + balloonNew.getVolume());
		
		System.exit(0);
		
	}
	
}