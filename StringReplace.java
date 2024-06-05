import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Enter length of String Array : ");
        int length = scanner.nextInt();
        scanner.nextLine();
        String[] wordDict = new String[length];
        for (int i = 0; i < wordDict.length; i++) {
            wordDict[i] = scanner.nextLine();
        }
        boolean ans1 = stringReplace(s, wordDict);
        System.out.println(ans1);
        scanner.close();

    }

    static boolean stringReplace(String s, String[] wordDict) {
        for (int i = 0; i <= wordDict.length - 1; i++) {
            s = s.replace(wordDict[i], "");
        }
        if (s == "") {
            return true;
        }
        return false;
    }

}