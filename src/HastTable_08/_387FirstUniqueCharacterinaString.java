package HastTable_08;

import java.util.HashMap;
import java.util.Map;

public class _387FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> myHastMap = new HashMap<>();
            int soLanXuatHien = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (myHastMap.containsKey(a) == false) {
                myHastMap.put(a, 1);
            } else {
                soLanXuatHien = myHastMap.get(a);
                soLanXuatHien++;
                myHastMap.put(a, soLanXuatHien);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char  a = s.charAt(i);
            if (myHastMap.get(a) == 1){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));

    }
}
