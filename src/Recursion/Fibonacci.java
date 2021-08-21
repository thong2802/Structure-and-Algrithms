package Recursion;

public class Fibonacci {
    public static int fibonacci(int n){
        if (n == 1 || n == 2)
            return 1;
        int t = (fibonacci(n - 1) + fibonacci(n-2));
        return t;
    }

    // toi uu de quy tranh ton nhieu thoi gian va bo nho vi ham duoc goi nhieu lam
    // de quy co nho
   static int[] F = new int[1000];
    public static int fibonacci2(int n){
        if (F[n] != 0)
            return F[n];
        System.out.println("Cân tính F["+n+"]");

        if (n == 1 || n == 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = fibonacci(n - 1) + fibonacci(n-2);
        return F[n];
    }

    // các 2 k dung đệ quy
    public static int fibonacci3(int n){
       int[] Fibo = new int[11];
       // DK DUNG
       Fibo[1] = 1;
       Fibo[2] = 1;
        for (int i = 3; i < 10 ; i++) {
            Fibo[i] = F[i-1] + F[i-2];
        }
    return Fibo[n];
    }

    public static  int SumN(int n){
        if (n == 1)
            return 1;
        int t = n + SumN(n-1);
        return t;
    }

    public static void printIndex(int[] arr, int index){
        // bai toan co so
        if (index < 0 || index > arr.length)
            return;
        // bai toan quy nap
        printIndex(arr, index+1);
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        //  System.out.println(SumN(9));
//        int[] arr = {0,1,2,3,4};
//        printIndex(arr, 0);

        System.out.println(fibonacci3(10));
        Long t = System.currentTimeMillis();
    }
}
