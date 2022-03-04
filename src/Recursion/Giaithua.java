package Recursion;

public class Giaithua {
    // tinh n! , return n!
    public static int TinhGiaiThua(int n){
        // bai toan co so
        if (n == 0)
            return 1;
        // CT quy nap
        int t = n*TinhGiaiThua(n-1);
        return t;
    }

    public static void main(String[] args) {
         int n = 4;
        System.out.println( TinhGiaiThua(n));
    }

}
