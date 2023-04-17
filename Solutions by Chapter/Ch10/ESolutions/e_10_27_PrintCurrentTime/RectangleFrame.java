package e_10_27_PrintCurrentTime;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * This frame contains current time.
 */
public class RectangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    private TimeComponent scene;

    public RectangleFrame()
    {
        scene = new TimeComponent();
        add(scene);

        setSize(FRAME_WIDTH, FRAME_HEIGHT);

        final int DELAY = 1000; // Milliseconds between timer ticks
        Timer t = new Timer(DELAY, (ActionEvent event) -> scene.repaint());
        t.start();
    }
}
