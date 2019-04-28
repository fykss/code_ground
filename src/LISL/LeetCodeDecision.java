package LISL;

public class LeetCodeDecision {

    private static int lengthOfLIS(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int[] counts = new int[arr.length];
        counts[0] = 1;
        int answer = 1;

        for (int i = 1; i < counts.length; i++) {
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
