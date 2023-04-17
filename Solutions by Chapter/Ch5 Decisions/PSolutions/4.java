/* 

4.- Unit conversion. Write a unit conversion program that asks the users from which unit they want to convert (fl. oz, gal, oz, lb, in, ft, mi) and to which unit they want to convert (ml, l, g, kg, mm, cm, m, km). Reject incompatible conversions (such as gal → km). Ask for the value to be converted, then display the result:

	Convert from? gal
	Convert to? ml
	Value? 2.5
	2.5 gal = 9462.5 ml

*/

import java.util.Scanner;

class UnitConversion {
	
	private String unit1 = "";
	private String unit2 = "";
	private double value = 0;
	private double convertion = 0;
	
	public UnitConversion (String u1, String u2, double v){
		unit1 = u1;
		unit2 = u2;
		value = v;
	}
	
	public boolean validateConversion() {
		
		boolean error = false;
		
		if (value >= 0) {
			
			if (unit1.equals("fl oz")){
				if (unit2.equals("ml")){
					convertion = value*29.5735;
				} else if (unit2.equals("l")){
					convertion = value*0.0295735;
				} else {
					System.out.println("Error. Cannot convert from " + unit1 + " into "  + unit2);
					error = true;
				}
			} else if (unit1.equals("gal")){
				if (unit2.equals("ml")){
					convertion = value*3785.41;
				} else if (unit2.equals("l")){
					convertion = value*3.78541;
				} else {
					System.out.println("Error. Cannot convert from " + unit1 + " into "  + unit2);
					error = true;
				}
			} else if (unit1.equals("oz")){
				if (unit2.equals("g")){
					convertion = value*28.3495;
				} else if (unit2.equals("kg")){
					convertion = value*0.0283495;
				} else {
					System.out.println("Error. Cannot convert from " + unit1 + " into "  + unit2);
					error = true;
				}
			} else if (unit1.equals("lib")){
				if (unit2.equals("g")){
					convertion = value*453.592;
				} else if (unit2.equals("kg")){
					convertion = value*0.453592;
				} else {
					System.out.println("Error. Cannot convert from " + unit1 + " into "  + unit2);
					error = true;
				}
			} else if (unit1.equals("in")) {
				if (unit2.equals("mm")){
					convertion = value*25.4;
				} else if (unit2.equals("cm")){
					convertion = value*2.54;
				} else if (unit2.equals("m")){
					convertion = value*0.0254;
				} else if (unit2.equals("km")){
					convertion = value*0.0000254;
				} else {
					System.out.println("Error. Cannot convert from " + unit1 + " into "  + unit2);
					error = true;
				}
			} else if (unit1.equals("ft")){
				if (unit2.equals("mm")){
					convertion = value*304.8;
				} else if (unit2.equals("cm")){
					convertion = value*30.48;
				} else if (unit2.equals("m")){
					convertion = value*0.3048;
				} else if (unit2.equals("km")){
					convertion = value*0.0003048;
				} else {
					System.out.println("Error. Cannot convert from " + unit1 + " into "  + unit2);
					error = true;
				}
			} else if (unit1.equals("mi")){
				if (unit2.equals("mm")){
					convertion = value*1609340;
				} else if (unit2.equals("cm")){
					convertion = value*160934;
				} else if (unit2.equals("m")){
					convertion = value*1609.34;
				} else if (unit2.equals("km")){
					convertion = value*1.60934;
				} else {
					System.out.println("Error. Cannot convert from " + unit1 + " into "  + unit2);
					error = true;
				}
			}
			
		} else {
			System.out.println("Error. The value cannot be negative." );
			error = true;
		}
		
		return error;
		
	}
	
	public double conversion (){
		return convertion;
	}
	
}

public class UnitConversionTester {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Valid Units : fl oz, gal, oz, lb, in, ft, mi " );
		System.out.print("Convert from : " );
		String unit1 = input.next();
		
		System.out.print("Value : " );
		double value = input.nextDouble();
		
		System.out.println("Valid Units : ml, l, g, kg, mm, cm, m, km " );
		System.out.print("Convert to : " );
		String unit2 = input.next();
		
		UnitConversion valueInfo = new UnitConversion(unit1, unit2, value);
		
		if (!(valueInfo.validateConversion())){
			System.out.println("\n" + value + " " + unit1 + " = " + valueInfo.conversion() + " " + unit2);
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}
