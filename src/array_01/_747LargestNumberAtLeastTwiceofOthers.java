package array_01;

public class _747LargestNumberAtLeastTwiceofOthers {
    public static int dominantIndex(int[] nums) {
        int max = -1;
        int maxsecod = -1;
        int maxIndex = 0;
        if (nums.length == 1) return 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max || nums[i] == maxsecod){
                continue;
            }else if (nums[i] > max){
                maxsecod = max;
                max = nums[i];
                maxIndex = i;
            }else if (nums[i] > maxsecod){
                maxsecod = nums[i];
            }
        }
        if (max >= (maxsecod * 2)){
            return maxIndex;
        }
        return -1;
    }

    public static void main(String[] args) {
      int[] a = {3,6,1,0};
        System.out.println(dominantIndex(a));
    }
}
