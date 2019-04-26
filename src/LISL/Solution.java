package LISL;

import java.util.Arrays;

/**
 *     Longest Increasing Subsequence Length
 *     Нахождения длины наибольшей возрастающей подпоследовательности
 */

public class Solution {
    private static int Answer;

    private static int countSubsequence(int[] sequence) {
        int[] arrCount = new int[sequence.length];
        for (int i = 0; i < arrCount.length; i++) {
            arrCount[i] = 1;
        }
        
        if (sequence.length == 1) {
            return Answer = 1;
        }

        for (int i = 1; i < arrCount.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sequence[i] > sequence[j]) {
                    if (arrCount[i] <= arrCount[j]) {
                        arrCount[i] = arrCount[j] + 1;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(arrCount));

//        for (int i = 0; i < arr.length; i++) {
//            int max = arr[0];
//            if (arr[i] > max) {
//                Answer = arr[i];
//            }
//        }
//
//        int[] result = new int[arr.length];
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] == Answer) {
//                result[i] = sequence[i];
//                for (int j = i; j >= 0 ; j--) {
//
//                }
//                System.out.println(Arrays.toString(result));
//            }
//        }

        return Answer;
    }

    public static void main(String[] args) {
        int[] sequence = new int[] {5, 10, 6, 12, 3, 24, 7, 8};

        System.out.println(countSubsequence(sequence));
    }
}
