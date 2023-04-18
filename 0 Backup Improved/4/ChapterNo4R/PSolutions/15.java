/* 

15.- The circuit shown below illustrates some important aspects of the connection between a power company and one of its customers. The customer is represented by three parameters, Vt, P, and pf. Vt is the voltage accessed by plugging into a wall outlet. Customers depend on having a dependable value of Vt in order for their appliances to work properly. Accordingly, the power company regulates the value of Vt carefully. P describes the amount of power used by the customer and is the primary factor in determining the customer’s electric bill. The power factor, pf, is less familiar. (The power factor is calculated as the cosine of an angle so that its value will always be between zero and one.) In this problem you will be asked to write a Java program to investigate the significance of the power factor.

	With R = 10 Ohm , P = 260 W, Vt = 120 Vrms.

In the figure, the power lines are represented, somewhat simplistically, as resistances in Ohms. The power company is represented as an AC voltage source. The source voltage, Vs, required to provide the customer with power P at voltage Vt can be determined using the formula:

	Vs = Sqrt( (Vt + (2*R*P) / (Vt) )2 + ( (2*R*P) / (pf*Vt) )2 * (1 - pf2)  )

(Vs has units of Vrms.) This formula indicates that the value of Vs depends on the value of pf. Write a Java program that prompts the user for a power factor value and then prints a message giving the corresponding value of Vs, using the values for P, R, and Vt shown in the figure above.

*/

import java.math.BigDecimal;
import java.util.Scanner;

public class PowerFactorByCostumer {
	
	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		//Customer Power Usage in Watts
		double P = 260.0;
		
		//Customer needed Outlet Voltage in Vrms
		double Vt = 120.0;
		
		//Input and Ouput Power Lines resistance in Ohms.
		double R = 10.0;
		
		//Low pF means a bigger Vs and therefore the customer is more expensive.
		
		System.out.print("\nEnter the Power Factor of the Customer : ");
		double pF = input.nextDouble();
		
		while (pF >= 1 || pF <= 0){
			System.out.println("\nError. Power Factor must be between 0 and 1.");
			System.out.print("\nEnter the Power Factor of the Customer : ");
			pF = input.nextDouble();
		}
		
		double Vs = Math.sqrt(Math.pow((Vt+((2*R*P)/(Vt))), 2.0) + Math.pow(((2*R*P)/(pF*Vt)), 2.0)*(1 - Math.pow(pF, 2.0)));
		
		System.out.println("\nRequired Vs (L) : " + Vs + " Vrms");
		
		input.close();
		
		System.exit(0);
	}
	
}

