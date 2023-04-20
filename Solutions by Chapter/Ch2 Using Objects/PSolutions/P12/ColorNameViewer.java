/* 

12.- Write a graphics program that draws 12 strings, one each for the 12 standard colors (except Color.WHITE), each in its own color.

*/

import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JFrame;

class drawComponentColorName extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		graphicsObj2D.drawString("BLACK", 175, 40);
		graphicsObj2D.setColor(Color.BLUE);
		graphicsObj2D.drawString("BLUE", 175, 60);
		graphicsObj2D.setColor(Color.CYAN);
		graphicsObj2D.drawString("CYAN", 175, 80);
		graphicsObj2D.setColor(Color.DARK_GRAY);
		graphicsObj2D.drawString("DARK_GRAY", 175, 100);
		graphicsObj2D.setColor(Color.GRAY);
		graphicsObj2D.drawString("GRAY", 175, 120);
		graphicsObj2D.setColor(Color.GREEN);
		graphicsObj2D.drawString("GREEN", 175, 140);
		graphicsObj2D.setColor(Color.LIGHT_GRAY);
		graphicsObj2D.drawString("LIGHT_GRAY", 175, 160);
		graphicsObj2D.setColor(Color.MAGENTA);
		graphicsObj2D.drawString("MAGENTA", 175, 180);
		graphicsObj2D.setColor(Color.ORANGE);
		graphicsObj2D.drawString("ORANGE", 175, 200);
		graphicsObj2D.setColor(Color.PINK);
		graphicsObj2D.drawString("PINK", 175, 220);
		graphicsObj2D.setColor(Color.RED);
		graphicsObj2D.drawString("RED", 175, 240);
		graphicsObj2D.setColor(Color.YELLOW);
		graphicsObj2D.drawString("YELLOW", 175, 260);

	}
}

public class ColorNameViewer {

	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(450, 200, 500, 400);
		window.setTitle("Strings in Colors");
		Color backgroundColor = new Color(255, 255, 255);
		window.getContentPane().setBackground(backgroundColor);
		drawComponentColorName drawComp = new drawComponentColorName();
		window.add(drawComp);
		window.setVisible(true);
		
	}

}
