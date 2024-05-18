import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 8, 3, 5, 4, 9, 8 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swapNumber(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swapNumber(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
