/* 

19.- Write a program that draws two solid squares: one in pink and one in purple. Use a standard color for one of them and a custom color for the other. Provide a class TwoSquareViewer and a class TwoSquareComponent.

*/

import javax.swing.JComponent;
import java.awt.*;

public class TwoSquareComponent extends JComponent {

	public void paintComponent(Graphics graphicsObj) {

		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		Rectangle box = new Rectangle(75, 75, 100 , 100);
		Color pink = new Color(255, 204, 255);
		graphicsObj2D.setColor(pink);
		graphicsObj2D.fill(box);
		box.translate(120, 0);
		graphicsObj2D.setColor(Color.MAGENTA);
		graphicsObj2D.fill(box);

	}

}