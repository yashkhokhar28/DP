import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a Number : ");
            int n1 = scanner.nextInt();
            boolean isEven = false;
            for (int i = 0; i < n1; i++) {
                isEven = !isEven;
            }
            if (isEven) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
        }
    }

}
