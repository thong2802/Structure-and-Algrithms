package HastTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _1408StringMatchinginanArray {
    public static List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(i != j && words[i].contains(words[j])){
                     set.add(words[j]);
                }
            }
        }
        return new ArrayList<>(set);
    }
    // comlixity time O(n^2);
    // comlixity space O(n);
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        System.out.println(stringMatching(words));

    }
}
