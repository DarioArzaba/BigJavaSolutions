/* 

45.- Give instructions to draw a circle with center (100, 100) and radius 25.

*/

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

class EllipseComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		graphicsObj2D.draw(new Ellipse2D.Double(75, 75, 50, 50));
		
	}
}
public class DrawEllipse {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 217, 240);
	    EllipseComponent ellipseComp = new EllipseComponent();
	    window.add(ellipseComp);
	    window.setVisible(true);
	    
	}

}

