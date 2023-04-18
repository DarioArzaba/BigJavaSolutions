/* 

7.- Write a program that reads in the x- and y-coordinates of four corner points of a quadrilateral and prints out whether it is a square, a rectangle, a trapezoid, a rhombus, or none of those shapes.

*/

import java.util.Scanner;

class QuadrilateralCalculator {
	
	private double x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0, x4 = 0, y4 = 0;
	
	public QuadrilateralCalculator (double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}
	
	public double getLengtha(){
		double length = Math.hypot((x2-x1),(y2-y1));
		return length;
	}
	
	public double getLengthb(){
		double length = Math.hypot((x3-x2),(y3-y2));
		return length;
	}
	
	public double getLengthc(){
		double length = Math.hypot((x4-x3),(y4-y3));
		return length;
	}
	
	public double getLengthd(){
		double length = Math.hypot((x1-x4),(y1-y4));
		return length;
	}
	
	public double getLengthe(){
		double length = Math.hypot((x3-x1),(y3-y1));
		return length;
	}
	
	public double getLengthf(){
		double length = Math.hypot((x2-x4),(y2-y4));
		return length;
	}
	
	public boolean allParallel(){
		double m1, m2, m3, m4;
		if (Math.abs(x2 - x1) != 0){
			m1 = Math.abs(((y2-y1)/(x2-x1)));
		} else {
			m1 = 0;
		}
		
		if (Math.abs(x3 - x2) != 0){
			m2 = Math.abs(((y3-y2)/(x3-x2)));
		} else {
			m2 = 0;
		}
		
		if (Math.abs(x4 - x3) != 0){
			m3 = Math.abs(((y4-y3)/(x4-x3)));
		} else {
			m3 = 0;
		}
		
		if (Math.abs(x1 - x4) != 0){
			m4 = Math.abs(((y1-y4)/(x1-x4)));
		} else {
			m4 = 0;
		}
		
		if ((m1 == m3) && (m2 == m4)){
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean allSameSize(){
		
		if (getLengtha()==getLengthc() && getLengthb()==getLengthd() && getLengtha() == getLengthb()){
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean pairParallel(){
		double m1, m2, m3, m4;
		if (Math.abs(x2 - x1) != 0){
			m1 = Math.abs(((y2-y1)/(x2-x1)));
		} else {
			m1 = 0;
		}
		
		if (Math.abs(x3 - x2) != 0){
			m2 = Math.abs(((y3-y2)/(x3-x2)));
		} else {
			m2 = 0;
		}
		
		if (Math.abs(x4 - x3) != 0){
			m3 = Math.abs(((y4-y3)/(x4-x3)));
		} else {
			m3 = 0;
		}
		
		if (Math.abs(x1 - x4) != 0){
			m4 = Math.abs(((y1-y4)/(x1-x4)));
		} else {
			m4 = 0;
		}
		
		if ((m1 == m3) && (m2 == m4)){
			return false;
		} else if ((m1 == m4) || (m2 == m3)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean allRect(){
		
		double m1, m2, m3, m4;
		if (Math.abs(x2 - x1) != 0){
			m1 = Math.abs(((y2-y1)/(x2-x1)));
		} else {
			m1 = 0;
		}
		
		if (Math.abs(x3 - x2) != 0){
			m2 = Math.abs(((y3-y2)/(x3-x2)));
		} else {
			m2 = 0;
		}
		
		if (Math.abs(x4 - x3) != 0){
			m3 = Math.abs(((y4-y3)/(x4-x3)));
		} else {
			m3 = 0;
		}
		
		if (Math.abs(x1 - x4) != 0){
			m4 = Math.abs(((y1-y4)/(x1-x4)));
		} else {
			m4 = 0;
		}
		
		if ((m1 == 0 && m2 == 0) && (m3 == 0 && m4 == 0)){
			return true;
		} else if ((m1*m2 == -1) && (m3*m4 == -1)){
			return true;
		} else {
			return false;
		}
		
		
	}
	
	public String state() {
		
		String state = "";
		
		if (allParallel() && allSameSize() && allRect()){
			state = "square";
		} else if (allParallel() && allSameSize()){
			state = "rhombus";
		} else if (allParallel() && allRect()){
			state = "rectangle";
		} else if (pairParallel()){
			state = "trapezoid";
		} else {
			state = "none";
		}
		
		return state;
	}
	
	
}

public class QuadrilateralCalculatorTester {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("First Point X Coordinate : " );
		double x1 = input.nextDouble();
		
		System.out.print("First Point Y Coordinate : " );
		double y1 = input.nextDouble();
		
		System.out.print("Second Point X Coordinate : " );
		double x2 = input.nextDouble();
		
		System.out.print("Second Point Y Coordinate : " );
		double y2 = input.nextDouble();
		
		System.out.print("Third Point X Coordinate : " );
		double x3 = input.nextDouble();
		
		System.out.print("Third Point Y Coordinate : " );
		double y3 = input.nextDouble();
		
		System.out.print("Fourth Point X Coordinate : " );
		double x4 = input.nextDouble();
		
		System.out.print("Fourth Point Y Coordinate : " );
		double y4 = input.nextDouble();
		
		QuadrilateralCalculator quadri = new QuadrilateralCalculator(x1, y1, x2, y2, x3, y3, x4, y4);
		
		System.out.print("Quadrilateral State : " + quadri.state());
		
		input.close();
		
		System.exit(0);
		
	}
	
}
