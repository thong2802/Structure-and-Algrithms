package HashTable_II;

import java.util.ArrayList;
import java.util.Objects;

public class designHashMap {
    private class Data {
        int value;
        int key;

        Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof Data)
                return this.key == ((Data)other).key;
            return false;
        }
    }

    private final int SIZE = 1000;
    private ArrayList<Data> myBucket[];

    designHashMap(){
      myBucket = new ArrayList[SIZE];
        for (int i = 0; i < myBucket.length; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }
    public int hashFuntion(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int hastValueIndex = hashFuntion(key);
        var bucket = myBucket[hastValueIndex];
        Data newData = new Data(key, value);
        int keyIndex = bucket.indexOf(newData);
        if (keyIndex >= 0){
            bucket.get(keyIndex).value = value;
        }else {
            bucket.add(newData);
        }
    }

    public void remove (int key) {
        int hastValueIndex = hashFuntion(key);
        var bucket = myBucket[hastValueIndex];
        Data deleteData = new Data(key, 0);
        int keyIndex = bucket.indexOf(deleteData);
        if (keyIndex >= 0){
            bucket.remove(deleteData);
        }
    }

    public int get (int key) {
        int hashValueIndex = hashFuntion(key);
        var bucket = myBucket[hashValueIndex];
        Data findData = new Data(key, 0);
        int keyIndex = bucket.indexOf(findData);
        if (keyIndex >= 0){
            return bucket.get(keyIndex).value;
        }
        return -1;
    }

    public static void main(String[] args) {
        designHashMap map = new designHashMap();
        map.put(1,1);
        map.put(1,2);
        map.put(4,1);
        map.put(4,2);
        map.remove(1);
        System.out.println(map.get(4));
    }
}
