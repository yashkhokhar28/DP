import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        findMaxMin(arr);
        sort(arr);
        scanner.close();

    }

    static void findMaxMin(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            } else if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Maximum : " + max + " Index : " + maxIndex);
        System.out.println("Minimum : " + min + " Index : " + minIndex);
    }

    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array After Sort : " + Arrays.toString(arr));
    }
}
