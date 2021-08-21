package Big0;

public class _509FibonacciNumber {
    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c;
        if(n == 0 || n == 1) return n;
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}
