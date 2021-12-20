package HastTable_08;

import java.util.HashMap;
import java.util.Map;

public class _1394FindLuckyIntegerinanArray {
    public static int findLucky(int[] arr) {
        int result = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a:arr) {
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        // get key and value in map
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key = " + key + ", Value = " + value);
            if (key == value && key > result){
                 result = key;
            }
        }
        return result;
    }
    // map
    // key : lưu trữ các giá trị phần tử trong mảng
    // value : lưu trữ số lần xuất hiện các phần tử trong mảng

    // complexity time : O(N)
    // complexity space : O(N)
    public static void main(String[] args) {
        int[] arr = {2,2,3,4};
        System.out.println(findLucky(arr));
    }
}
