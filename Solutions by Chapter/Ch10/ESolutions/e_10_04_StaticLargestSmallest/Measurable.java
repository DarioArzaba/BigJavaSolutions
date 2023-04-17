package e_10_04_StaticLargestSmallest;

/**
 * Describes any class whose objects can be measured.
 */
public interface Measurable
{
    /**
     * Computes the measure of the object.
     *
     * @return the measure
     */
    double getMeasure();

    static double largest(Measurable[] objects)
    {
        if (objects == null || objects.length == 0)
        {
            throw new IllegalArgumentException();
        }

        double largest = Double.MIN_VALUE;
        for (Measurable o : objects)
        {
            if (o.getMeasure() > largest)
            {
                largest = o.getMeasure();
            }
        }
        return largest;
    }

    static double smallest(Measurable[] objects)
    {
        if (objects == null || objects.length == 0)
        {
            throw new IllegalArgumentException();
        }

        double smallest = Double.MAX_VALUE;
        for (Measurable o : objects)
        {
            if (o.getMeasure() < smallest)
            {
                smallest = o.getMeasure();
            }
        }
        return smallest;
    }
}
