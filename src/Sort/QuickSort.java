package Sort;

import java.util.Arrays;
import java.util.WeakHashMap;

public class QuickSort {
    public static void quickSort(int[] a, int L, int R) {
        // bai toan co so
        if (L >= R)
            return;
        // chon key
        int key = a[(L + R) / 2];
        // phan bo lai mang theo khoa
        int k = partition(a, L, R, key);
        // chia nho mang theo khoa iL va lap lai
        quickSort(a, 0, k-1);
        quickSort(a, k, R);
    }
    public static int partition(int[] a, int L, int R, int key) {
        int iL = L;
        int iR = R;
        // swap if iL a[iL] < a[iR]
        while (iL <= iR){
            // with iL, find element > key => swap
            while (a[iL] < key) iL++;
            // with iR, find element < key => swap
            while (a[iR] > key) iR--;

            // if a[iL] < a[iR]
            while (a[iL] <= a[iR]) {
                // swap
                int temp = a[iL];
                a[iL] = a[iR];
                a[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL;
    }
    public static void main(String[] args) {
        int[] a = {6,7,8,5,4,1,2,3};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
