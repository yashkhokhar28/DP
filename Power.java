import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base : ");
        int base = scanner.nextInt();
        System.out.println("Enter Power : ");
        int power = scanner.nextInt();
        int sum = 1;
        for (int i = 0; i < power; i++) {
            sum *= base;
        }
        System.out.println(sum);
        scanner.close();
    }
}
