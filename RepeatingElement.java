import java.util.HashMap;

public class RepeatingElement {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 3, 4, 5, 6, 7, 8, 9, 3, 3 };
        int majorityElement = majorityElement(arr);
        if (majorityElement == 0) {
            System.out.println("No Element Found For Given Condition");
        } else {
            System.out.println(majorityElement);
        }

    }

    static int majorityElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                count = map.get(arr[i]) + 1;
                if (count > arr.length / 3) {
                    return arr[i];
                } else {
                    map.put(arr[i], count);
                }
            } else {
                map.put(arr[i], 1);
            }
        }
        return 0;
    }
}
