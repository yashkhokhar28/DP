public class ValidWord {
    public static void main(String[] args) {
        String word = "234Adas";
        System.out.println(isValid(word));
    }

    static boolean isValid(String word) {
        if (word.length() < 3)
            return false;
        int vc = 0;
        int cc = 0;
        for (char c : word.toCharArray()) {
            if (c == '@' || c == '#' || c == '$')
                return false;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                vc++;
            } else {
                if ((c > 'a' && c <= 'z') || (c > 'A' && c <= 'Z'))
                    cc++;
            }

        }
        return vc > 0 && cc > 0;
    }

}
