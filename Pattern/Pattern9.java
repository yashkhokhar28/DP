/*  *********
     *******
      *****
       ***
        *
*/

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(5);
    }

    static void pattern9(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
