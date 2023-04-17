/* 

13.- Write a program to plot a face.

*/

import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

class drawComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		graphicsObj2D.setColor(Color.BLUE);
		Ellipse2D face = new Ellipse2D.Double(50,50,100,100);
		graphicsObj2D.draw(face);
		Ellipse2D eye1 = new Ellipse2D.Double(75,80,10,10);
		graphicsObj2D.draw(eye1);
		Ellipse2D eye2 = new Ellipse2D.Double(115,80,10,10);
		graphicsObj2D.draw(eye2);
		Rectangle mouth = new Rectangle(75,120,50,2);
		graphicsObj2D.fill(mouth);

	}
}

public class FaceViewer {

	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(450, 200, 250, 300);
		window.setTitle("Face Draw");
		Color backgroundColor = new Color(255,255,255);
		window.getContentPane().setBackground(backgroundColor);
		drawComponent drawComp = new drawComponent();
		window.add(drawComp);
		window.setVisible(true);
		
	}

}
