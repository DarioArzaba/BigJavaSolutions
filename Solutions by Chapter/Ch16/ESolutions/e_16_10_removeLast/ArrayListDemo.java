package e_16_10_removeLast;

/**
 * Provide a {@code removeLast} method for the {@code ArrayList} implementation
 * in Section 16.2 that shrinks the internal array by 50 percent when it is
 * less than 25 percent full.
 */
public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList staff = new ArrayList();
        staff.addLast("Diana");
        staff.addLast("Harry");

        for (int i = 1; i <= 10; i++)
        {
            staff.addLast("Tom" + i);
        }

        staff.add(0, "Juliet");
        staff.remove(1);

        for (int i = 0; i < staff.size(); i++)
        {
            System.out.print(staff.get(i) + " ");
        }
        System.out.println();

        staff.removeLast();
        staff.removeLast();
        staff.removeLast();
        staff.removeLast();
        staff.removeLast();
        staff.removeLast();
        staff.removeLast();
        staff.removeLast();
        staff.removeLast();
        staff.removeLast();
        staff.removeLast();

        for (int i = 0; i < staff.size(); i++)
        {
            System.out.print(staff.get(i) + " ");
        }
        System.out.println();

        System.out.println("New size: " + staff.size());
    }
}
