package e_10_03_MeasurablePerson;

import utils.Data;
import utils.Measurable;

/**
 * {@code PersonDemo} class.
 */
public class PersonDemo
{
    public static void main(String[] args)
    {
        Person[] persons = {
                new Person("Carl Cracker", 160),
                new Person("Harry Hacker", 180),
                new Person("Tony Tester", 170)
        };

        // Display the average height of the array of persons

        double averageHeight = Data.average(persons);
        System.out.printf("%s%.2f%n", "Average height: ", averageHeight);
        System.out.println("Expected: " + 170);

        // Display the name of the tallest person

        Measurable tallestPerson = Data.max(persons);
        System.out.println("Tallest person: " + ((Person) tallestPerson).getName());
        System.out.println("Expected: Harry Hacker");
    }
}
