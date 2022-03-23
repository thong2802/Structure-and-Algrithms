package HastTableIII;

import java.util.ArrayList;
import java.util.Objects;

public class HastMap {
    private static class Data {
        int value;
        int key ;
        Data(int value, int key) {
            this.value = value;
            this.key = key;
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof Data){
                return this.key == ((Data)other).key;
            }
            return false;
        }
    }
    public final int SIZE = 1000;
    public ArrayList<Data> myBuckets[];
    HastMap() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    public int HastFuntion(int key) {
        return key % SIZE;
    }
    public void put(int key, int value) {
        int HastIndexValue = HastFuntion(key);
        var bucket = myBuckets[HastIndexValue];
        Data newData = new Data(key, value);
        int keyIndex = bucket.indexOf(newData);
        if (keyIndex >= 0) {
            bucket.get(keyIndex).value = value;
        }else {
            bucket.add(newData);
        }
    }

    public void remove(int key) {
        int HastIndexValue = HastFuntion(key);
        var bucket = myBuckets[HastIndexValue];
        Data delete = new Data(key, 0);
        int keyIndex = bucket.indexOf(delete);
        bucket.remove(delete);
    }

    public int get(int key) {
        int HastIndexValue = HastFuntion(key);
        var bucket = myBuckets[HastIndexValue];
        Data find = new Data(key, 0);
        int keyIndex = bucket.indexOf(find);
        if (keyIndex >= 0) {
           return bucket.get(keyIndex).value;
        }
        return -1;
    }
    public static void main(String[] args) {
        HastMap hastMap = new HastMap();
        hastMap.put(1, 1);
        hastMap.put(1, 2);
        hastMap.put(10, 2);
        System.out.println(" " + hastMap.get(1));
        System.out.println(" " + hastMap.get(2));
        hastMap.remove(1);
        System.out.println(" " + hastMap.get(1));
        System.out.println(" " + hastMap.get(10));}
}

