package dynamic_programming.maximum_subarray;

/**
 * Maximum Subarray:
 * Find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * https://leetcode.com/problems/maximum-subarray/
 */

public class Solution {

    private static int maximumSubarray(int[] arr) {
        int N = arr.length;
        int[] dp = new int[N];
        dp[0] = arr[0];
        int max = dp[0];

        for(int i = 1; i < N; i++){
            dp[i] = arr[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray(arr));
    }
}
