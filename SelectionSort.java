import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 4, 2 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swapNumber(arr, maxIndex, lastIndex);
        }
    }

    static int getMaxIndex(int[] arr, int startIndex, int endIndex) {
        int max = startIndex;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swapNumber(int[] arr, int firstNumber, int secondNumber) {
        int temp = arr[firstNumber];
        arr[firstNumber] = arr[secondNumber];
        arr[secondNumber] = temp;
    }

}
