package Recursion_05;

public class _509FibonacciNumber {
    // dung de quy
    public static int fib(int n) {
        // dk kien dung
        if (n == 0) return 0;
        // dk co so
        if (n == 1 || n == 2){
            return 1;
        }
        int t = fib(n - 1) + fib(n-2);
        return t;
    }
    // dung for
    public static int fib1(int n) {
        int[] Fibo = new int[11];
        // DK DUNG
        Fibo[1] = 1;
        Fibo[2] = 1;
        for (int i = 3; i < 10 ; i++) {
            Fibo[i] = Fibo[i-1] + Fibo[i-2];
        }
        return Fibo[n];
    }

    public static void main(String[] args) {
        System.out.println(fib1(4));
    }
}
