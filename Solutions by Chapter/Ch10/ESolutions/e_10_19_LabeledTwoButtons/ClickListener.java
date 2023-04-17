package e_10_19_LabeledTwoButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * {@code ClickListener} class.
 */
public class ClickListener implements ActionListener
{
    private int n;
    private String label;

    public ClickListener(String lablel)
    {
        n = 0;
        this.label = lablel;
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        n++;
        System.out.printf("Button %s was clicked %d %s%n",
                label, n, n > 1 ? "times!" : "time!");
    }
}
