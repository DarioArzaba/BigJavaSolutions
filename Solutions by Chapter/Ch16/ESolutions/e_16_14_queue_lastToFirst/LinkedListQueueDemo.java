package e_16_14_queue_lastToFirst;

/**
 * Add a method {@code lastToFirst} to the implementation of a queue
 * in Exercise E16.12. The method moves the element at the tail of
 * the queue to the head.
 */
public class LinkedListQueueDemo
{
    public static void main(String[] args)
    {
        LinkedListQueue queue = new LinkedListQueue();

        Integer x;
        for (int i = 0; i < 5; i++)
        {
            x = i;
            queue.offer(x);
        }
    }
}
