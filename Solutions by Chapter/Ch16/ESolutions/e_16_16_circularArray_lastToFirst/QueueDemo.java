package e_16_16_circularArray_lastToFirst;

/**
 * Add a method {@code firstToLast}, as described in Exercise E16.13,
 * to the circular array implementation of a queue.
 */
public class QueueDemo
{
    public static void main(String[] args)
    {
        CircularArrayQueue q = new CircularArrayQueue();

        for (char i = 65; i < 70; i++)
        {
            q.add(i);
        }

        q.lastToFirst();
        q.firstToLast();
        q.firstToLast();
        q.lastToFirst();

        while (!q.empty())
        {
            System.out.println(q.remove() + " ");
        }
    }
}
