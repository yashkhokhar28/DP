import java.util.Arrays;

public class KthLargestEleent {
    public static void main(String[] args) {
        int[] nums1 = { 3, 2, 1, 5, 6, 4 };
        int k1 = 2;
        System.out.println(findKthLargest(nums1, k1));

        int[] nums2 = { 3, 2, 1, 5, 6, 4 };
        int k2 = 4;
        System.out.println(findKthLargest(nums2, k2));
    }

    static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
