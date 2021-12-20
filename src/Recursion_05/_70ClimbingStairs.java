package Recursion_05;

public class _70ClimbingStairs {
    //So buoc = tong so buoc ma buoc 1 buoc + tong so cach ma buoc 2 buoc
    // SB = SB(N-1) + SB(N-2)
    // bai toan co so +
    // n = 1 - > SB(1) = 1
    // n =2 -> SB(2) = 2
    // N = 3 -> SB(2) + SB(1) = 3
    static  int[] F = new int[46];
    public static int climbStairs(int n) {
        // bao toan co so
        if (F[n] != 0)
            return F[n];

        if (n == 1 || n == 2){
            F[1] = 1;
            F[2] = 2;
            return n;
        }
        // cong thuc quy hoi
        F[n] = climbStairs(n-1) + climbStairs(n-2);
        return F[n];
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
}
