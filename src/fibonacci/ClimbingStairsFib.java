package fibonacci;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * Fibonacci
 */

public class ClimbingStairsFib {
    private static int climbingStairs(int n) {
        int[] dp = new int[n];
        if (n <= 3) return dp[n - 1] = n;
        dp[1] = 2;
        dp[2] = 3;

        for (int i = 3; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int input = 2;

        System.out.println(climbingStairs(input));
    }
}
