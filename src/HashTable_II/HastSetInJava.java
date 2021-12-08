package HashTable_II;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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
