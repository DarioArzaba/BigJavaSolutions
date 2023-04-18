/* 

9.- Write a program that draws three stars like the one at right. Use classes Star, StarComponent, and StarViewer.

*/

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

class Star {
	
	private int xLeft;
	private int yTop;
	private int width;
	
	public Star(int x, int y, int aWidth) {
		xLeft = x;
		yTop = y;
		width = aWidth;
	}
	
	public void draw(Graphics2D graphicsObj2D) {
		
		Line2D first = new Line2D.Double((xLeft + (width/2)), yTop, (xLeft + (width/2)), (yTop+width));
		Line2D second = new Line2D.Double(xLeft, (yTop + (width/2)), (xLeft+width), (yTop + (width/2)));
		Line2D third = new Line2D.Double(xLeft, yTop, (xLeft + width), (yTop + width));
		Line2D fourth = new Line2D.Double(xLeft, (yTop + width), (xLeft+width), yTop);
		graphicsObj2D.draw(first);
		graphicsObj2D.draw(second);
		graphicsObj2D.draw(third);
		graphicsObj2D.draw(fourth);
		
	}
	
}

class drawComponentStar extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		Star firstStar = new Star(100, 100, 100);
		Star secondStar = new Star(300, 100, 75);
		Star thirdStar = new Star(500, 100, 50);
		firstStar.draw(graphicsObj2D);
		secondStar.draw(graphicsObj2D);
		thirdStar.draw(graphicsObj2D);
		
	}
}

public class StarViewer {
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(150, 150, 700, 350);
		window.setTitle("Star Drawer");
		Color backgroundColor = new Color(253,253,253);
		window.getContentPane().setBackground(backgroundColor);
		drawComponentStar drawComp = new drawComponentStar();
		window.add(drawComp);
		window.setVisible(true);
		
	}
	
}

