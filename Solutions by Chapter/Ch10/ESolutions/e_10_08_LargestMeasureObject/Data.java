package e_10_08_LargestMeasureObject;

public class Data
{
    /**
     * Computes the average of the measures of the given objects.
     *
     * @param objects an array of Measurable objects
     * @return the average of the measures
     */
    public static double average(Measurable[] objects)
    {
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum = sum + obj.getMeasure();
        }
        if (objects.length > 0)
        {
            return sum / objects.length;
        }
        else
        {
            return 0;
        }
    }

    /**
     * Computes the largest of the measures of the given objects.
     *
     * @param objects an array of Measurable objects
     * @return the object with largest measure
     */
    public static Measurable max(Measurable[] objects)
    {
        Measurable maxObject = objects[0];
        for (Measurable obj : objects)
        {
            if (maxObject.getMeasure() < obj.getMeasure())
            {
                maxObject = obj;
            }
        }
        return maxObject;
    }

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
