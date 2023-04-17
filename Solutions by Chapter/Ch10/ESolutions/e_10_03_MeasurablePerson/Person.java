package e_10_03_MeasurablePerson;

import utils.Measurable;

/**
 * A person has a name and a height in centimeters. Use the {@code Data} class
 * of Exercise E10.1 to process an array of {@code Person} objects. Display the
 * average height and the name of the tallest person.
 */
public class Person implements Measurable
{
    private String name;
    private int height;

    /**
     * Constructs a person with name and height.
     *
     * @param name   the name of the person
     * @param height the height in centimeters
     */
    public Person(String name, int height)
    {
        this.name = name;
        this.height = height;
    }

    public String getName()
    {
        return name;
    }

    public int getHeight()
    {
        return height;
    }

    @Override
    public double getMeasure()
    {
        return height;
    }
}
