package BinarySearch;

public class _704_Binary_Search {
    // su dung vong lap
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int iLeft = 0;
        int iRight = n - 1;
        while (iLeft <= iRight){
            int iMid = (iLeft + iRight)/2;
            if (target == nums[iMid]){
                return iMid;
            }
            else if (target > nums[iMid]){
                iLeft = iMid + 1;
            }else  {
                iRight = iMid - 1;
            }
        }
       return -1;
    }

    // su dung de quy
    public static int searchb(int[] nums, int target, int iLeft, int iRight) {
        if (iLeft > iRight)
            return -1;
        int iMid = (iLeft + iRight)/2;
        if (target == nums[iMid]){
           return iMid;
       }else if (target > nums[iMid]){
           return searchb(nums, target, iMid + 1, iRight);
       }else {
           return searchb(nums, target, iLeft, iMid-1);
       }
    }

    public static int searchb(int[] nums, int target) {
        int n = nums.length;
       return  searchb(nums, target, 0, n-1);
    }


    public static void main(String[] args) {
       int[] nums = {-1,0,3,5,9,12};
        System.out.println( searchb(nums, 9));
    }
}
