package array_01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1331RankTransformofanArray {
    public static int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(arr);
        int k=1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                continue;
            }else {
                map.put(arr[i], k);
                k++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            result[i] = map.get(temp[i]);
        }
        return result;
    }
    // 40 10 20 30
    // sort
    // 10 20 30 40
    // Map<10, 1><20,2><30,3><40,4>
    //complexit time O(NLogN)
    //complexit space O(N)
    public static void main(String[] args) {
       int[] arr = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
}
