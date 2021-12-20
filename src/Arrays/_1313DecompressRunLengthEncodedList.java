package Arrays;

import java.util.Arrays;

public class _1313DecompressRunLengthEncodedList {
    public static int[] decompressRLElist(int[] nums) {
        int len = 0;

        // find length of new array
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }
         int [] arr = new int[len];
         int k = 0;
        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                arr[k] = nums[i+1];
                k++;
            }
        }
        return arr;
    }
    // Complextiy time 0(N / 2 * 100) = > (N * 100)
    // Complextiy Space 0(n)
    public static void main(String[] args) {
        int[] nums = {1,1,2,3};
        System.out.println(Arrays.toString(decompressRLElist(nums)));
    }
}
