/* 

What is the value of mystery after this sequence of statements?
	
	int mystery = 1;
	mystery = 1 - 2 * mystery;
	mystery = mystery + 1;

A. 0

*/

public class MysteryValuePrinter {

	public static void main(String[] args) {
		
		int mystery = 1;
		mystery = 1 - 2 * mystery;
		mystery = mystery + 1;
		System.out.println("Value of Mystery : " + mystery);

		System.exit(0);
	}

}

