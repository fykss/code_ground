package dynamic_programming.ugly_number;

public class UglyByIndex {
    private static int nthUglyNumber(int n) {
        if (n == 1) return 1;

        int[] ugly = new int[n];
        ugly[0] = 1;

        int i2 = 0, i3 = 0, i5 = 0;
        int next_mult_of_2 = 2;
        int next_mult_of_3 = 3;
        int next_mult_of_5 = 5;

        int ugly_number = 1;

        for (int i = 1; i < n; i++) {
            ugly_number = Math.min(next_mult_of_2, Math.min(next_mult_of_3, next_mult_of_5));
            ugly[i] = ugly_number;

            if (ugly_number == next_mult_of_2) {
                i2++;
                next_mult_of_2 = ugly[i2] * 2;
            }
            if (ugly_number == next_mult_of_3) {
                i3++;
                next_mult_of_3 = ugly[i3] * 3;
            }
            if (ugly_number == next_mult_of_5) {
                i5++;
                next_mult_of_5 = ugly[i5] * 5;
            }
        }

        return ugly_number;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(8));
    }
}
