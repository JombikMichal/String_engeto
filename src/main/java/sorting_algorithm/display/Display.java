package sorting_algorithm.display;

public class Display implements DisplayAble {
    @Override
    public void display(int[] numberArray) {
        System.out.print("Output/sorted array: ");
        for (int i = 0; i < numberArray.length; i++){
            System.out.print(numberArray[i] + " ");
        }
    }
}
