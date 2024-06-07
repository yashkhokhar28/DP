
import java.util.Scanner;

public class LastDigitSum {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a Number : ");
            int n1 = scanner.nextInt();
            System.out.println("Enter a Number : ");
            int n2 = scanner.nextInt();
            int n1Last = n1 % 10;
            int n2Last = n2 % 10;
            System.out.println("Sum : " + (n1Last + n2Last));
        }
    }
}
