package e_10_17_EnhancedButtonViewer;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * Enhance the {@code ButtonViewer} program so that it prints a message “I was
 * clicked <em>n</em> times!” whenever the button is clicked. The value
 * <em>n</em> should be incremented with each click.
 */
public class ButtonViewer
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 60;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me!");
        frame.add(button);

        ActionListener listener = new ClickListener();
        button.addActionListener(listener);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
