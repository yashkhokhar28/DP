public class CalculateDays {
    public static void main(String[] args) {
        int days = 375;
        int year = days / 365;
        int remainingDays = days % 365;
        int week = remainingDays / 7;
        int remainingDaysFinal = remainingDays % 7;
        System.out.println(year);
        System.out.println(week);
        System.out.println(remainingDaysFinal);
    }
}
