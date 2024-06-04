import java.util.Scanner;

public class TraillingZero {
    public static void main(String[] args) {
        System.out.println("Enter Number : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Trailling Zero : " + findZero(n));
        scanner.close();
    }

    static int findZero(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

}