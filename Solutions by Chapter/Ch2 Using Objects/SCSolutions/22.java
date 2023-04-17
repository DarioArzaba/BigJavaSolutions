/* 

22.- Initialize the variables box and box2 with two rectangles that touch each other.

*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class RectangleComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		Rectangle box = new Rectangle(30, 30, 60, 40);
		graphicsObj2D.draw(box);
		Rectangle box2 = new Rectangle(90, 50, 50, 35);
		graphicsObj2D.draw(box2);
		
	}
}
public class RectanglesTouchEachOther {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 320, 340);
	    RectangleComponent rectComp = new RectangleComponent();
	    window.add(rectComp);
	    window.setVisible(true);
	    
	}

}
