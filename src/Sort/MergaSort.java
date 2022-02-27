package Sort;

import java.util.Arrays;

public class MergaSort {
    public static int[] sort(int[] a1, int[] a2) {
        // array then sorted have length n = a1.length + a2.length
        int n = a1.length + a1.length;
        int[] result = new int[n];

        // create three pointer i, i1, i2 => result, a1, a2
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else {
                if (i1 < a1.length) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                }else if (i2 < a2.length) { // a2 oke, a1 rong
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }
    public static int[] megarSort(int[] a, int L, int R){
        // bai toan cs || DK dung
        if (L > R) {
            return new int[0];
        }
        if (L == R){
            int[] sigle =  {a[L]};
            return sigle;
        }

        // CHIA DE TRI
        // chia ra
        int k = (L + R) / 2;
        int[] a1 = megarSort(a, L, k); // luu ben trai
        int[] a2 = megarSort(a, k+1, R); // luu ben phai

        // TROM VAO
        // a1, a2 la cac mang da duoc sap xep
        int[] resutl = sort(a1, a2);
        return resutl;

    }
    public  static int[] sortarr(int[] a) {
        return megarSort(a, 0, a.length - 1);
    }
    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortarr(nums)));
    }
}
