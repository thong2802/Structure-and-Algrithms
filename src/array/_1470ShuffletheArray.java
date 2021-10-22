package array;

import java.util.Arrays;

public class _1470ShuffletheArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[i*2] = nums[i]; // nums = [2,5,1,3,4,7], n = 3 => result[0*2] ~ result[0] = nums[i]
            result[i*2+1] = nums[i + n];
        }
        return result;
    }
    // complixity time O(n)
    // complixity space O(2n)

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }
}
