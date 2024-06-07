import java.util.Scanner;

public class OddEvenWithoutModulo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a positive number:");
            int n = scanner.nextInt();
            if ((n & 1) == 1) {
                System.out.println("Number is Odd");
            } else {
                System.out.println("Number is Even");
            }
        }
    }
}