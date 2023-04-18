/* 

2.- Simulate a tally counter that can be used to admit a limited number of people. First, the limit is set with a call public void setLimit(int maximum). If the click button is clicked more often than the limit, it has no effect. (Hint: The call Math.min(n, limit) returns n if n is less than limit, and limit otherwise.)

*/

class Counter {
	
	private int value = 0;
	private int limit = 0;
	
	public int getValue() {
		return value;
	}
	
	public void click() {
		if (limit != 0){
			value = Math.min((value+1), limit);
		} else {
			value++;
		}
	}
	
	public void reset() {
		value = 0;
	}
	
	public void undo(){
		value = Math.max((value-1), 0);
	}
	
	public void setLimit(int maximum){
		limit = maximum;
	}
}

public class CounterLimitTest {
	
	public static void main(String[] args){
		
		Counter counterObj =  new Counter();
		counterObj.click();
		counterObj.undo();
		counterObj.undo();
		counterObj.click();
		counterObj.setLimit(3);
		counterObj.click();
		counterObj.click();
		counterObj.click();
		System.out.println(counterObj.getValue());

		System.exit(0);
	}

}
