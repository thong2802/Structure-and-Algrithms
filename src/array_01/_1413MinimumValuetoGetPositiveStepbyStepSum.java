package array_01;

public class _1413MinimumValuetoGetPositiveStepbyStepSum {
    public  static int minStartValue(int[] nums) {
        int startValue;
        int min = nums[0];
        for (int i = 1; i < nums.length;i++) {
            nums[i] += nums[i-1];
            if (min > nums[i]){
                min = nums[i];
            }
        }
        startValue = 1 - min;
        if (startValue <= 0){
            startValue = 1;
        }
        return startValue;
    }
    // complixity time : 0 (n)
    // complixity space: 0 (1)
    public static void main(String[] args) {
        int[] nums = {1,-2,-3};
        System.out.println(minStartValue(nums));
    }
}
