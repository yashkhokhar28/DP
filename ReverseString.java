public class ReverseString {
    public static String reverseWords(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        String input = "this is an amazing program";
        String output = reverseWords(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }
}
