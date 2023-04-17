/*

20.- Would that amount change if the first nested if statement changed from
	
	if (income <= RATE1_SINGLE_LIMIT)
	to
	if (income < RATE1_SINGLE_LIMIT)

A.

In the first case the tax amount would be:
(rate1 * income) + tax2
(0.10 * 32000) + 0 = 3200

In the second case the taz amount would be:
(rate1 * rate1limit) + (rate2 * (income - rate1limit)
(0.10 * 32000) + (0.25 * (32000 - 32000)) = 3200

Therefore the tax amount does not change.

*/

import java.util.Scanner;

public class TaxProgramSimulator {
	
	public static void main(String[] args){
		
		final int SINGLE = 1;
		final int MARRIED = 2;
		final double RATE1 = 0.10;
		final double RATE2 = 0.25;
		final double RATE1_SINGLE_LIMIT = 32000;
		final double RATE1_MARRIED_LIMIT = 64000;
		
		double income = 32000;
		int status = 1;
		
		double tax1 = 0;
		double tax2 = 0;
		
		if (status == SINGLE) {
			if (income <= RATE1_SINGLE_LIMIT) {
				tax1 = RATE1 * income;
			} else {
				tax1 = RATE1 * RATE1_SINGLE_LIMIT;
				tax2 = RATE2 * (income - RATE1_SINGLE_LIMIT);
			}
		} else {
			if (income <= RATE1_MARRIED_LIMIT) {
				tax1 = RATE1 * income;
			} else {
				tax1 = RATE1 * RATE1_MARRIED_LIMIT;
				tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);
			}
		}
		
		double taxResult = tax1 + tax2;
		
		System.out.println("Tax: " + taxResult );
		
		System.exit(0);
		
	}
	
}