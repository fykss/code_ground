package LISL;

import java.util.Arrays;

/**
 * Longest Increasing Subsequence Length
 * Нахождения длины наибольшей возрастающей подпоследовательности
 */

public class MyDecisionSimple {
    private static int Answer;

    private static int countSubsequence(int[] sequence) {
        int[] arrCount = new int[sequence.length];
        int[] findSeq;
        int tempIndMax = 0;
        int count = 1;

        if (sequence.length == 1) {
            return Answer = 1;
        }

        for (int i = 0; i < arrCount.length; i++) {
            arrCount[i] = 1;
        }

        System.out.println("Our sequence: " + Arrays.toString(sequence));

        for (int i = 1; i < arrCount.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sequence[i] > sequence[j] && arrCount[i] <= arrCount[j]) {
                    arrCount[i] = arrCount[j] + 1;
                }
                int max = arrCount[0];
                if (arrCount[j] > max) {
                    Answer = arrCount[i];
                    tempIndMax = i;
                }
            }
        }

        findSeq = new int[Answer];
        findSeq[Answer - count++] = sequence[tempIndMax];

        for (int i = tempIndMax; i > 0; i--) {
            if (arrCount[i] - arrCount[i - 1] == 1) {
                findSeq[Answer - count++] = sequence[i - 1];
            }
        }

        System.out.println("Count max length sequence: " + Arrays.toString(arrCount));

        System.out.println("Find index max length of sequence: " + tempIndMax);

        System.out.println("Longest Increasing Subsequence: " + Arrays.toString(findSeq));

        return Answer;
    }

    public static void main(String[] args) {
        int[] sequence = new int[]{5, 10, 6, 12, 3, 24, 7, 8};

        System.out.println("Max length sequence: " + countSubsequence(sequence));
    }
}


//private static int solution(int[] arr) {
//        if (arr.length == 0) {
//            return 0;
//        } else if (arr.length == 1) {
//            return 1;
//        }
//
//        int Answer = 0;
//        int[] count = new int[arr.length];
//        int max = count[0];
//
//        for (int i = 0; i < count.length; i++) {
//            count[i] = 1;
//        }
//
//        Answer = max;
//
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (arr[i] > arr[j] && count[i] <= count[j]) {
//                    count[i]++;
//                }
//            }
//        }
//
//        for (int i = 0; i < count.length; i++) {
//
//            if (count[i] > max) {
//                Answer = count[i];
//                max = count[i];
//            }
//        }
//
//        return Answer;
//    }