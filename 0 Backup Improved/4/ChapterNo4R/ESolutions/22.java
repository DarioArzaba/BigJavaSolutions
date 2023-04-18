/* 

22.- Implement a class IceCreamCone with methods getSurfaceArea() and getVolume(). In the constructor, supply the height and radius of the cone. Be careful when looking up the formula for the surface area—you should only include the outside area along theside of the cone because the cone has an opening on the top to hold the ice cream.

*/


import java.text.DecimalFormat;

class IceCreamCone {
	
	private double radius;
	private double height;
	private double volume;
	private double surfaceArea;
	
	public IceCreamCone (double h, double r){
		height = h;
		radius = r;
		volume = ((Math.PI*(radius*radius))*(height))/(3.0);
		surfaceArea = ((Math.PI)*(radius)*(Math.sqrt(((height*height)+(radius*radius)))));
	}
	
	double getVolume (){
		return volume;
	}
	
	double getSurfaceArea (){
		return surfaceArea;
	}
	
	double getHeight (){
		return height;
	}
	
	double getRadius (){
		return radius;
	}
}

public class IceCreamConeTester {
	
	public static void main(String[] args) {
		
		DecimalFormat f = new DecimalFormat("##########.###");
		
		IceCreamCone iceCreamCone = new IceCreamCone(13.6, 14);
		
		System.out.println("Radius       : " + f.format(iceCreamCone.getRadius()));
		
		System.out.println("Heigth       : " + f.format(iceCreamCone.getHeight()));
		
		System.out.println("Volume       : " + f.format(iceCreamCone.getVolume()));
		
		System.out.println("Surface Area : " + f.format(iceCreamCone.getSurfaceArea()));
		
		System.exit(0);
		
	}
	
}