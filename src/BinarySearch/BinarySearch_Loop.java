package BinarySearch;

public class BinarySearch_Loop {
    public static int binarySearch(int target, int[] a) {
        int n = a.length;
        int iLeft = 0;
        int iRight = n - 1;
        while (iLeft <= iRight) {
            int iMid = (iLeft + iRight) / 2;
            if (target == a[iMid]) {
                return iMid;
            }else if (target > a[iMid]){
                iLeft = iMid + 1;
            }else if (target < a[iMid]) {
                iRight = iMid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         int[] a = {-1,0,3,5,9,12};
        System.out.println(binarySearch(9, a));
    }
}
