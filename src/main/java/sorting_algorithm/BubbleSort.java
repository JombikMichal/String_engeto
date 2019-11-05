package sorting_algorithm;

import sorting_algorithm.display.Display;
import sorting_algorithm.display.DisplayAble;

import java.util.Arrays;

public class BubbleSort implements Sort {
    private final int [] numbersArray;
    private final DisplayAble displayAble = new Display();

    public BubbleSort(int[] numbersArray) {
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
        BubbleSort that = (BubbleSort) o;
        return Arrays.equals(numbersArray, that.numbersArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(numbersArray);
    }

    /**
     * In bubble sort algorithm, array is traversed from first element to last element.
     * Here, current element is compared with the next element.
     * If current element is greater than the next element, it is swapped.
     * */
    @Override
    public int[] sort() {
        int temp = 0;
        boolean sorting = true;
        while (sorting){
            sorting = false;
            for (int i = 1; i < this.numbersArray.length; i++){
                if(this.numbersArray[i - 1] > this.numbersArray[i]){
                    // if previous number is less than next then swap this numbers and set that in this iteration swapping was performed
                    temp = this.numbersArray[i - 1];
                    this.numbersArray[i - 1] = this.numbersArray[i];
                    this.numbersArray[i] = temp;
                    sorting = true;
                }
            }
        }
        return this.numbersArray;
    }
}
