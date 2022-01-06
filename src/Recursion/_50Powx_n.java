package Recursion;
//50. Pow(x, n)
public class _50Powx_n {
    public static double myPow0(double x, int n) {
        // dk dung
        // x^0 = 1
        if (n == 0) return 1;
        // n âm : 10^-1 => 1/10
        if (n < 0){
            n = -n; // -1 = 1
            x = 1/x; // 10 = 1/10
        }
        return x * myPow(x, n-1);
    }

    public static double myPow(double x, int n) {
        // dk dung
        // x^0 = 1
        if (n == 0) {
            return 1;
        }
        // n âm : 10^-1 => 1/10
        int n_2 = 0; // n/2
        if (n < 0){
           // n = -n; // -1 = 1 // compiler báo lỗi tràn số : vì -2^31 <= n <= 2^31-1 mà ta đổi ra n = -1 chỉ là 2^31 thôi, trong interger giới hạn là 2^31-1
            n_2 = n%2==0 ? -(n/2) : (-n-1)/2;
            x = 1/x; // 10 = 1/10
        }else {
           n_2 = n%2 == 0 ? n/2 : (n-1)/2;
        }
        // x^n = x^(n/2) * x^(n/2)

        double t = myPow(x, n_2);
        return n%2 == 0 ? (t*t) : (x*t*t);
//        if (n%2 == 0){
//            // x^4 = x^2 * x^2
//            double t = myPow(x, n_2);
//            return t*t;
//        }else {
//            // n le : vd x^5 = x * x^2 * x^2
//            // => x * x^n/2 * x^ n/2
//            double t = myPow(x, n_2);
//            return x * t * t;
//        }
    }


    public static void main(String[] args) {
        System.out.println( myPow(2,-2));
    }
}
