/* 

5.- Change the public interface of the circuit class of Exercise E3.3 so that it has the following methods:

	public int getSwitchState(int switch)
	public int getLampState()
	public void toggleSwitch(int switch)
	
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
	
	public int getSwitchState(int switchName){
		if (switchName == 1){
			return getFirstSwitchState();
		} else if (switchName == 2){
			return getSecondSwitchState();
		} else {
			System.out.println("That is not a valid switch");
			return 0;
		}
	}

	public void toggleSwitch(int switchName){
		if (switchName == 1){
			toggleFirstSwitch();
		} else if (switchName == 2){
			toggleSecondSwitch();
		} else {
			System.out.println("That is not a valid switch");
		}
	}
	
}


public class CircuitToggleSwitch {
	
	public static void main(String[] args){
		
		Circuit circuitObj =  new Circuit();
		System.out.println("First Switch: " + circuitObj.getFirstSwitchState());
		System.out.println("Second Switch: " + circuitObj.getSecondSwitchState());
		System.out.println("Lamp State: " + circuitObj.getLampState() + "\n");
		
		circuitObj.toggleFirstSwitch();
		System.out.println("First Switch: " + circuitObj.getFirstSwitchState());
		System.out.println("Second Switch: " + circuitObj.getSecondSwitchState());
		System.out.println("Lamp State: " + circuitObj.getLampState() + "\n");
		
		circuitObj.toggleSwitch(2);
		System.out.println("First Switch: " + circuitObj.getSwitchState(1));
		System.out.println("Second Switch: " + circuitObj.getSwitchState(2));
		System.out.println("Lamp State: " + circuitObj.getLampState() + "\n");
		
		System.exit(0);
	}

}

