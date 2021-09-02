package HastTable;

import java.util.HashMap;
import java.util.Map;

public class HastMapInJava {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 1, 2};
        Map<Integer, Integer> hastMap = new HashMap<>();
        // KEY : gia tri cua phan tu trong mang
        // value : so lan xuat hien phan tu trong mang
        for (int i: array) {
           if (hastMap.containsKey(i) == false){
               hastMap.put(i, 1); // vi them vao lan dau nen so lan xuat hien dat bang 1
           }else {
               // i da xuat hien truoc do roi
               int soLanXuatHien = hastMap.get(i);
               soLanXuatHien ++;
               // update lai
               hastMap.put(i, soLanXuatHien);

           }
        }

        for (Map.Entry entry: hastMap.entrySet()) {
            System.out.println(entry.getKey() + " so lan xuat hien: " + entry.getValue());
        }
    }
}
