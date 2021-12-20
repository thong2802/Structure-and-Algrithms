package BinarySearch_11;

public class _852PeakIndexinaMountainArray {
    // Big0 : 0(N)
    // tìm phần tử lớn nhất mảng
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return 0;
        }
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (max < arr[i])
                max = arr[i];
        return max;
    }


    // binary Search log(n)
    public static int find(int[] a, int L, int R){
        int n = a.length;
        if (n < 3){
            return -1;
        }
        int i = (L + R) / 2;
        if (a[i] > a[i-1] && a[i] > a[i+1]){
            return i;
        }else if (a[i-1] < a[i]) { // chuyen ve ben phai
          return find(a, i, R);
        }else if (a[i+1] < a[i]) { // chuyen ve ben trai
            return find(a, L, i);
        }
        return -1;
    }
    public static int peakIndexInMountainArray1(int[] arr) {
        return find(arr, 0, arr.length -1);
    }

    public static void main(String[] args) {
       int[] a = {1,2,3,2,1};
        System.out.println(peakIndexInMountainArray1(a));
    }
}
