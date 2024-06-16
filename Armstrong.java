public class Armstrong {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int result = isAramstorng(i);
            if (result == 0) {
                continue;
            } else {
                System.out.println(result);
            }
        }
    }

    static int isAramstorng(int n) {
        String size = String.valueOf(n);
        int length = size.length();
        double sum = 0;
        int originalNumber = n;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + Math.pow(rem, length);
            n = n / 10;
        }
        if (originalNumber == sum) {
            return originalNumber;
        } else {
            return 0;
        }
    }
}