package array_01;

public class _283MoveZeroes {
    // tao mang moi
    public static void moveZeroes(int[] a){
       int n = a.length;
       int[] b = new int[n];
       int k = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0){
                b[k] = a[i];
                k++;
            }
        }
        for (;k< n; k++) {
            b[k] = 0;
        }
    }
    // ki thuat 2 con tro
    public static void moveZeroes1(int[] a){

    }


    public static void main(String[] args) {
         int[]  a = {0,1,0,3,12};
         moveZeroes(a);
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
