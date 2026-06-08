package leetcode;

public class MaximumSubArray53 {

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            currsum += nums[i];

            if (currsum > maxsum) {
                maxsum = Math.max(maxsum, currsum);
            }

            if (currsum < 0) {
                currsum = 0;
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = {2, -5, 1, 7, -3, 4, -6};

        int maxi = maxSubArray(arr);
        System.out.println(maxi);
    }
}