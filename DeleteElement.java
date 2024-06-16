import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the position to delete the element (0-based index): ");
        int position = scanner.nextInt();

        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Array after deletion: ");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
