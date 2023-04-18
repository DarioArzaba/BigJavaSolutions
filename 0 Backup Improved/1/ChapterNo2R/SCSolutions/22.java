/* 

22.- Suppose your cell phone carrier charges you $29.95 for up to 300 minutes of calls, and $0.45 for each additional minute, plus 12.5 percent taxes and fees. Give an algorithm to compute the monthly charge from a given number of minutes.

A.

If you surpassed your initial 300 minutes
	Get the the extra minutes used by subtracting 300 from the used minutes.
	Get the charge of the extra minutes multiplying them by 0.45
	Get the charge of the taxes multiplying the charge of the extra minutes plus 29.95 by 0.125
	Get the monthly charge by adding the charge of the extra minutes, the charge of the taxes and 29.95.
Else, if you didn't surpassed your initial 300 minutes
	Get the charge of the taxes by multiplying 29.95 by 0.125
	Get the monthly charge by adding the charge of the taxes and 29.95.

*/

public class HelloPrinter {
	public static void main(String[] args) {
		
		//Change this value to see your monthly charge.
		double usedMinutes = 0;
		
		double initialMinutes = 300;
		double initialMinutesCharge = 29.95;
		double extraPerMinute = 0.45;
		double taxesPercent = 12.5;
		
		double extraPerMinuteCharge = 0;
		double taxesCharge = 0;
		double monthlyCharge = 0;
		
		if (usedMinutes > initialMinutes){
			usedMinutes -= initialMinutes;
			extraPerMinuteCharge = (usedMinutes * extraPerMinute);
			taxesCharge = ( (initialMinutesCharge + extraPerMinuteCharge) * (taxesPercent/100) );
			monthlyCharge = initialMinutesCharge + extraPerMinuteCharge + taxesCharge;
		} else {
			taxesCharge = ( initialMinutesCharge * (taxesPercent/100) );
			monthlyCharge = initialMinutesCharge + taxesCharge;
		}
		
		System.out.println("Monthly Charge: $" + monthlyCharge);
		
		System.exit(0);
	}
}