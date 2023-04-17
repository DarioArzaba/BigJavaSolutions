package e_10_20_EnhancedLabeledButtonViewer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.event.ActionListener;

/**
 * Implement a {@code ButtonViewer} program as in Exercise E10.19, using only
 * a single listener class.
 */
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 180;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Two buttons");
        frame.setLayout(null);

        JButton button1 = new JButton("Click me! Button A");
        button1.setSize(300, 90);
        frame.add(button1);

        JButton button2 = new JButton("Click me! Button B");
        button2.setSize(300, 90);
        button2.setLocation(0, 90);
        frame.add(button2);

        ActionListener listener = new ClickListener(button1, button2);
        button1.addActionListener(listener);
        button2.addActionListener(listener);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
