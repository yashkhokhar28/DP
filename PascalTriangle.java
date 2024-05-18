import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the row number (r): ");
            int row = scanner.nextInt();
            System.out.print("Enter the column number (c): ");
            int column = scanner.nextInt();
            System.out.printf("Element at position (%d, %d) in Pascal's triangle: %d\n",
                    row, column, pascalsTriangleElement(row, column));
        } catch (StackOverflowError e) {
            System.out.println("Oops! The calculation resulted in a stack overflow. Please try with smaller numbers.");
        } finally {
            scanner.close();
        }
    }

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    static int pascalsTriangleElement(int r, int c) {
        int value = factorial(r) / (factorial(c) * factorial(r - c));
        System.out.println(value);
        return value;
    }

}
