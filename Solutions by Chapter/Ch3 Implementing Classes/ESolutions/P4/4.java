/* 

4.- Write a CircuitTester class that tests all switch combinations in Exercise E3.3, printing out actual and expected states for the switches and lamps.

*/

class Circuit {
	
	private int firstSwitch = 0;
	private int secondSwitch = 0;
	private int lampState = 0;
	
	public Circuit(int initialFirstSwitch, int initialSecondSwitch){
		if (initialFirstSwitch == 1 && initialSecondSwitch == 1){
			firstSwitch = 1;
			secondSwitch = 1;
		} else if (initialFirstSwitch == 1 && initialSecondSwitch == 0) {
			firstSwitch = 1;
			secondSwitch = 0;
		} else if (initialFirstSwitch == 0 && initialSecondSwitch == 1) {
			firstSwitch = 0;
			secondSwitch = 1;
		} else {
			firstSwitch = 0;
			secondSwitch = 0;
		}
	}
	
	public Circuit(){
		this(0,0);
	}
	
	public int getFirstSwitchState(){
		return firstSwitch;
	}
	
	public int getSecondSwitchState(){
		return secondSwitch;
	}
	
	public int getLampState(){
		return lampState;
	}
	
	public void toggleFirstSwitch(){
		if (firstSwitch == 1){
			firstSwitch = 0;
		} else {
			firstSwitch = 1;
		}
		lampState = setLampState();
	}
	
	public void toggleSecondSwitch(){
		if (secondSwitch == 1){
			secondSwitch = 0;
		} else {
			secondSwitch = 1;
		}
		lampState = setLampState();
	}
	
	private int setLampState(){
		if (lampState == 1){
			lampState = 0;
		} else {
			lampState = 1;
		}
		return lampState;
	}
	
}


public class SecondCircuitTest {
	
	public static void main(String[] args){
		
		Circuit lamp = new Circuit();
		System.out.println("\nFirst: " + lamp.getFirstSwitchState());
		System.out.println("Second: " + lamp.getSecondSwitchState());
		System.out.println("Lamp: " + lamp.getLampState());
		System.out.println("Expected First: 0");
		System.out.println("Expected Second: 0");
		System.out.println("Expected Lamp: 0");
		
		lamp.toggleFirstSwitch();
		System.out.println("\nFirst: " + lamp.getFirstSwitchState());
		System.out.println("Second: " + lamp.getSecondSwitchState());
		System.out.println("Lamp: " + lamp.getLampState());
		System.out.println("Expected First: 1");
		System.out.println("Expected Second: 0");
		System.out.println("Expected Lamp: 1");
		
		lamp.toggleFirstSwitch();
		lamp.toggleSecondSwitch();
		System.out.println("\nFirst: " + lamp.getFirstSwitchState());
		System.out.println("Second: " + lamp.getSecondSwitchState());
		System.out.println("Lamp: " + lamp.getLampState());
		System.out.println("Expected First: 0");
		System.out.println("Expected Second: 1");
		System.out.println("Expected Lamp: 1");
		
		lamp.toggleFirstSwitch();
		System.out.println("\nFirst: " + lamp.getFirstSwitchState());
		System.out.println("Second: " + lamp.getSecondSwitchState());
		System.out.println("Lamp: " + lamp.getLampState());
		System.out.println("Expected First: 1");
		System.out.println("Expected Second: 1");
		System.out.println("Expected Lamp: 0");
		
		System.exit(0);
	}

}