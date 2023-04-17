/*

22.- How would you modify the TaxCalculator.java program in order to check that the user entered a correct value for the marital status (i.e., Y or N)?

*/

public class TaxCalculatorTester  {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your income: ");
		double income = in.nextDouble();
		
		System.out.print("Are you married? (Y/N) ");
		String input = in.next();
		
		int status;
		
		if (input.equals("Y")) {
			status = TaxReturn.MARRIED;
		} else if (maritalStatus.equals("N")) {
			status = TaxReturn.SINGLE;
		} else {
			System.out.println( "Error: Please answer Y or N.");
		}
		
		TaxReturn aTaxReturn = new TaxReturn(income, status);
		
		System.out.println("Tax: " + aTaxReturn.getTax());
		
		System.exit(0);
		
	}
}