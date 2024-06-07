import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = 3;
            int maximum;
            System.out.println("Enter a number : ");
            int a = scanner.nextInt();
            System.out.println("Enter a number : ");
            int b = scanner.nextInt();
            System.out.println("Enter a number : ");
            int c = scanner.nextInt();
            maximum = a > b ? a : b > c ? b : c;
            while (count-- != 0) {
                int minimum = a < b ? a : b < c ? b : c;
                System.out.println(minimum);
                a = minimum == a ? maximum : a;
                b = minimum == b ? maximum : b;
                c = minimum == c ? maximum : c;
            }
        }
    }
}
