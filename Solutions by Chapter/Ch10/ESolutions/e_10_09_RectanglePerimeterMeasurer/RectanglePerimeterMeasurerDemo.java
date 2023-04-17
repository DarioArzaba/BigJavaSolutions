package e_10_09_RectanglePerimeterMeasurer;

import Ch_10_04_Callbacks.*;

import java.awt.*;

/**
 * {@code MeasurerDemo} class.
 */
public class RectanglePerimeterMeasurerDemo
{
    public static void main(String[] args)
    {
        Rectangle[] rectangles = new Rectangle[]{
                new Rectangle(10, 10),
                new Rectangle(20, 30),
                new Rectangle(50, 100),
                new Rectangle(100, 1000),
                new Rectangle(30, 30),
        };

        RectanglePerimeterMeasurer rpm = new RectanglePerimeterMeasurer();
        Rectangle largest = (Rectangle) Data.max(rectangles, rpm);

        System.out.println(largest.getSize());
    }
}
