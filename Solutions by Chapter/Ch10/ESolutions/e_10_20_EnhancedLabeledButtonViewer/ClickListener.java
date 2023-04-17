package e_10_20_EnhancedLabeledButtonViewer;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        Object src = event.getSource();
        int count = 0;
        String label = null;

        if (src == aButton)
        {
            aCount++;
            count = aCount;
            label = "A";
        }
        else if (src == bButton)
        {
            bCount++;
            count = bCount;
            label = "B";
        }
        System.out.printf("Button %s was clicked %d %s%n",
                label, count, count > 1 ? "times!" : "time!");
    }
}
