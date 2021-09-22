package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _136_5HowManyNumbersAreSmallerThantheCurrentNumber {
    // array
    public  static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] countSmaller =  new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            // tai vi tri i di tim bao nhieu phan tu nho hon no
            int k = nums[i];
            for (int j = 0; j < nums.length ; j++) {
                if (nums[j] < k){
                  countSmaller[i] ++;
                }
            }
        }
     return countSmaller;
    }
    //hashtable
    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int n = nums.length;
        int[] count = new int[101];
        // dem so lan xuat hien cua cac phan tu truoc

        for (int i = 0; i < n; i++) {

        }

        return nums;
    }



    public static void main(String[] args) {
       int[] nums = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
