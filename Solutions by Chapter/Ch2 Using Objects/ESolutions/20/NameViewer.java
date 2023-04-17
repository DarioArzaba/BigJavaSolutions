/* 

10.-  Write a graphics program that draws your name in red, contained inside a blue rectangle. Provide a class NameViewer and a class NameComponent.

*/

import javax.swing.JFrame;
import java.awt.Color;

public class NameViewer {
	
	public static void main(String[] args) {
	
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(400, 200, 415, 337);
		window.setTitle("Red Name w Blue Background");
		Color colorFondo = new Color(204, 255, 204);
		window.getContentPane().setBackground(colorFondo);
		NameComponent component = new NameComponent();
		window.add(component);
		window.setVisible(true);
		
	}
	
}
