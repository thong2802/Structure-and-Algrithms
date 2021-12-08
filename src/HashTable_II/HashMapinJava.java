package HashTable_II;

import java.util.HashMap;
import java.util.Map;

public class HashMapinJava {
    public static void main(String[] args) {
        int[] array = {1,1,1,3,4,3,4,5,6,7,8};
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : array) {
            if (map.containsKey(i) == false){
                map.put(i, 1);
            }else{
                int solanxuathien = map.get(i);
                solanxuathien++;
                map.put(i, solanxuathien);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " Xuat hien " + entry.getValue() +  " lan!");
        }
    }
}
