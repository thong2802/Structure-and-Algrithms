package Arrays;

import java.util.HashSet;
import java.util.Set;

public class _217ContainsDuplicate {
    // complixity time : o(n)
    // complixity space : o(n)
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> myHastSet = new HashSet<>();
        for (int a: nums) {
            if (myHastSet.contains(a) == true){
                return true;
            }else {
                myHastSet.add(a);
            }
        }
        return false;
    }
    public static void main(String[] args) {
      int[] nums = {1,2,3,1};
        System.out.printf(String.valueOf(containsDuplicate(nums)));
    }
}
