import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeader {

    static ArrayList<Integer> printLeaders(int[] arr) {

        ArrayList<Integer> leaders = new ArrayList<>();

        int maxFromRight = arr[arr.length - 1];
        leaders.add(maxFromRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        System.out.println(printLeaders(arr));
    }
}
