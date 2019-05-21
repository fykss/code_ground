package leet_code.fibonacci;

/**
 * Memoization (Top Down):
 * We initialize a lookup array with all initial values as NIL. Whenever we need the solution to a subproblem,
 * we first look into the lookup table. If the precomputed value is there then we return that value, otherwise,
 * we calculate the value and put the result in the lookup table so that it can be reused later.
 */

public class FibonacciMemoization {
    private final static int MAX = 100;
    private final static int NIL = -1;

    private static int lookup[] = new int[MAX];

    private static void _initialize() {
        for (int i = 0; i < MAX; i++)
            lookup[i] = NIL;
    }

    private static int fib(int n) {
        if (lookup[n] == NIL) {
            if (n <= 1)
                lookup[n] = n;
            else
                lookup[n] = fib(n - 1) + fib(n - 2);
        }
        return lookup[n];
    }

    public static void main(String[] args) {
        _initialize();
        long before = System.currentTimeMillis();
        System.out.println(String.format("Fibonacci Memoization: %d", fib(40)));
        long after = System.currentTimeMillis();
        System.out.println(String.format("Millis left: %d", after - before));
    }
}
