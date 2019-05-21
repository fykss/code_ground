package leet_code.LISL;

public class MaximumSubarray {
    public static int maximumSubarray(int[] arr) {
        int N = arr.length;
        if (N <= 1) return arr[0];

        int[] dp = new int[N];
        dp[0] = arr[0];
        int answer = 0;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] = arr[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
                answer = Math.max(answer, dp[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {-1};

        System.out.println(maximumSubarray(arr));
    }
}
