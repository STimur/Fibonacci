public class Fibonacci {
    public static int of(int n) {
        return of(0, 1, n);
    }

    private static int of(int a, int b, int n) {
        while (n != 0) {
            int c = a + b;
            a = b;
            b = c;
            n--;
        }
        return a;
    }
}
