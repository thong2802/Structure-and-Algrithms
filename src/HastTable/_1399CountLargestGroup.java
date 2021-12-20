package HastTable;

import java.util.HashMap;
import java.util.Map;

public class _1399CountLargestGroup {
    // c1
    public static int countLargestGroup(int n) {
        int max = 0, result = 0;
        Map<Integer, Integer> map = new HashMap<>(); // Store frequencies in a HashMap
        do {
            int sum = digitsSum(n);
            map.put(sum, map.getOrDefault(sum,0)+1);

            if (map.get(sum) > max) { // Check if the actual frequency is greater than max
                max = map.get(sum);
                result = 1;
            } else if (map.get(sum) == max) {
                result++;
            }
        }while (n --> 1);  //means: subtract one from n, and check whether its value before the subtraction was greater than 1.
        return result;
    }

    public static int  digitsSum(int val) {
        int sum = 0;
        while (val != 0) {
            sum += (val % 10);
            val /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(countLargestGroup(24));
    }
}
