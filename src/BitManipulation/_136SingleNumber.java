package BitManipulation;

import java.util.HashSet;
import java.util.Set;
//LC_072
// two number the same xor together = 0
// o xor number else = number else
public class _136SingleNumber {
    public static int singleNumber(int[] a) {
      int result = 0;
        for (int ai : a) {
            result ^= ai;
        }
      return  result;
    }

    // hastmap

    public static void main(String[] args) {
        int[] nums = {11,8,11};
        System.out.println(singleNumber(nums));
    }
}
