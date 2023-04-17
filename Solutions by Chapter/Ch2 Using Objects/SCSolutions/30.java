/* 

30.- Which call to translate is needed to move the rectangle so that its top-left corner is at the origin (0, 0)?

	Rectangle box = new Rectangle(5, 10, 20, 30);

A.
	box.translate(-5, -10);

*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class RectangleComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		Rectangle box = new Rectangle(5, 10, 20, 30);
		box.translate(-5, -10);
		graphicsObj2D.draw(box);
		
	}
}
public class TranslateRectangleToOrigin {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 320, 340);
	    RectangleComponent rectComp = new RectangleComponent();
	    window.add(rectComp);
	    window.setVisible(true);
	    
	}

}


