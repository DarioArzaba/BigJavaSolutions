package e_10_27_PrintCurrentTime;

import javax.swing.*;

/**
 * Write a program that uses a timer to print the current time once a second.
 * <em>Hint:</em> The following code prints the current time:
 * <p><pre>
 *      Date now = new Date();
 *      System.out.println(now);</pre>
 * The {@code Date} class is in the {@code java.ArrayUtils} package.
 */
public class TimeViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new RectangleFrame();
        frame.setTitle("The current time");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
