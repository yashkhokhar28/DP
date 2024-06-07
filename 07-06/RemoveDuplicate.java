
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Total Element : ");
            int size = scanner.nextInt();
            removeDuplicate(size);
        }
    }

    static void removeDuplicate(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < n; i++) {
                int element = scanner.nextInt();
                if (arrayList.contains(element)) {
                    continue;
                }
                arrayList.add(element);
            }
        }
        System.out.println(arrayList);
    }
}
