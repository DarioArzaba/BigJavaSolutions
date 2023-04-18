/* 

24.- Implement a class Balloon that models a spherical balloon that is being filled with air. The constructor constructs an empty balloon. Supply these methods:

	void addAir(double amount) adds the given amount of air
	double getVolume() gets the current volume
	double getSurfaceArea() gets the current surface area
	double getRadius() gets the current radius
	
Supply a BalloonTester class that constructs a balloon, adds 100 cm3 of air, tests the three accessor methods, adds another 100 cm3 of air, and tests the accessor methods again.

*/


import java.text.DecimalFormat;

class BallonSpherical {
	
	private double air;
	private double volume;
	private double surfaceArea;
	private double radius;
	
	public BallonSpherical (){
		air = 0;
	}
	
	void addAir(double amount){
		air += amount;
		volume = air;
		radius = Math.cbrt((3.0*volume)/(4.0*Math.PI));
		surfaceArea = 4.0*Math.PI*(radius*radius);
	}
	
	double getVolume(){
		return volume;
	}
	
	double getSurfaceArea(){
		return surfaceArea;
	}
	
	double getRadius(){
		return radius;
	}
	
}

public class BallonSphericalTester {
	
	public static void main(String[] args) {
		
		DecimalFormat f = new DecimalFormat("##########.###");
		
		BallonSpherical ballon = new BallonSpherical();
		
		ballon.addAir(100.0);
		
		System.out.println("Add 100 cm3 of air.");
		
		System.out.println("Volume       : " + f.format(ballon.getVolume()));
		
		System.out.println("Surface Area : " + f.format(ballon.getSurfaceArea()));
		
		System.out.println("Radius       : " + f.format(ballon.getRadius()));
		
		ballon.addAir(100.0);
		
		System.out.println("Add another 100 cm3 of air.");
		
		System.out.println("Volume       : " + f.format(ballon.getVolume()));
		
		System.out.println("Surface Area : " + f.format(ballon.getSurfaceArea()));
		
		System.out.println("Radius       : " + f.format(ballon.getRadius()));
		
		System.exit(0);
		
	}
	
}