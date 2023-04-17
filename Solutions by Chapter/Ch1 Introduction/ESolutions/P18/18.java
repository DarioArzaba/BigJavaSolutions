/* 

18.- Type in and run the following program. Then modify it to show a different greeting and image.

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Test {
	public static void main(String[] args) {
		URL imageLocation = new URL("http://horstmann.com/java4everyone/duke.gif");
		JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
	}
}

*/

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImageAndGreeting {
	
	public static void main(String[] args) throws Exception {
		URL imageLocation = new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/0/0c/White_and_yellow_flower.JPG/320px-White_and_yellow_flower.JPG");
		JOptionPane.showMessageDialog(null, "Hi, Dario!", "Greeting Box", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
		System.exit(0);
	}
	
}
