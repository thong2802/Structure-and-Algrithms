package Sort;

import java.util.Arrays;

public class myMergaSort {
    // Megar
    public static int[] sort(int[] a1, int[] a2){
        // mang sau khi sap xep  = a1.length + a2.length
        int n = a1.length + a2.length;
        int[] resutl = new int[n];
        // tao ra 3 con tro tro vao a, a1, a2;
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) { // => a1 && a2 != Rong
                if (a1[i1] <= a2[i2]) { // a1 <= a2
                    resutl[i] = a1[i1];
                    i++;
                    i1++;
                } else { // a1 > a2
                    resutl[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else { // a1 or a2 rong
                if (i1 < a1.length) { // a1 oke, a2 rong
                    resutl[i] = a1[i1];
                    i++;
                    i1++;
                }else { //a1 rong, a2 oke
                    resutl[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return resutl;
    }
    public static int[] MegarSort1(int[] a, int L, int R){
         // DKDUNG
         if (L > R) return new int[0];
         if (L == R) { // Mang chi co mot phan tu
             int[] single = {a[L]};
             return single;
         }
         // CHIA DE TRI
       // System.out.println("Chia ra " + L + " - " + R);
        int k = (L + R)/2; // tach lam 2 mang
        int[] a1 = MegarSort1(a, L, k);  // luu mang ben phai
        int[] a2 = MegarSort1(a, k+1, R);  // luu mang ben trai

         // TRON a1, a2 la cas mang da duoc sap xep
        int[] resutl = sort(a1, a2);
        return resutl;
    }
    public static int[] MegarSort1(int[] nums){
        return MegarSort1(nums, 0, nums.length-1);
    }

    public static void main(String[] args) {
        myMergaSort s = new myMergaSort();
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,10};
        int[] c = {5,1,1,2,0,0};
        System.out.println(Arrays.toString(s.MegarSort1(c)));

    }
}
