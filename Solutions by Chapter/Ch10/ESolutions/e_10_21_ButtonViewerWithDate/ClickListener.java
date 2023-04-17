package e_10_21_ButtonViewerWithDate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * {@code ClickListener} class.
 */
public class ClickListener implements ActionListener
{
    private int aCount;
    private int bCount;
    private JButton aButton;
    private JButton bButton;

    public ClickListener(JButton aButton, JButton bButton)
    {
        aCount = 0;
        bCount = 0;
        this.aButton = aButton;
        this.bButton = bButton;
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        int count = 0;
        String label = null;
        Object src = event.getSource();
        String theTime = new Date().toString();

        if (src == aButton)
        {
            label = "A";
            aCount++;
            count = aCount;
        }
        else if (src == bButton)
        {
            label = "B";
            bCount++;
            count = bCount;
        }

        System.out.printf("Button %s was clicked %d %s on %s%n",
                label, count, count > 1 ? "times!" : "time!", theTime);
    }
}
