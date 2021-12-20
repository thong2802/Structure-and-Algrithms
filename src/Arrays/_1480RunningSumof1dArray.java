package Arrays;

import java.util.Arrays;

public class _1480RunningSumof1dArray {
    // solution 1: su dung bo nho
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
    // complexity time : o(n)
    // complexity space: 0(1)

    // solution : Using Input Array for Output
    public static int[] runningSum1(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
    // complexity time : o(n)
    // complexity space: 0(1)

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum1(nums)));
    }
}
