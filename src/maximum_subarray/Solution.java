package maximum_subarray;

public class Solution {

    private static int maximumSubarray(int[] arr) {
        int N = arr.length;
        int[] dp = new int[N]; //dp[i] means the maximum subarray ending with A[i];
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
