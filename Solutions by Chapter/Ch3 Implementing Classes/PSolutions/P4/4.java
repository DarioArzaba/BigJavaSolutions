/* 

4.- A microwave control panel has four buttons: one for increasing the time by 30 seconds, one for switching between power levels 1 and 2, a reset button, and a start button. Implement a class that simulates the microwave, with a method for each button. The method for the start button should print a message “Cooking for ... seconds at level ...”.

*/

class Microwave {
	
	private int timeSeconds;
	private int powerLevel;
	
	Microwave() {
		timeSeconds = 0;
		powerLevel = 1;
	}
	
	void increaseTime() {
		timeSeconds += 30;
	}
	
	void switchPowerLevel() {
		if (powerLevel == 1){
			powerLevel = 2;
		} else {
			powerLevel = 1;
		}
	}
	
	void resetMicrowave(){
		timeSeconds = 0;
		powerLevel = 1;
	}
	
	void startMicrowave() {
		System.out.println("Cooking for " + timeSeconds  + " seconds at level " + powerLevel);
	}
	
}

public class MicrowaveTestButtons {
	
	public static void main(String[] args){
		
		Microwave myMicrowave = new Microwave();
		
		myMicrowave.increaseTime();
		myMicrowave.increaseTime();
		myMicrowave.switchPowerLevel();
		
		myMicrowave.startMicrowave();
		
		myMicrowave.resetMicrowave();
		myMicrowave.increaseTime();
		
		myMicrowave.startMicrowave();
		
		System.exit(0);
		
	}
	
}

