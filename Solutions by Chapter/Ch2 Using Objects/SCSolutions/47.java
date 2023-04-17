/* 

47.- Give instructions to draw a string consisting of the letter “V”.

*/

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

class TextComponent extends JComponent {
	public void paintComponent(Graphics graphicsObj) {
		Graphics2D graphicsObj2D = (Graphics2D) graphicsObj;
		
		Font currentFont = graphicsObj2D.getFont();
		Font newFont = currentFont.deriveFont((float) (currentFont.getSize() * 5.0));
		graphicsObj2D.setFont(newFont);
		
		graphicsObj2D.drawString("V", 80, 100);
		
	}
}
public class TextDrawing {
		
	public static void main(String[] args){
		
		JFrame window = new JFrame();
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(450, 200, 217, 240);
	    TextComponent textComp = new TextComponent();
	    window.add(textComp);
	    window.setVisible(true);
	    
	}

}
