package leet_code.LISL;

import java.util.Arrays;

/**
 * Number of Longest Increasing Subsequence
 * Input: [1,3,5,4,7]
 * Output: 2
 * Explanation: The two longest increasing subsequence are [1, 3, 4, 7] and [1, 3, 5, 7].
 */

public class NumberOfLIS {

    private static int numberOfLIS(int[] arr) {
        int N = arr.length;
        if (N <= 1) return N;
        int[] lengths = new int[N]; //lengths[i] = length of longest ending in nums[i]
        int[] counts = new int[N]; //count[i] = number of longest ending in nums[i]
        Arrays.fill(counts, 1);

        for (int j = 0; j < N; ++j) {
            for (int i = 0; i < j; ++i) if (arr[i] < arr[j]) {
                if (lengths[i] >= lengths[j]) {
                    lengths[j] = lengths[i] + 1;
                    counts[j] = counts[i];
                } else if (lengths[i] + 1 == lengths[j]) {
                    counts[j] += counts[i];
                }
            }
        }

        int longest = 0, ans = 0;
        for (int length: lengths) {
            longest = Math.max(longest, length);
        }
        for (int i = 0; i < N; ++i) {
            if (lengths[i] == longest) {
                ans += counts[i];
            }
        }
        return ans;






//        int N = arr.length;
//        if (N == 0) return 0;
//
//        int[] counts = new int[N];
//        counts[0] = 1;
//        int max = 1;
//        int count = 0;
//        int maxInd = 0;
//
//        for (int i = 1; i < N; i++) {
//            int maxval = 0;
//
//            for (int j = 0; j < i; j++) {
//                if (arr[i] > arr[j]) {
//                    maxval = Math.max(maxval, counts[j]);
//
//                }
//            }
//            counts[i] = maxval + 1;
//
//            max = Math.max(max, counts[i]);
//
//            if (max > maxInd) {
//                maxInd = counts[i];
//            }
//        }

//        for (int i : counts) {
//            if (i == max) {
//                count++;
//            }
//            if (count > counts.length) {
//                count = counts.length;
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//
//        }




//        System.out.println(Arrays.toString(counts));
//
//        return count;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,4,7};

        System.out.println(numberOfLIS(arr));
    }
}
