/* 

11.- Repeat the previous problem, but now write a graphical application that shows the line and the points. Draw each point as a tiny circle. Use the drawString method to draw each distance next to the point, using calls g2.drawString("Distance: " + distance, p.getX(), p.getY());

*/

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

class drawComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		Ellipse2D circle = new Ellipse2D.Double();
		String distance;
		
		Point p1 = new Point(100,100);
		circle = new Ellipse2D.Double(p1.getX(),p1.getY(), 8, 8);
		graphicsObj2D.fill(circle);
		
		Point p2 = new Point(200,200);
		circle = new Ellipse2D.Double(p2.getX(),p2.getY(), 8, 8);
		graphicsObj2D.fill(circle);
		
		Line2D line = new Line2D.Double(p1,p2);
		graphicsObj2D.draw(line);
		
		Point p3 = new Point(100,200);
		circle = new Ellipse2D.Double(p3.getX(),p3.getY()+5,10,10);
		graphicsObj2D.fill(circle);
		distance = String.format("%.2f", line.ptSegDist(p3));
		graphicsObj2D.drawString("d = " + distance, (int)p3.getX(), (int)p3.getY());
		
		Point p4 = new Point(150,150);
		circle = new Ellipse2D.Double(p4.getX(),p4.getY()+5,10,10);
		graphicsObj2D.fill(circle);
		distance = String.format("%.2f", line.ptSegDist(p4));
		graphicsObj2D.drawString("d = " + distance, (int)p4.getX(), (int)p4.getY());
		
		Point p5 = new Point(250,50);
		circle = new Ellipse2D.Double(p5.getX(),p5.getY()+5,10,10);
		graphicsObj2D.fill(circle);
		distance = String.format("%.2f", line.ptSegDist(p5));
		graphicsObj2D.drawString("d = " + distance, (int)p5.getX(), (int)p5.getY());

	}
}

public class LineDistanceViewer {

	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(450, 200, 500, 400);
		window.setTitle("Line Distance");
		Color colorFondo = new Color(204, 255, 204);
		window.getContentPane().setBackground(colorFondo);
		drawComponent drawComp = new drawComponent();
		window.add(drawComp);
		window.setVisible(true);
		
	}

}
