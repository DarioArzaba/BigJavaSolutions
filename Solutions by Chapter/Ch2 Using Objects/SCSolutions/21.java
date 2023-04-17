/* 

21.- How do you construct a square with center (100, 100) and side length 20?

*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class RectangleComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		Rectangle centeredSquare = new Rectangle(90, 90, 20, 20);
		graphicsObj2D.draw(centeredSquare);
		
	}
}
public class SquareCenterDisplay {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 217, 240);
	    RectangleComponent rectComp = new RectangleComponent();
	    window.add(rectComp);
	    window.setVisible(true);
	    
	}

}
