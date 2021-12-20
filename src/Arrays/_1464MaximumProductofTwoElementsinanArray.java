package Arrays;

import java.util.Arrays;

public class _1464MaximumProductofTwoElementsinanArray {
    //Sorting : O (n logn )
    public static int maxProduct(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        result = (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        return result;
    }
   // c2
    public static int maxProduct1(int[] nums) {
        int firstmax = 0;
        int secondtmax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstmax) {
                secondtmax = firstmax;
                firstmax = nums[i];
            }else if (nums[i] > secondtmax){
                secondtmax = nums[i];
            }
        }
        return (firstmax -1) * (secondtmax -1);
    }

    public static void main(String[] args) {
       int[] nums ={3,4,5,2};
        System.out.println(maxProduct1(nums));
    }
}
