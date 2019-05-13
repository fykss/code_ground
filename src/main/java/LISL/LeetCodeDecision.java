package LISL;

/**
 * Longest Increasing Subsequence Length
 * Нахождения длины наибольшей возрастающей подпоследовательности
 */

public class LeetCodeDecision {

    private static int lengthOfLIS(int[] arr) {
        int N = arr.length;
        if (N == 0) {
            return 0;
        }

        int[] counts = new int[N];
        counts[0] = 1;
        int answer = 1;

        for (int i = 1; i < N; i++) {
            int maxval = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    maxval = Math.max(maxval, counts[j]);
                }
            }
            counts[i] = maxval + 1;
            answer = Math.max(answer, counts[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6};

        System.out.println(lengthOfLIS(arr));
    }
}
