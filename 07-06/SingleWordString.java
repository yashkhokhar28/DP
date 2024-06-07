
import java.util.Scanner;

public class SingleWordString {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a String : ");
            String s = scanner.next();
            singleWordString(s);
        }
    }

    static void singleWordString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        for (int i = 0; i <= string.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(string.charAt(j));
            }
            System.out.println();
        }
    }
}
