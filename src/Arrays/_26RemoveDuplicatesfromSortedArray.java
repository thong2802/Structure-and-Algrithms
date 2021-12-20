package Arrays;

public class _26RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
          int n = nums.length;
          int curIndex = 0;
          if (n == 0){
              return 0;
          }
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[curIndex]){
                curIndex++;
                nums[curIndex] = nums[i];
            }
        }
        return curIndex +1;
    }

    public static void main(String[] args) {
        int[] nums= {0};
        System.out.println(removeDuplicates(nums));

    }
}
