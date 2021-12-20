package array_01;

public class _485MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0){
                count = 0;
            }else {
                count ++;
                max = (count > max)?  count : max;
            }
        }
      return max;
    }
    public static void main(String[] args) {
       int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
