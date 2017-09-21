public class Fibonacci {
    public static int of(int n) {
        if (n <= 1)
            return n;
        return of(n-2) + of(n-1);
    }
}
