package e_16_06_currentSize_instance_variable;

/**
 * Add an instance variable {@code currentSize} to our implementation of the
 * {@code LinkedList} class. Modify the {@code add}, {@code addLast}, and
 * {@code remove} methods of both the linked list and the list iterator
 * to update the {@code currentSize} variable so that it always contains
 * the correct size. Change the {@code size} method of Exercise E16.4 so
 * that it simply returns the value of {@code currentSize}.
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList staff = new LinkedList();
        staff.addFirst("Tom");
        staff.addFirst("Romeo");
        staff.addFirst("Harry");
        staff.addFirst("Diana");

        System.out.printf("%-17s %d%n", "Staff list size: ", staff.size());
        System.out.printf("%-17s %d%n", "Expected: ", 4);
        System.out.println();
    }
}
