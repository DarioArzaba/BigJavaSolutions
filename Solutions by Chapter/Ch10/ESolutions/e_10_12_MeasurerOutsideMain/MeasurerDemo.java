package e_10_12_MeasurerOutsideMain;

import java.awt.*;

/**
 * Repeat Exercise E10.9, making the {@code Measurer} into an inner class
 * outside the {@code main} method.
 */
public class MeasurerDemo
{
    public static void main(String[] args)
    {
        Rectangle[] rectangles = new Rectangle[]{
                new Rectangle(10, 10),
                new Rectangle(20, 30),
                new Rectangle(50, 100),
                new Rectangle(100, 10),
                new Rectangle(30, 30),
        };

        RectanglePerimeter RPMeasurer = new MeasurerDemo().new RectanglePerimeter();
        Rectangle largest = (Rectangle) Data.max(rectangles, RPMeasurer);

        System.out.println(largest);
    }

    class RectanglePerimeter implements Measurer
    {
        @Override
        public double measure(Object anObject)
        {
            Rectangle rect = (Rectangle) anObject;
            return (rect.getWidth() + rect.getHeight()) * 2;
        }
    }
}
