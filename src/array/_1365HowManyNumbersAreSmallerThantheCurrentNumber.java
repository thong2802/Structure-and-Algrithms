package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1365HowManyNumbersAreSmallerThantheCurrentNumber {
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
    //hashtable, sort
    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] original = Arrays.copyOf(nums, n);
        Map<Integer, Integer> myMap = new HashMap<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
           if(myMap.containsKey(nums[i]) == false){
               myMap.put(nums[i], i);
           }else {
               // bo qua phan tu trung lap
           }
        }
        for (int i = 0; i < original.length; i++) {
            result[i] = myMap.get(original[i]);
        }
        return result;
    }



    public static void main(String[] args) {
       int[] nums = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
