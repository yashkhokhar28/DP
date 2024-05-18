import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Number Of Element For Array : ");
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter " + i + " Element : ");
                arr[i] = scanner.nextInt();
            }
            System.out.println("\n");
            System.out.println("Before Reverse : ");
            System.out.println(Arrays.toString(arr));
            arr = reverseArray(arr);
            System.out.println("After Reverse : ");
            System.out.println(Arrays.toString(arr));
        }
    }

    static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            reversedArray[j] = arr[i];
            j--;
        }
        return reversedArray;
    }

}
