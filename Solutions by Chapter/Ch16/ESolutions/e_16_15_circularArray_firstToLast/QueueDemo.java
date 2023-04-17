package e_16_15_circularArray_firstToLast;

/**
 * Add a method {@code firstToLast}, as described in Exercise E16.13,
 * to the circular array implementation of a queue.
 */
public class QueueDemo
{
    public static void main(String[] args)
    {
        CircularArrayQueue q = new CircularArrayQueue();
        q.add("Tom");
        q.add("Diana");
        q.add("Harry");

        q.firstToLast();

        while (!q.empty())
        {
            System.out.println(q.remove());
        }
    }
}
