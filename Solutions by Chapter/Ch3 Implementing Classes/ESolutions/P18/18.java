/* 

18.- Draw a shooting target—a set of concentric rings in alternating black and white colors. Hint: Fill a black circle, then fill a smaller white circle on top, and so on. Your program should be composed of classes Target, TargetComponent, and TargetViewer.

*/

class Target {
	
	private int xLeft;
	private int yTop;
	private int width;
	
	public Target(int x, int y, int aWidth) {
		xLeft = x;
		yTop = y;
		width = aWidth;
	}
	
	public void draw(Graphics2D graphicsObj2D) {

		Ellipse2D circle = new Ellipse2D.Double(xLeft, yTop, width, width);
		graphicsObj2D.setColor(Color.BLACK);
		graphicsObj2D.fill(circle);
		circle.setFrame(xLeft+20, yTop+20, 160, 160);
		graphicsObj2D.setColor(Color.WHITE);
		graphicsObj2D.fill(circle);
		circle.setFrame(xLeft+40, yTop+40, 120, 120);
		graphicsObj2D.setColor(Color.BLACK);
		graphicsObj2D.fill(circle);
		circle.setFrame(xLeft+60, yTop+60, 80, 80);
		graphicsObj2D.setColor(Color.WHITE);
		graphicsObj2D.fill(circle);
		circle.setFrame(xLeft+80, yTop+80, 40, 40);
		graphicsObj2D.setColor(Color.BLACK);
		graphicsObj2D.fill(circle);
		
	}
	
}

class drawComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {

		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;		
		int x = (getWidth()/4);
		int y = (getHeight()/4);
		Target mainTarget = new Target(x,y,200);
		mainTarget.draw(graphicsObj2D);

	}
}

public class TargetViewer {

	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(450, 200, 400, 400);
		window.setTitle("Window Target");
		Color backgroundColor = new Color(152,131,152).brighter();
		window.getContentPane().setBackground(backgroundColor);
		drawComponent drawComp = new drawComponent();
		window.add(drawComp);
		window.setVisible(true);		
		
	}

}

