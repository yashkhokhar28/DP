
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number : ");
            int n = scanner.nextInt();
            boolean ans = checkPalindrome(n);
            System.out.println(ans);
        }
    }

    static boolean checkPalindrome(int n) {
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        return temp == sum;
    }

}
