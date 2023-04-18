/* 

5.- In this exercise, you will explore a simple way of visualizing a Rectangle object. The setBounds method of the JFrame class moves a frame window to a given rectangle.

*/

import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TranslateDemo {

	public static void main(String[] args) throws InterruptedException {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Rectangle recObj = new Rectangle(200,200,400,300);
		frame.setBounds(recObj);
		Thread.sleep(2000);
		JOptionPane.showMessageDialog(frame, "Click OK to continue");
		recObj.translate(450, -100);
		recObj.setSize(500,500);
		frame.setBounds(recObj);

	}

}
