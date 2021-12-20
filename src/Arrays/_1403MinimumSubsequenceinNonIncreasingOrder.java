package Arrays;

import java.util.*;

public class _1403MinimumSubsequenceinNonIncreasingOrder {
    public static void sortDESC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static List<Integer> minSubsequence(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int a : nums) {
             sum += a;
        }
        // sort giam
        sortDESC(nums);
        int temp = 0;
        for (int i = 0; i < nums.length ; i++) {
            list.add(nums[i]);
            temp += nums[i];
            if (temp > sum - temp){
                break;
            }
        }
        return list;
    }
    /*
     4, 3, 10, 9, 8 -> sum = 34
     // sort
     10, 9, 8, 4, 3
     i = 10
     10 > 34 - 10 -> fasle
     10, 9, 8, 4, 3
     i = 9
     10 + 9 > 34 - (10 + 9) -> true
     */
    public static void main(String[] args) {
        int[] nums = {4,3,10,9,8};
        System.out.println(minSubsequence(nums));
    }
}
