package leet_code.bit_operation;

public class Example {

    private static int solution(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return 1;
        }

        int Answer = 0;
        int[] count = new int[arr.length];
        int max = count[0];

        for (int i = 0; i < count.length; i++) {
            count[i] = 1;
        }

        Answer = max;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && count[i] <= count[j]) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < count.length; i++) {

            if (count[i] > max) {
                Answer = count[i];
                max = count[i];
            }
        }

        return Answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6};

        System.out.println(solution(arr));
    }
}
