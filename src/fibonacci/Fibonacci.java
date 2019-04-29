package fibonacci;

public class Fibonacci {
    public static int fib(int N) {
        int[] dp = new int[N];
        if (N <= 2) return N > 0 ? 1 : 0;

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[N - 1];
    }

    public static void main(String[] args) {
        System.out.println(fib(40));
    }
}
