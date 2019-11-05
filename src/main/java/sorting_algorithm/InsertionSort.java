package sorting_algorithm;

import sorting_algorithm.display.Display;
import sorting_algorithm.display.DisplayAble;

import java.util.Arrays;
import java.util.Objects;

public class InsertionSort implements Sort {
    private final int [] numbersArray;
    private final DisplayAble displayAble = new Display();

    public InsertionSort(int[] numbersArray) {
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
        InsertionSort that = (InsertionSort) o;
        return Arrays.equals(numbersArray, that.numbersArray) &&
                Objects.equals(displayAble, that.displayAble);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(displayAble);
        result = 31 * result + Arrays.hashCode(numbersArray);
        return result;
    }

    @Override
    public int[] sort() {
        int temp = 0;
        for (int i = 0; i < this.numbersArray.length; i++){
           for (int j = i + 1; j <= this.numbersArray.length - 1; j++ ){
               if(this.numbersArray[i] > this.numbersArray[j]){
                   temp = this.numbersArray[i];
                   this.numbersArray[i] = this.numbersArray[j];
                   this.numbersArray[j] = temp;
               }
           }
        }
        return this.numbersArray;
    }
}
