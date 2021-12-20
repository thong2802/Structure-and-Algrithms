package HastTable;

import java.util.ArrayList;

public class HastSet {
    private final int SIZE = 1000;
    private ArrayList<Integer> myBuckets[];

    HastSet(){
      myBuckets = new ArrayList[SIZE];
      for (int i = 0; i < myBuckets.length; i++) {
          myBuckets[i] = new ArrayList<>();
        }
    }
    // return HastValue
    private int hastFuntion(int key){
       return key % SIZE;
    }
    //
    public void addKey(int key){
        // bam key ra
      int hastValueIndex = hastFuntion(key);
        // tham chieu key toi myBuckets
      //ArrayList<Integer> bucket = myBuckets[hastValueIndex];
       // hastValueIndex  la index trong bucket
        var bucket = myBuckets[hastValueIndex];
        // truyen key vao va tra ve vi tri index
        int keyIndex = bucket.indexOf(key);
        if (keyIndex < 0){
            bucket.add(key);
        }

    }
    public void removeKey(int key){
        int hastValueIndex = hastFuntion(key);
        ArrayList<Integer> bucket = myBuckets[hastValueIndex];
       // var bucket = myBuckets[key];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >= 0){
            bucket.remove(keyIndex);
        }
    }
    public boolean constains(int key){
        int hastValueIndex = hastFuntion(key);
        var bucket = myBuckets[hastValueIndex];
        int keyIndex = bucket.indexOf(key);
//        if (keyIndex >= 0){
//           return true;
//        }
//        return false;
        return keyIndex >=0;
    }

    public static void main(String[] args) {
       HastSet hastSet = new HastSet();
       hastSet.addKey(1);
       hastSet.addKey(2);
       hastSet.addKey(1);
       hastSet.removeKey(1);
       hastSet.constains(2);
    }
}
