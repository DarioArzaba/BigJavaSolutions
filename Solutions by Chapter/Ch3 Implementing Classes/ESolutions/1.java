/* 

1.- Add a button to the tally counter in Section 3.1 that allows an operator to undo an accidental button click. Provide a method public void undo() that simulates such a button. As an added precaution, make sure that clicking the undo button more often than the click button has no effect. (Hint: The call Math.max(n, 0) returns n if n is greater than zero, zero otherwise.)

*/

class Counter {
	
	private int value = 0;
	
	public int getValue() {
		return value;
	}
	
	public void click() {
		value = value + 1;
	}
	
	public void reset() {
		value = 0;
	}
	
	public void undo(){
		value = Math.max((value-1), 0);
	}
	
}

public class CounterUndoTest {
	
	public static void main(String[] args){
		
		Counter counterObj =  new Counter();
		counterObj.click();
		counterObj.undo();
		counterObj.undo();
		counterObj.click();
		System.out.println(counterObj.getValue());

		System.exit(0);
		
	}

}

