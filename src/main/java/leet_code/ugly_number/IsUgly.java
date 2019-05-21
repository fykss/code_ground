package leet_code.ugly_number;

/**
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * Input: 6
 * Output: true
 * Explanation: 6 = 2 × 3
 * Input: 14
 * Output: false
 * Explanation: 14 is not ugly since it includes another prime factor 7.
 */

public class IsUgly {

    private static boolean isUgly(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;

        if (n % 2 == 0) return isUgly(n / 2);
        if (n % 3 == 0) return isUgly(n / 3);
        if (n % 5 == 0) return isUgly(n / 5);

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }
}

