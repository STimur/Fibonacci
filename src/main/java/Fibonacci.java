public class Fibonacci {
    public static int of(int n) {
        int a = 0;
        int b = 1;
        for (; n != 0; n--) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
}
