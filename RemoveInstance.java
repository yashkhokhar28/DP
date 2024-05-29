
public class RemoveInstance {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int[] nums1 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val1 = 2;
        System.out.println(removeInstance(nums, val));
        System.out.println(removeInstance(nums1, val1));
    }

    static int removeInstance(int[] arr, int instance) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != instance) {
                count++;
            }
        }
        return count;
    }
}
