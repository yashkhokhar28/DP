public class Pattern13 {
    public static void main(String[] args) {
        pattern13(5);
    }

    static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if (i != 1) {
                for (int j = 1; j < 2 * (i - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
