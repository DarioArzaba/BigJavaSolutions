package e_16_12_queue_implementation;

/**
 * Complete the implementation of a queue in Section 16.3.3, using
 * a sequence of nodes for storing the elements.
 */
public class LinkedListQueueDemo
{
    public static void main(String[] args)
    {
        LinkedListQueue queue = new LinkedListQueue();

        // Fill queue with values from 0 to 9

        Integer x;
        for (int i = 0; i < 10; i++)
        {
            x = i;
            queue.offer(x);
        }

        while (queue.size() > 0)
        {
            System.out.println(queue.poll());
        }
    }
}
