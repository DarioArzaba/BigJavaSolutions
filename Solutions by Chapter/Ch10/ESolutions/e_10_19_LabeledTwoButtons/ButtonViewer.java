package e_10_19_LabeledTwoButtons;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.event.ActionListener;

/**
 * Enhance the {@code ButtonViewer} program so that it has two buttons
 * labeled A and B, each of which prints a message "Button <em>x</em> was
 * clicked!", where <em>x</em> is A or B.
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

        ActionListener listener1 = new ClickListener("A");
        button1.addActionListener(listener1);

        ActionListener listener2 = new ClickListener("B");
        button2.addActionListener(listener2);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
