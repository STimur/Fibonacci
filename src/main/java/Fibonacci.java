public class Fibonacci {
    public static int of(int n) {
        return of(0, 1, n);
    }

    private static int of(int a, int b, int n) {
        if (n == 0)
            return a;
        return of(b, a + b, n - 1);
    }
}
