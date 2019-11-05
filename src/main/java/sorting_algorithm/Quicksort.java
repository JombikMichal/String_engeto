package sorting_algorithm;

import sorting_algorithm.display.Display;
import sorting_algorithm.display.DisplayAble;

import java.util.Arrays;
import java.util.Objects;

public class Quicksort implements Sort{

    private final int [] numbersArray;
    private final DisplayAble displayAble = new Display();

    public Quicksort(int[] numbersArray) {
        this.numbersArray = numbersArray;
    }

    public DisplayAble getDisplayAble() {
        return displayAble;
    }

    public int[] getNumbersArray() {
        return numbersArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quicksort quicksort = (Quicksort) o;
        return Arrays.equals(numbersArray, quicksort.numbersArray) &&
                Objects.equals(displayAble, quicksort.displayAble);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(displayAble);
        result = 31 * result + Arrays.hashCode(numbersArray);
        return result;
    }

    /**
     * Quicksort is a sorting algorithm, which is leveraging the divide-and-conquer principle.
     * It has an average O(n log n) complexity and it’s one of the most used sorting algorithms, especially for big data volumes.
     *
     * It's important to remember that Quicksort isn't a stable algorithm.
     * A stable sorting algorithm is an algorithm where the elements with the same values appear in the same order in the sorted output as they appear in the input list.
     *
     * The input list is divided into two sub-lists by an element called pivot; one sub-list with elements less than the pivot and another one with elements greater than the pivot.
     * This process repeats for each sub-list.
     *
     * Finally, all sorted sub-lists merge to form the final output.
     *
     * We choose an element from the list, called the pivot. We'll use it to divide the list into two sub-lists.
     * We reorder all the elements around the pivot – the ones with smaller value are placed before it, and all the elements greater than the pivot after it.
     * After this step, the pivot is in its final position. This is the important partition step.
     * We apply the above steps recursively to both sub-lists on the left and right of the pivot.
     *
     * Let's suppose we pick 5 as the pivot for simplicity
     * We'll first put all elements less than 5 in the first position of the array: {3, 4, 5, 6, 5, 9}
     * We'll then repeat it for the left sub-array {3,4}, taking 3 as the pivot
     * There are no elements less than 3
     * We apply quicksort on the sub-array in the right of the pivot, i.e. {4}
     * This sub-array consists of only one sorted element
     * We continue with the right part of the original array, {6, 5, 9} until we get the final ordered array
     * 
     * */
    @Override
    public int[] sort() {


        return this.numbersArray;
    }
}
