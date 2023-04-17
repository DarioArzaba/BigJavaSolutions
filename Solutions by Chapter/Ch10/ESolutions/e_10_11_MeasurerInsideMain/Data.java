package e_10_11_MeasurerInsideMain;

public class Data
{
    /**
     * Finds the object with the larges measure, as measured by
     * the supplied measurer.
     *
     * @param objects object to be measured
     * @param meas    measurer object
     */
    public static Object max(Object[] objects, Measurer meas)
    {
        if (objects == null)
        {
            throw new NullPointerException("Can't handle null arrays");
        }
        if (objects.length == 0)
        {
            throw new IllegalArgumentException("Can't handle zero-length arrays");
        }

        Object largest = objects[0];
        for (Object o : objects)
        {
            if (meas.measure(o) > meas.measure(largest))
            {
                largest = o;
            }
        }
        return largest;
    }
}
