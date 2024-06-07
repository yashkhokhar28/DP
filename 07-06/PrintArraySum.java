
import java.util.ArrayList;
import java.util.Scanner;

public class PrintArraySum {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Total Element : ");
            int size = scanner.nextInt();
            sum(size);
        }
    }

    static void sum(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int oddSum = 0;
        int evenSum = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < n; i++) {
                int element = scanner.nextInt();
                arrayList.add(element);
            }
        }
        for (int j = 0; j < n; j++) {
            int element = arrayList.get(j);
            if (element % 2 == 0) {
                evenSum += element;
            } else {
                oddSum += element;
            }
        }
        System.out.println(
                "even sum : " + evenSum);
        System.out.println("odd sum : " + oddSum);
    }

}
