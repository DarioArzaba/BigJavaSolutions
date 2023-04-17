/* 

42.- How do you modify the program to draw two squares?

*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class RectangleComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		Rectangle box = new Rectangle(50, 50, 60, 60);
		graphicsObj2D.draw(box);
		box.translate(15, 25);
		graphicsObj2D.draw(box);
		
	}
}
public class DrawTwoSquares {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 220, 240);
		window.setTitle("Two Squares");
	    RectangleComponent rectComp = new RectangleComponent();
	    window.add(rectComp);
	    window.setVisible(true);
	    
	}

}



