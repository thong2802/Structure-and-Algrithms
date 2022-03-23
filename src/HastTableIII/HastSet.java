package HastTableIII;

import java.security.Key;
import java.util.ArrayList;

public class HastSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> myBuckets[];
    HastSet() {
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length ; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    public int HastFuntion(int key) {
        return key % SIZE;
    }

    public void addKey(int key) {
        int HastValueIndex = HastFuntion(key);
        var bucket = myBuckets[HastValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex < 0) {
            bucket.add(key);
        }
    }

    public void removeKey(int key) {
        int HastValueIndex = HastFuntion(key);
        var bucket = myBuckets[HastValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >= 0) {
            bucket.remove(keyIndex);
        }
    }

    public boolean containsKey(int key) {
        int HastValueIndex = HastFuntion(key);
        var bucket = myBuckets[HastValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex >= 0;
    }
    public static void main(String[] args) {
        HastSet hastSet = new HastSet();
        hastSet.addKey(1);
        hastSet.addKey(2);
        hastSet.addKey(1);
        hastSet.removeKey(1);
        hastSet.containsKey(2);
    }
}
