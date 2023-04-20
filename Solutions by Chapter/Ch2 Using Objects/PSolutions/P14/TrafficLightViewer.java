/* 

14.- Write a graphical program that draws a traffic light.

*/

import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

class drawComponentTrafficLight extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		Rectangle recObj = new Rectangle(150,30,80,180);
		Ellipse2D red = new Ellipse2D.Double(170,50,40,40);
		Ellipse2D yellow = new Ellipse2D.Double(170,100,40,40);
		Ellipse2D green = new Ellipse2D.Double(170,150,40,40);
		graphicsObj2D.setColor(Color.LIGHT_GRAY);
		graphicsObj2D.fill(recObj);
		graphicsObj2D.setColor(Color.RED);
		graphicsObj2D.fill(red);
		graphicsObj2D.setColor(Color.YELLOW);
		graphicsObj2D.fill(yellow);
		graphicsObj2D.setColor(Color.GREEN);
		graphicsObj2D.fill(green);

	}
}

public class TrafficLightViewer {

	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(450, 200, 400, 300);
		window.setTitle("Traffic Lights");
		Color backgroundColor = new Color(255,255,255);
		window.getContentPane().setBackground(backgroundColor);
		drawComponentTrafficLight drawComp = new drawComponentTrafficLight();
		window.add(drawComp);
		window.setVisible(true);
		
	}

}
