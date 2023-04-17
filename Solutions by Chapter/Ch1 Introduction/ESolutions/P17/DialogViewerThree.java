/* 

17.- Modify the program below so that the dialog continues with the message “My name is Hal! What would you like me to do?” Discard the user’s input and display a message such as: I'm sorry, Dave. I'm afraid I can't do that. Then replace Dave with the name that was provided by the user

import javax.swing.JOptionPane;
public class DialogViewer {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println(name);
	}
}

*/

import javax.swing.JOptionPane;

public class DialogViewerThree {
	
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello, " + name + "!");
		JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
		System.out.println("I'm sorry, "+ name + ". I'm afraid I can't do that.");
		System.exit(0);
	}

}