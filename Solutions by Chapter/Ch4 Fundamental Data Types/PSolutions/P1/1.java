/* 

1.- Write a program that helps a person decide whether to buy a hybrid car. Your program’s inputs should be:

	The cost of a new car
	The estimated miles driven per year
	The estimated gas price
	The efficiency in miles per gallon
	The estimated resale value after 5 years

Compute the total cost of owning the car for five years. (For simplicity, we will not
take the cost of financing into account.) Obtain realistic prices for a new and used
hybrid and a comparable car from the Web. Run your program twice, using today’s
gas price and 15,000 miles per year. Include pseudocode and the program runs with
your assignment.

A.

	Get the initial cost of a new car.
	Get the efficiency of that car in mpg
	Get today's gas price per gallon
	milesDriven = 15000
	gallonsUsed = efficiency / milesDriven;
	annualCostGasUsed = gallonsUsed*todayGasPrice;
	totalGasCost = annualCostGasUsed*5;
	costCar = initialCost + totalGasCost;
	

*/

import java.math.BigDecimal;
import java.math.RoundingMode;

class BuyCarHelp {
	
	private BigDecimal milesDriverPerYear = new BigDecimal(0);
	private BigDecimal todayGasPricePerGallon = new BigDecimal(0);
	private BigDecimal costOfCar = new BigDecimal(0);
	private BigDecimal carEfficiencyInMilesPerGallon = new BigDecimal(0);
	
	public void setMilesDrivenPerYear(double miles){
		milesDriverPerYear = milesDriverPerYear.add(BigDecimal.valueOf(miles));
	}
	
	public void setTodayGasPricePerGallon(double price){
		todayGasPricePerGallon = todayGasPricePerGallon.add(BigDecimal.valueOf(price));
	}
	
	public void setCost(double cost){
		costOfCar = costOfCar.add(BigDecimal.valueOf(cost));
	}
	
	public void setCarEfficiencyInMilesPerGallon(double efficiency){
		carEfficiencyInMilesPerGallon = carEfficiencyInMilesPerGallon.add(BigDecimal.valueOf(efficiency));
	}
	
	public double getCostPerYears(int years){
		
		BigDecimal gallonsUsed = (milesDriverPerYear.divide(carEfficiencyInMilesPerGallon, 4, RoundingMode.HALF_UP));
		BigDecimal costGas = (gallonsUsed.multiply(todayGasPricePerGallon));
		costGas = costGas.multiply(BigDecimal.valueOf(years));
		BigDecimal cost = costGas.add(costOfCar);
		return (cost.setScale(4, RoundingMode.HALF_UP)).doubleValue();
		
	}
	
}

public class BuyCarHelpTester {
	
	public static void main(String[] args)  {
		
		final double TODAY_GAS_PRICE = 2.970;
		final double MILES_DRIVEN = 15000;
		
		BuyCarHelp hybrid = new BuyCarHelp();
		hybrid.setMilesDrivenPerYear(MILES_DRIVEN);
		hybrid.setTodayGasPricePerGallon(TODAY_GAS_PRICE);
		hybrid.setCost(22203.44);
		hybrid.setCarEfficiencyInMilesPerGallon(44);
		
		BuyCarHelp used = new BuyCarHelp();
		used.setMilesDrivenPerYear(MILES_DRIVEN);
		used.setTodayGasPricePerGallon(TODAY_GAS_PRICE);
		used.setCost(17900.58);
		used.setCarEfficiencyInMilesPerGallon(40);
		
		BuyCarHelp normal = new BuyCarHelp();
		normal.setMilesDrivenPerYear(MILES_DRIVEN);
		normal.setTodayGasPricePerGallon(TODAY_GAS_PRICE);
		normal.setCost(11380.28);
		normal.setCarEfficiencyInMilesPerGallon(25);
		
		double costOfHybrid = hybrid.getCostPerYears(5);
		double costOfUsedHybrid = used.getCostPerYears(5);
		double costOfNormalCar = normal.getCostPerYears(5);
		
		System.out.println("The cost of a new hybrid is   : " + costOfHybrid);
		System.out.println("The cost of a used hybrid is  : " + costOfUsedHybrid);
		System.out.println("The cost of a new car is      : " + costOfNormalCar);
		
		System.exit(0);
	}
}

