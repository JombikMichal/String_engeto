package sorting_algorithm;

import sorting_algorithm.display.Display;
import sorting_algorithm.display.DisplayAble;

import java.util.Arrays;
import java.util.Objects;

public class SelectionSort implements Sort {
    private final int[] numbersArray;
    private final DisplayAble displayAble = new Display();

    public SelectionSort(int[] numbersArray) {
        this.numbersArray = numbersArray;
    }

    public int[] getNumbersArray() {
        return numbersArray;
    }

    public DisplayAble getDisplayAble() {
        return displayAble;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SelectionSort that = (SelectionSort) o;
        return Arrays.equals(numbersArray, that.numbersArray) &&
                Objects.equals(displayAble, that.displayAble);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(displayAble);
        result = 31 * result + Arrays.hashCode(numbersArray);
        return result;
    }

    /**
     * In selection sort algorithm, we search for the lowest element and arrange it to the proper location. We swap the current element with the next lowest number.
     */
    @Override
    public int[] sort() {
        for (int i = 0; i < numbersArray.length; i++) {
            int index = i;
            for (int j = i + 1; j <= numbersArray.length - 1; j++) {
                if (numbersArray[i] > numbersArray[j]) {
                    index = j;
                }
            }
            int tmp = numbersArray[index];
            numbersArray[index] = numbersArray[i];
            numbersArray[i] = tmp;
        }
        return numbersArray;
    }
}


//        for (int i = 0; i < this.numbersArray.length; i++) {
//            for (int j = i + 1; j <= this.numbersArray.length - 1; j++) {
//                if (this.numbersArray[i] > this.numbersArray[j]) {
//                    int temp = this.numbersArray[i];
//                    this.numbersArray[i] = this.numbersArray[j];
//                    this.numbersArray[j] = temp;
//                }
//            }
//        }
//        return this.numbersArray;