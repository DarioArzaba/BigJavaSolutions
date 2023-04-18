/* 

19.- Write a program that draws two solid squares: one in pink and one in purple. 
	Use a standard color for one of them and a custom color for the other. 
	Provide a class TwoSquareViewer and a class TwoSquareComponent.

*/

import javax.swing.JFrame;
import java.awt.Color;

public class TwoSquareViewer {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(400, 200, 415, 337);
		window.setTitle("Two Squares");
		Color colorFondo = new Color(204, 255, 204);
		window.getContentPane().setBackground(colorFondo);
		TwoSquareComponent component = new TwoSquareComponent();
		window.add(component);
		window.setVisible(true);
	}
}
