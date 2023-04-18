/* 

41.- How can a program display two frames at once?

A. By constructing and displaying two JFrame objects.

*/

import javax.swing.JFrame;

public class TwoFramesAtOnce {
		
	public static void main(String[] args){
		
		JFrame firstWindow = new JFrame();
		firstWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		firstWindow.setBounds(300, 200, 217, 240);
		firstWindow.setVisible(true);
	    
		JFrame secondWindow = new JFrame();
		secondWindow.setBounds(600, 200, 217, 240);
		secondWindow.setVisible(true);
		
	}

}

