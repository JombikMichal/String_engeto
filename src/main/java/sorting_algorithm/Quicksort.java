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

    @Override
    public int[] sort() {


        return this.numbersArray;
    }
}
