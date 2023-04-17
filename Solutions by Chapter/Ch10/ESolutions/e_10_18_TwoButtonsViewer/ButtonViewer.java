package e_10_18_TwoButtonsViewer;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Enhance the {@code ButtonViewer} program so that it has two buttons, each of
 * which prints a message “I was clicked <em>n</em> times!” whenever the button
 * is clicked. Each button should have a separate click count.
 */
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 180;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Two buttons");
        frame.setLayout(null);

        JButton button1 = new JButton("Click me! Button 1");
        button1.setSize(300, 90);
        frame.add(button1);

        JButton button2 = new JButton("Click me! Button 2");
        button2.setSize(300, 90);
        button2.setLocation(0, 90);
        frame.add(button2);

        ActionListener listener1 = new ClickListener();
        button1.addActionListener(listener1);

        ActionListener listener2 = new ClickListener();
        button2.addActionListener(listener2);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
