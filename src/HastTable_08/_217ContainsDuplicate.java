package HastTable_08;

import java.util.HashSet;
import java.util.Set;

public class _217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> myHastSet = new HashSet<>();
        for (int a: nums) {
            if (myHastSet.contains(a) == true) {  //da ton tai trong my HasrSet
                 return true;
            }else {
                myHastSet.add(a);
            }
        }
       return false;
    }

    public static void main(String[] args) {

    }
}
