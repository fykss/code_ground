package dynamic_programming.fibonacci;

/**
 * Tabulation (Bottom Up):
 * The tabulated program for a given problem builds a table in bottom up fashion and returns the last entry from table.
 * For example, for the same Fibonacci number, we first calculate fib(0) then fib(1) then fib(2) then fib(3) and so on.
 * So literally, we are building the solutions of subproblems bottom-up.
 */

public class FibonacciTabulation {

    private static int fib(int N) {
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
        long before = System.currentTimeMillis();
        System.out.println(String.format("Fibonacci Tabulation: %d", fib(40)));
        long after = System.currentTimeMillis();
        System.out.println(String.format("Millis left: %d", after - before));
    }
}
