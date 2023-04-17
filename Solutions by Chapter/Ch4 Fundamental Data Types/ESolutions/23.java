/* 

23.- Implement a class SodaCan whose constructor receives the height and diameter of the soda can. Supply methods getVolume and getSurfaceArea. Supply a SodaCanTester class that tests your class.

*/

import java.text.DecimalFormat;

class SodaCan {
	
	private double height;
	private double diameter;
	private double volume;
	private double surfaceArea;
	
	public SodaCan (double h, double d){
		height = h;
		diameter = d;
		volume = Math.PI*((diameter/2.0)*(diameter/2.0))*height;
		surfaceArea = (2*Math.PI*(diameter/2.0)*height)+ (2*Math.PI*((diameter/2.0)*(diameter/2.0)));
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
		return (diameter/2.0);
	}
}

public class SodaCanTester {
	
	public static void main(String[] args) {
		
		DecimalFormat f = new DecimalFormat("##########.###");
		
		SodaCan soda = new SodaCan(13.6, 14);
		
		System.out.println("Radius       : " + f.format(soda.getRadius()));
		
		System.out.println("Heigth       : " + f.format(soda.getHeight()));
		
		System.out.println("Volume       : " + f.format(soda.getVolume()));
		
		System.out.println("Surface Area : " + f.format(soda.getSurfaceArea()));
		
		System.exit(0);
		
	}
	
}