/* 

10.- Construct a Color object with red, green and blue of 50, 100 and 150. 
	Apply the (brighter) method of the Color class. Then display the color in a JFrame.

*/

import java.awt.*;
import javax.swing.JFrame;

public class BrighterDemoTwo {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(450, 200, 215, 237);
		Color myColor = new Color(50, 100, 150 ).brighter();
		window.getContentPane().setBackground(myColor);
		window.setVisible(true);
	}
}
