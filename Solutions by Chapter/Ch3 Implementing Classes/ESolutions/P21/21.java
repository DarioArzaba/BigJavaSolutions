/* 

21.- Change the car viewer program in Section 3.8 to make the cars appear in different colors. Each Car object should store its own color. Supply modified Car and CarComponent classes.

*/

import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;
import javax.swing.JFrame;

class Car {
	
	private int xLeft;
	private int yTop;
	private Color color;
	
	public Car(int x, int y, Color colorTemp) {
		xLeft = x;
		yTop = y;
		color = colorTemp;
	}

	public void draw(Graphics2D graphicsObj2D) {
		
		Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10, yTop + 20, 10, 10);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);
		GeneralPath roof = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		roof.moveTo(xLeft+10, yTop+10);
		roof.lineTo(xLeft + 20, yTop);
		roof.lineTo(xLeft + 40, yTop);
		roof.lineTo(xLeft + 50, yTop + 10);
		roof.closePath();
		Line2D eraseLine = new Line2D.Double(xLeft + 50, yTop + 10, xLeft+10, yTop+10 );
		
		graphicsObj2D.setColor(Color.BLACK);
		graphicsObj2D.draw(frontTire);
		graphicsObj2D.draw(rearTire);
		graphicsObj2D.setColor(Color.GRAY);
		graphicsObj2D.fill(frontTire);
		graphicsObj2D.fill(rearTire);
		graphicsObj2D.setColor(color);
		graphicsObj2D.fill(body);
		graphicsObj2D.fill(roof);
		graphicsObj2D.setColor(Color.BLACK);
		graphicsObj2D.draw(body);
		graphicsObj2D.draw(roof);
		graphicsObj2D.setColor(color);
		graphicsObj2D.draw(eraseLine);
		
	}
}	

class drawComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {

		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		Car car1 = new Car(0, 0, Color.RED);
		int x = getWidth() - 60;
		int y = getHeight() - 30;
		Car car2 = new Car(x, y, Color.BLUE);
		car1.draw(graphicsObj2D);
		car2.draw(graphicsObj2D);

	}
}

public class CarViewerColor {

	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(100, 100, 800, 500);
		window.setTitle("Car");
		Color backgroundColor = new Color(255,255,255);
		window.getContentPane().setBackground(backgroundColor);
		drawComponent drawComp = new drawComponent();
		window.add(drawComp);
		window.setVisible(true);		
		
	}

}
