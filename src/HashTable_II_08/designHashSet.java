package HashTable_II_08;

import java.util.ArrayList;

public class designHashSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> myBucket[];
    designHashSet(){
        myBucket = new ArrayList[SIZE];
        for (int i = 0; i < myBucket.length; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }
    // return hashValue
    private int hastFuntion(int key){
        return key % SIZE;
    }

    // add key
    private void addKey(int key){
        int hashValueIndex = hastFuntion(key);
        var bucket = myBucket[hashValueIndex];
        // check contains
        int keyIndex = bucket.indexOf(key);

        if (keyIndex < 0){
            bucket.add(key);
        }
    }

    // remove key
    private void remove(int key){
        int hashValueIndex = hastFuntion(key);
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >= 0){
            bucket.remove(key);
        }
    }

    // contains
    private  boolean contains (int key){
        int hashValueIndex = hastFuntion(key);
        var bucket = myBucket[hashValueIndex];
        int keyIndex = bucket.indexOf(key);

        return keyIndex >=0 ? true : false;
    }

    public static void main(String[] args) {
        designHashSet set = new designHashSet();
        set.addKey(1);
        set.contains(1);
        set.addKey(1);
        set.addKey(3);
        set.remove(1);

    }

}
