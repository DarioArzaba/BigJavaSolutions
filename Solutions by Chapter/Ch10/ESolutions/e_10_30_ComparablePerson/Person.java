package e_10_30_ComparablePerson;

/**
 * {@code Person} class.
 */
public class Person implements Comparable<Person>
{
    private String firstName;
    private String lastName;

    /**
     * Constructs a person object.
     *
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @return person's first name
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @return person's last name
     */
    public String getLastName()
    {
        return lastName;
    }

    @Override
    public int compareTo(Person other)
    {
        int diff = firstName.compareTo(other.firstName);
        if (diff == 0)
        {
            diff = lastName.compareTo(other.lastName);
        }
        return diff;
    }
}
