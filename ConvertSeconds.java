public class ConvertSeconds {
    public static void main(String[] args) {
        int seconds = 10000;

        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;
        int minutes = remainingSeconds / 60;
        int remainingSecondsFinal = remainingSeconds % 60;

        String timeFormatted = String.format("%d:%02d:%02d", hours, minutes, remainingSecondsFinal);

        System.out.println(seconds + " seconds is equal to " + timeFormatted);
    }
}
