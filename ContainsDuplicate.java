import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        findDuplicate(arr);
        scanner.close();
    }

    static void findDuplicate(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
                duplicates.add(arr[i]);
            } else {
                hashMap.put(arr[i], 1);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("Array does not contain duplicate elements.");
        } else {
            System.out.println("Array contains duplicate elements: " + duplicates);
        }
    }
}
