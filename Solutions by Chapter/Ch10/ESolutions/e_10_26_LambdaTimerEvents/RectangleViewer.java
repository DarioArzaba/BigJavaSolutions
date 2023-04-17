package e_10_26_LambdaTimerEvents;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Reimplement the program in Section 10.9, specifying the listener with
 * a lambda expression (see Java 8 Note 10.4).
 */
public class RectangleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new RectangleFrame();
        frame.setTitle("An animated rectangle");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
