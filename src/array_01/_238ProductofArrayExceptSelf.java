package array_01;

import java.util.Arrays;

public class _238ProductofArrayExceptSelf {
    public  static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] left_Products =  new int[n];
        int[] rigth_Products =  new int[n];

        int[] output_arr =  new int[n];

        left_Products[0] = 1;
        rigth_Products[n-1] = 1;
        for (int i = 1; i < n; i++) {
            left_Products[i] = nums[i-1] * left_Products[i-1];
        }
        for (int i = n-2; i >= 0; i--) {
            rigth_Products[i] = nums[i+1] * rigth_Products[i+1];
        }

        for (int i = 0; i < n ; i++) {
            output_arr[i] = left_Products[i] * rigth_Products[i];
        }
      return output_arr;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
