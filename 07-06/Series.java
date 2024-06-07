
import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a Number : ");
            int n = scanner.nextInt();
            printSeries(n);
        }
    }

    static void printSeries(int n) {
        int diff = 2;
        int sum = 1;
        System.out.print(sum + " ,");
        for (int i = 1; i < n; i++) {
            sum = sum + diff;
            System.out.print(sum + " ,");
            diff++;
        }

    }
}
