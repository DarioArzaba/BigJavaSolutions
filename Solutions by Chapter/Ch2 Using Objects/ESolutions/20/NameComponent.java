/* 

10.-  Write a graphics program that draws your name in red, contained inside a blue rectangle. Provide a class NameViewer and a class NameComponent.

*/

import javax.swing.JComponent;
import java.awt.*;

public class NameComponent extends JComponent {
	
	public void paintComponent(Graphics graphicsObj) {
	
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		Rectangle box = new Rectangle(45, 45, 320 , 150);
		graphicsObj2D.setColor(Color.BLUE);
		graphicsObj2D.fill(box);
		graphicsObj2D.setColor(Color.RED);
		graphicsObj2D.setFont(new Font("TimesRoman", Font.PLAIN, 45)); 
		graphicsObj2D.drawString("Dario Arzaba", 75, 135);
	
	}
	
}
