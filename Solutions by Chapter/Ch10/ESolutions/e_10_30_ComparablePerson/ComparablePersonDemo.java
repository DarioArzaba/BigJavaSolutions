package e_10_30_ComparablePerson;

import java.util.Arrays;

/**
 * Supply a class {@code Person} that implements the {@code Comparable}
 * interface. Compare persons by their names. Ask the user to input ten names
 * and generate ten {@code Person} objects. Using the {@code compareTo} method,
 * determine and print the first and last person among them.
 */
public class ComparablePersonDemo
{
    public static void main(String[] args)
    {
        Person[] persons = new Person[]{
                new Person("Irving", "Stolte"),
                new Person("Ettie", "Melnyk"),
                new Person("Theola", "Porcell"),
                new Person("Theodore", "Bucholz"),
                new Person("Lelah", "Thompson"),
                new Person("Edmundo", "Calvert"),
                new Person("Kaylee", "Macias"),
                new Person("Keith", "Julies"),
                new Person("Veronica", "Skillern")
        };

        Arrays.sort(persons);

        String firstPerson = persons[0].getFirstName() + " " + persons[0] .getLastName();
        System.out.println("First person: " + firstPerson);

        String lastPerson = persons[persons.length - 1].getFirstName()
                + " " + persons[persons.length - 1].getLastName();
        System.out.println("Last person: " + lastPerson);
    }
}
