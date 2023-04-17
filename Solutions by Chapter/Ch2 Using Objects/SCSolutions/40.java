/* 

40.- How do you display a square frame with a title bar that reads “Hello, World!”?

A. By adding:

	int squareSize = 200;
	window.setSize(squareSize, squareSize);
	window.setTitle("Hello, World!");

*/

import javax.swing.JFrame;

public class FrameWithTitle {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int squareSize = 200;
		window.setSize(squareSize, squareSize);
		window.setTitle("Hello, World!");
	    window.setVisible(true);
	    
	}

}

