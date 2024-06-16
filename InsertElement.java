import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = scanner.nextInt();
        int[] arr = new int[size + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter a Position : ");
        int position = scanner.nextInt();

        System.out.println("Enter a Number : ");
        int number = scanner.nextInt();

        for (int i = size; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = number;
        System.out.println("New Array : " + Arrays.toString(arr));
        scanner.close();
    }
}
