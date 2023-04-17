/* 

49.- How do you draw a yellow square on a red background?

*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class LineComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		graphicsObj2D.setColor(Color.RED);
		graphicsObj2D.fill(new Rectangle(0, 0, 200, 200));
		graphicsObj2D.setColor(Color.YELLOW);
		graphicsObj2D.fill(new Rectangle(50, 50, 100, 100));
		
	}
}
public class YellowAndRedSquare {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 215, 237);
		LineComponent lineComp = new LineComponent();
	    window.add(lineComp);
	    window.setVisible(true);
	    
	}

}

