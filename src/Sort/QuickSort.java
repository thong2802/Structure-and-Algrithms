package Sort;

public class QuickSort {
     static void quickSort(int[] a, int L, int R){
        //DK DUNG
        if (L >= R){
            return;
        }
        //b1 Chon khoa
         int key = a[(L+R)/2]; // quan tam toi gia tri cua khoa chu khong phai chi so index
        //b2 phan bo lai mang theo khoa
         int k = partition(a, L, R, key);
        //b3 chia nho mang
         quickSort(a, L, k-1);
         quickSort(a,k, R);
    }
    // return privot value
    static int partition(int[] a, int L, int R, int key){ // tra ve phan tu  chốt iL
        int iL = L;
        int iR = R;
        // doi phan tu khi iL < = iR
        while (iL <= iR) {
            while (a[iL] < key) iL++;
            // với iR tìm phần tử <= key để đổi chỗ
            while (a[iR] > key) iR--;
            // nếu a[il] > a[iR] => swap
            if (iL <= iR) {
                int temple = a[iL];
                a[iL] = a[iR];
                a[iR] = a[iL];
                iL++;
                iR--;
            }
        }
        return iL;
    }
    public static void main(String[] args) {
        int[] a = {5,1,1,2,0,0};
        quickSort(a, 0, a.length-1);
    }
}
