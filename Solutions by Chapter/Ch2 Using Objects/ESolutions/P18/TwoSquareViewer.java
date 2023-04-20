/* 

18.- Write a graphics program that draws two squares, both with the same center. 
	Provide a class TwoSquareViewer and a class TwoSquareComponent.

*/

import javax.swing.JFrame;
import java.awt.Color;

public class TwoSquareViewer {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(450, 200, 415, 337);
		window.setTitle("Two Squares");
		Color colorFondo = new Color(204, 255, 204);
		window.getContentPane().setBackground(colorFondo);
		TwoSquareComponentCenter component = new TwoSquareComponentCenter();
		window.add(component);	
		window.setVisible(true);
	}
}
