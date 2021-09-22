package array;

import java.util.HashMap;
import java.util.Map;

public class _1512NumberofGoodPairs {

    // array
    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
        }
       return count;
    }
    // hashtable
    public static int numIdenticalPairs1(int[] nums) {
        int count = 0;
        Map<Integer, Integer> mapCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mapCount.containsKey(nums[i]) == true){
                int soLanXuatHien = mapCount.get(nums[i]);
                count+= soLanXuatHien;
                // cap nhap lai so lan xuat hien
                mapCount.put(nums[i], soLanXuatHien +1);
                // cap nhap lai
            }else {
                // so nay chua xzuat hien
                mapCount.put(nums[i], 1);
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs1(nums));
    }
}
