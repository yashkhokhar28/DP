import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] arr = { -18, -22, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
            int target = 18;
            int ans = binarySearch(arr, target);
            System.out.println(ans);
            scanner.close();
        }

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
