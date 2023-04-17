package e_10_27_PrintCurrentTime;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

/**
 * The component displays current time.
 */
public class TimeComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Date date = new Date();
        Graphics2D g2 = (Graphics2D) g;
        g2.drawString(date.toString(), 50, 100);
    }
}
