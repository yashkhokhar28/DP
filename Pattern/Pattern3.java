/*  *****
    ****
    ***
    **
    *
*/

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }

    static void pattern3(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
