package sorting_algorithm;

import java.util.Arrays;

public class BubbleSort implements Sort {
    private final int [] numbersArray;

    public BubbleSort(int[] numbersArray) {
        this.numbersArray = numbersArray;
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
                    temp = this.numbersArray[i - 1];
                    this.numbersArray[i - 1] = this.numbersArray[i];
                    this.numbersArray[i] = temp;
                    sorting = true;
                }
            }
        }
        return this.numbersArray;
    }

    public void print(){
        sort();
        System.out.print("Output/sorted array: ");
        for (int i = 0; i < this.numbersArray.length; i++){
            System.out.print(this.numbersArray[i] + " ");
        }
    }
}
