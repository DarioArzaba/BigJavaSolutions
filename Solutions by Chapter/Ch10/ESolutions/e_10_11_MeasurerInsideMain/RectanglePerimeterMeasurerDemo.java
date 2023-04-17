package e_10_11_MeasurerInsideMain;

import java.awt.*;

/**
 * Repeat Exercise E10.9, making the {@code Measurer} into an inner class
 * inside the {@code main} method.
 */
public class RectanglePerimeterMeasurerDemo
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

        class RectanglePerimeterMeasurer implements Measurer
        {
            @Override
            public double measure(Object anObject)
            {
                Rectangle rect = (Rectangle) anObject;
                return (rect.getWidth() + rect.getHeight()) * 2;
            }
        }

        RectanglePerimeterMeasurer rpm = new RectanglePerimeterMeasurer();
        Rectangle largest = (Rectangle) Data.max(rectangles, rpm);

        System.out.println(largest);
    }
}
