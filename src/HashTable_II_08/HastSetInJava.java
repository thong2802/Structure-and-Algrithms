package HashTable_II_08;

import java.util.HashSet;
import java.util.Set;

public class HastSetInJava {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(9);
        set.add(1);
        set.add(0);
        set.add(3);

        for (  Integer integer : set) {
            System.out.println(integer);
        }
    }
}
