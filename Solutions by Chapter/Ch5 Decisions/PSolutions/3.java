/* 

3.- The TaxReturn.java program uses a simplified version of the 2008 U.S. income tax schedule. Look up the tax brackets and rates for the current year, for both single and married filers, and implement a program that computes the actual income tax.

Source: https://www.bankrate.com/finance/taxes/tax-brackets.aspx

*/

import java.util.Scanner;

class TaxReturn {
	
	public static final int SINGLE = 1;
	public static final int MARRIED = 2;
	
	private double income;
	private int status;
	private boolean error = false;
	
	public TaxReturn(double anIncome, int aStatus) {
		income = anIncome;
		status = aStatus;
	}
	
	public double getTax() {
		
		double tax = 0;
		
		if (status == SINGLE){
			
			if (income >= 500000){
				tax = ((income)*(0.37));
			} else if (income >= 200000){
				tax = ((income)*(0.35));
			} else if (income >= 157500){
				tax = ((income)*(0.32));
			} else if (income >= 82500){
				tax = ((income)*(0.24));
			} else if (income >= 38700){
				tax = ((income)*(0.22));
			} else if (income >= 9525){
				tax = ((income)*(0.12));
			} else if (income >= 0){
				tax = ((income)*(0.10));
			} else {
				System.out.println("Error. The income cannot be negative." );
				error = true;
			}
			
		} else if (status == MARRIED){
			
			if (income >= 600000){
				tax = ((income)*(0.37));
			} else if (income >= 400000){
				tax = ((income)*(0.35));
			} else if (income >= 315000){
				tax = ((income)*(0.32));
			} else if (income >= 165000){
				tax = ((income)*(0.24));
			} else if (income >= 77400){
				tax = ((income)*(0.22));
			} else if (income >= 19050){
				tax = ((income)*(0.12));
			} else if (income >= 0){
				tax = ((income)*(0.10));
			} else {
				System.out.println("Error. The income cannot be negative." );
				error = true;
			}
			
		} else {
			System.out.println("Error. Invalid marital status." );
			error = true;
		}
		
		return tax;
		
	}
	
	public boolean getError(){
		double test = getTax(); //This is to trigger the error
		return error;
	}
	
}

public class TaxReturnPrinter {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Are you single or married (1/2): " );
		int status = input.nextInt();
		
		System.out.print("Enter you income : " );
		double income = input.nextDouble();
		
		TaxReturn taxInfo = new TaxReturn(income, status);
		
		if (!(taxInfo.getError())){
			System.out.printf("Tax: %.2f" , taxInfo.getTax());
		}
		
		input.close();
		
		System.exit(0);
		
	}
	
}
