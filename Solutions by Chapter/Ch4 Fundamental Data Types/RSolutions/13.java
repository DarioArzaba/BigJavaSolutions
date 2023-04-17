/* 

13.- Consider the following code:
	
	CashRegister register = new CashRegister();
	register.recordPurchase(19.93);
	register.receivePayment(20, 0, 0, 0, 0);
	System.out.print("Change: ");
	System.out.println(register.giveChange());
	
The code segment prints the total as 0.07000000000000028. Explain why. Give a recommendation to improve the code so that users will not be confused.

A. Since we are using double floating point numbers for some exact numbers there will be rounding errors. In this case we can ignore the wrong rounding and only use the digits that we need (0.07). To do that we format the string that we show the user exchanging the last statement for:

	System.out.printf("%.2f" , register.giveChange());
	

*/

