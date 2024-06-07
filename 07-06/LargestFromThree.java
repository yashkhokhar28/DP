
import java.util.Scanner;

public class LargestFromThree {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter First Number : ");
            int a = scanner.nextInt();
            System.out.println("Enter Second Number : ");
            int b = scanner.nextInt();
            System.out.println("Enter Third Number : ");
            int c = scanner.nextInt();
            int maximum = a > b ? a : b > c ? b : c;
            System.out.println("Maximum : " + maximum);
        }
    }
}
