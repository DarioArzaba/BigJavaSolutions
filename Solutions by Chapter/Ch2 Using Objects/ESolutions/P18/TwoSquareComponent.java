/* 

18.- Write a graphics program that draws two squares, both with the same center. Provide a class TwoSquareViewer and a class TwoSquareComponent.

*/

import javax.swing.JComponent;
import java.awt.*;

public class TwoSquareComponent extends JComponent {
	
	public void paintComponent(Graphics graphicsObj) {
	
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		Rectangle box = new Rectangle(150, 75, 100 , 100);
		graphicsObj2D.draw(box);
		box.setSize(50, 50);
		box.translate(25, 25);
		graphicsObj2D.draw(box);
	
	}

}
