/* 

46.- Give instructions to draw a letter “V” by drawing two line segments.

*/

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

class LineComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		graphicsObj2D.setStroke(new BasicStroke(4));
		Line2D.Double segment1 = new Line2D.Double(75, 70, 100, 120);
		graphicsObj2D.draw(segment1);
		Line2D.Double segment2 = new Line2D.Double(100, 120, 125, 70);
		graphicsObj2D.draw(segment2);
		
	}
}
public class LineLetterDraw {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 220, 240);
		LineComponent lineComp = new LineComponent();
	    window.add(lineComp);
	    window.setVisible(true);
	    
	}

}
