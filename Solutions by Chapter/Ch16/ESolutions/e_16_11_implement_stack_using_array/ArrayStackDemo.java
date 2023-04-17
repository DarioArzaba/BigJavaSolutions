package e_16_11_implement_stack_using_array;

/**
 * Complete the implementation of a stack in Section 16.3.2,
 * using an array for storing the elements.
 */
public class ArrayStackDemo
{
    public static void main(String[] args)
    {
        ArrayListStack stack = new ArrayListStack();

        // Push 10 integers onto the stack

        for (int i = 0; i < 10; i++)
        {
            Integer x = i;
            stack.push(x);
        }

        // Check if stack is empty

        System.out.println("Stack is empty? " + stack.isEmpty());

        // Print the size of the stack

        System.out.printf("%-15s %d%n", "Stack size:", stack.size());

        // Remove data from the stack

        while (!stack.isEmpty())
        {
            System.out.println("Remove value " + stack.peek());
            stack.pop();
        }

        // Check if stack is empty

        System.out.println("Stack is empty? " + stack.isEmpty());

        // Print the size of the stack

        System.out.printf("%-15s %d%n", "Stack size:", stack.size());
    }
}
