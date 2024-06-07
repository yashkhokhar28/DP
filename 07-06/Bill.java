import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a Amount : ");
            int amount = scanner.nextInt();
            calculateBll(amount);
        }
    }

    static void calculateBll(int amount) {
        double bill = 0;
        if (amount <= 200) {
            bill = amount * 0.80 + 100;
        } else if (amount >= 200 && amount <= 300) {
            bill = (amount - 100) * 0.80 + (amount - 200) * 0.90 + 100;
        } else if (amount >= 300) {
            bill = (amount - 100) * 0.80 + (amount - 200) * 0.90 + (amount - 300) * 1 + 100;
            bill = (bill * 12.36) / 100;
        }
        System.out.println(bill);
    }
}
