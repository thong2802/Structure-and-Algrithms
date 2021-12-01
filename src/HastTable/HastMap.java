package HastTable;

import java.util.ArrayList;
import java.util.Objects;

public class HastMap {
   private class Data{
        int key;
        int value;
        Data(int key, int value){
            this.key = key;
            this.value = value;
        }

        // so sanh key == nhau trong object
        @Override
        public boolean equals(Object other ) {
           if (other instanceof Data){
              return this.key == ((Data)other).key;
           }
           return false;
        }
    }
    private  final int SIZE = 1000;
    private ArrayList<Data> myBucket[];

     public HastMap(){
        myBucket = new ArrayList[SIZE];
        for (int i = 0; i < myBucket.length; i++) {
            myBucket[i] = new ArrayList<>();
        }
    }
    public int HastFuntion(int key){
        return key % SIZE;
    }
    public void put(int key, int value){
        int hastValueIndex = HastFuntion(key);
        var bucket = myBucket[hastValueIndex];
       //Data newData = new Data(key, value);
       Data newData = new Data(key, value);
       int keyIndex = bucket.indexOf(newData);
       if (keyIndex >= 0){
           bucket.get(keyIndex).value = value;
       }else {
           bucket.add(newData);
       }
    }

    public void remove(int key){
        int hastValueIndex = HastFuntion(key);
        var bucket = myBucket[hastValueIndex];
        //Data newData = new Data(key, value);
        Data deleteData = new Data(key, 0);
       // int keyIndex = bucket.indexOf(deleteData);
        bucket.remove(deleteData);

    }
    public int get(int key){
         int hastValueIndex = HastFuntion(key);
         var bucket = myBucket[hastValueIndex];
        //Data newData = new Data(key, value);
         Data findData = new Data(key, 0);
        int keyIndex = bucket.indexOf(findData);
        if (keyIndex >= 0){
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
