package BinarySearch;


// complixity time 0(logn)
// complexity space 0(logn)
public class BinarySearch_Recurion {
    public static int seach(int[] a, int target, int iLeft, int iRight) {
        // BTCS
        if (iLeft > iRight)
            return -1;
        // CT QUY NAP
        int iMid = (iLeft + iRight) / 2;
        if (target == a[iMid]) {
            return iMid;
        }else if (target < a[iMid]) {
            return seach(a, target, 0, iMid - 1);
        }else {
            return seach(a,target, iMid + 1, iRight);
        }
    }
    public static int BianrySearch(int[] a, int target) {
        return seach(a, target, 0, a.length - 1);
    }
    public static void main(String[] args) {
        int[] a = {-1,0,3,5,9,12};
        System.out.println(BianrySearch(a, 9));
    }
}
