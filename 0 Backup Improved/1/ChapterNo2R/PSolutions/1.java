/* 

1.- You want to decide whether you should drive your car to work or take the train. You know the one-way distance from your home to your place of work, and the fuel efficiency of your car (in miles per gallon). You also know the one-way price of a train ticket. You assume the cost of gas at $4 per gallon, and car maintenance at 5 cents per mile. Write an algorithm to decide which commute is cheaper.

A.

	Start by getting the Distance in Miles, from Home to Work.
	Get the Efficiency by Mile as (Miles per Gallon).
	Get the Price of Train ticket
	Define Maintenance Cost as 0.05 cents per mile.
	Define the Gas Gallon Cost as 4 dollars.
	Define the Gallons Used as the distance divided by the efficiency per mile.
	Define the Total Gallon Cost as the Gallons Used times the Gas Gallon Cost.
	Define the Total Maintenance Cost as the Distance times the Maintenance Cost.
	Define the Car Price as the Total Gallon Cost plus the Total Maintenance Cost.
	If the Price of Train Ticket is less than the Car Price
		Define the Cheaper Commute as the Train
	Else
		Define the Cheaper Commute as the Car.
	End by returning the Cheaper Commute.

*/

public class CheaperCommuteCalc {
	
	public static void main(String[] args){
		
		double distanceMiles = 100;
		double milesPerGallon = 16;
		double trainTicketCost = 30;
		
		double maintenancePerMileCost = 0.05;
		double gallonCost = 4;

		double gallonsUsed = distanceMiles / milesPerGallon; 
		double totalGallonCost = gallonsUsed * gallonCost;
		double totalMaintenanceCost = distanceMiles * maintenancePerMileCost;
		double carPrice = totalGallonCost + totalMaintenanceCost;

		if (trainTicketCost < carPrice) {
			System.out.println("It will be cheaper to use the train.");
		} else {
			System.out.println("It will be cheaper to use your car.");
		}
				
		System.exit(0);
	}
	
}

