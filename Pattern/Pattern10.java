/*       *
        * *
       * * *
      * * * *
     * * * * *
*/

public class Pattern10 {
    public static void main(String[] args) {
        pattern10(5);
    }

    static void pattern10(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
