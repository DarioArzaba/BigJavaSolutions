package e_18_07_generic_merge_sort;

import ArrayUtils.ArrayUtil;

import java.util.Arrays;

/**
 * Implement a generic version of the merge sort algorithm. Your program should
 * compile without warnings.
 */
public class GenericMergeSortDemo
{
    public static void main(String[] args)
    {
        // Array of integers

        Integer[] integers = ArrayUtil.randomIntArray(20, 20);

        System.out.print("Before: ");
        System.out.println(Arrays.toString(integers));

        GenericMergeSorter.sort(integers);

        System.out.print("After: ");
        System.out.println(Arrays.toString(integers));

        // Array of strings

        String[] strings = {"e", "d", "c", "b", "a"};

        System.out.print("Before: ");
        System.out.println(Arrays.toString(strings));

        GenericMergeSorter.sort(strings);

        System.out.print("After: ");
        System.out.println(Arrays.toString(strings));
    }
}
