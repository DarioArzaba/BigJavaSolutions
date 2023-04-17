package e_10_09_RectanglePerimeterMeasurer;

import java.awt.*;

/**
 * {@code RectanglePerimeterMeasurer} class.
 */
public class RectanglePerimeterMeasurer implements Measurer
{
    @Override
    public double measure(Object anObject)
    {
        Rectangle aRectangle = (Rectangle) anObject;
        return (aRectangle.getHeight() + aRectangle.getWidth()) * 2;
    }
}
