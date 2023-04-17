package e_10_12_MeasurerOutsideMain;

/**
 * Describes any class whose object can measure other objects.
 */
public interface Measurer
{
    /**
     * Computes the measure of the object.
     *
     * @param anObject the object to be measured
     * @return the measure
     */
    double measure(Object anObject);
}
