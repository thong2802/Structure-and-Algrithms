package Arrays;

import java.util.ArrayList;
import java.util.List;

public class _1441BuildanArrayWithStackOperations {
    public static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int sequene = 1;
        for (int i = 0; i < target.length;) {
            if (target[i] == sequene) {
                list.add("Push");
                i++;
            }else {
                list.add("Push");
                list.add("Pop");
            }
            sequene ++;
        }
        return list;
    }

    // complixity  time O(n)
    // Complixixty space 0(n)
    public static void main(String[] args) {
        int[] target = {1,3};
        System.out.println(buildArray(target, 3));
    }
}
