public class SumOfSeries {
    public static void main(String[] args) {
        int term = 5;
        int sum = 0;
        for (int i = 1; i <= term; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}
