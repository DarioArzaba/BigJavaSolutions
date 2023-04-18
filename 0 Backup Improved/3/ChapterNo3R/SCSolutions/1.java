/* 

1.- Supply the body of a method: public void unclick(), that undoes an unwanted button click.

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
	
	public void unclick() {
		value = value - 1;
	}
	
}

public class CounterUndoTest {
	
	public static void main(String[] args){
		
		Counter counterObj =  new Counter();
		counterObj.click();
		counterObj.click();
		counterObj.unclick();
		System.out.println("Clicks: " + counterObj.getValue());
		
		System.exit(0);
		
	}
	
}