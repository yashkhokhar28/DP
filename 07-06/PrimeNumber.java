
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a Number : ");
            int n = scanner.nextInt();
            boolean isPrime = checkPrime(n);
            System.out.println(isPrime);
        }
    }

    static boolean checkPrime(int n) {
        boolean isPrime = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }
}
