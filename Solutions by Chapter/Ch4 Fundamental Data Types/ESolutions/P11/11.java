/* 

11.- Change the Menu class in Worked Example 3.1 so that the menu options are labeled A, B, C, and so on.

*/

import java.util.Scanner;

class Menu {
	
	private String menuText;
	private int optionCount;
	
	public Menu() {
		menuText = "";
		optionCount = -1;
	}
	
	public void addOption(String option) {
		optionCount += 1;
		if (optionCount >= 26) optionCount = 0;
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		menuText = menuText + letters.charAt(optionCount) + ") " + option + "\n";
	}
	
	public void display() {
		System.out.println(menuText);
	}
}

public class MenuDemo {
	
	public static void main(String[] args)  {
		
		Menu mainMenu = new Menu();
		mainMenu.addOption("Open new account");
		mainMenu.addOption("Log into existing account");
		mainMenu.addOption("Help");
		mainMenu.addOption("Quit");
		
		mainMenu.display();
		
		System.exit(0);
	}
}
