package Sort;

import java.util.Arrays;

public class QuickSort1 {
    public static void quickSort(int[] a, int L, int R) {
        // DK DUNG
        if (L >= R) return;
        // B1: chon khoa
        int key = a[(L + R)/2];
        //b2: phan bo lai mảng theo khoá
        int k = partition(a, L, R, key);
        System.out.println("L = " + L + "| R = " + R + "| key = " + key + "| k= " + k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, L, R+1)));
        //b3:  chia nhỏ mảng theo khoá iL va lap lai
        quickSort(a, L, k-1);
        quickSort(a, k, R);
    }

    public static int partition(int[] a, int L, int R, int key) {
        int iL = L;
        int iR = R;
        // swap phan tu khi a[iL] < a[iR]
        while (iL <= iR) {
            // với iL tìm phần tử >= key để đổi chỗ
           while (a[iL] < key) iL++;
            // với iR tìm phần tử <= key để đổi chỗ
           while (a[iR] > key) iR--;
            // nếu a[il] > a[iR] => swap
           if (iL <= iR) {
               int tem = a[iL];
               a[iL] = a[iR];
               a[iR] = tem;
               iL++;
               iR--;
           }
        }
       return iL;
    }

    public static void main(String[] args) {
        int[] a = {6,7,8,5,4,1,2,3};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
