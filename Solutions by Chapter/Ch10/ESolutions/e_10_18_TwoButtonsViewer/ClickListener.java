package e_10_18_TwoButtonsViewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * {@code ClickListener} class.
 */
public class ClickListener implements ActionListener
{
    private int n;

    @Override
    public void actionPerformed(ActionEvent event)
    {
        n++;
        System.out.printf("I was clicked %d %s%n", n, n > 1 ? "times!" : "time!");
    }
}
