package Arrays;

public class _283MoveZeroes {
    // tao mang moi
    // complexity time 0(n)
    // complexity space 0(n)
    public static void moveZeroes(int[] a){
      int n = a.length;
      int[] T = new int[n];
      int iT = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                a[iT ++] = a[i];
            }
        }
        for (; iT < n; iT ++) {
            a[iT] = 0;
        }
    }
    // ki thuat 2 con tro
    // complexity time 0(n)
    // complexity space 0(1)
    public static void moveZeroes1(int[] a){
         int n = a.length;
         int index = 0;
        for (int i = 0; i < n ; i++) {
            if (a[i] != 0){
                a[index] = a[i];
                index ++;
            }
        }
        for (; index < n; index++) {
            a[index] = 0;
        }
    }


    public static void main(String[] args) {
         int[]  a = {0,1,0,3,12};
         moveZeroes(a);
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
