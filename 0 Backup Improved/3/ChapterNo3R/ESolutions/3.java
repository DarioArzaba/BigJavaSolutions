/* 

3.- Simulate a circuit for controlling a hallway light that has switches at both ends of the hallway. Each switch can be up or down, and the light can be on or off. Toggling either switch turns the lamp on or off. Provide methods:

	public int getFirstSwitchState() // 0 for down, 1 for up
	public int getSecondSwitchState()
	public int getLampState() // 0 for off, 1 for on
	public void toggleFirstSwitch()
	public void toggleSecondSwitch()

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


public class CircuitTest {
	
	public static void main(String[] args){
		
		Circuit circuitObj =  new Circuit();
		System.out.println("First Switch: " + circuitObj.getFirstSwitchState());
		System.out.println("Second Switch: " + circuitObj.getSecondSwitchState());
		System.out.println("Lamp State: " + circuitObj.getLampState() + "\n");
		
		circuitObj.toggleFirstSwitch();
		System.out.println("First Switch: " + circuitObj.getFirstSwitchState());
		System.out.println("Second Switch: " + circuitObj.getSecondSwitchState());
		System.out.println("Lamp State: " + circuitObj.getLampState() + "\n");
		
		circuitObj.toggleSecondSwitch();
		System.out.println("First Switch: " + circuitObj.getFirstSwitchState());
		System.out.println("Second Switch: " + circuitObj.getSecondSwitchState());
		System.out.println("Lamp State: " + circuitObj.getLampState() + "\n");
		
		System.exit(0);
	}

}
