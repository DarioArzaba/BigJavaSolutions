/* 

2.- You want to find out which fraction of your car’s use is for commuting to work, and which is for personal use. You know the one-way distance from your home to work. For a particular period, you recorded the beginning and ending mileage on the odometer and the number of work days. Write an algorithm to settle this question.

A.

	Start by getting the Distance (in Miles) from Home to Work.
	Get the Total Distance (in Miles) from the odometer.
	Get the Number of Work Days.
	Define the Distance for Work as the Distance times the Number of Work Days.
	Define the Fraction for Work as the Distance for Work divided by the Total Distance times 100.
	Define the Fraction for Everything as 100 minus the Fraction for Work.
	End by returning the Fraction for Work and the Fraction for Everything else.

*/

public class CommutingTime {
	
	public static void main(String[] args){
		
		double distance = 150;
		double odometerDistance = 8000;
		int workDays = 7;
		
		double distanceWork = (distance * workDays)*(2);
		double fractionWork = (((distanceWork)/(odometerDistance))*100);
		double fractionEverything = (100 - fractionWork);
		
		System.out.println("The fraction of your car usage commuting to work is " + fractionWork + "%.");
		System.out.println("Therefore the fraction for personal use is " + fractionEverything + "%.");
		System.exit(0);
	}
		
}

