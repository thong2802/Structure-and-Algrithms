package array_01;

import java.util.ArrayList;
import java.util.List;

public class _448FindAllNumbersDisappearedinanArray {
    // cách 1 : không dùng thêm bộ nhớ
    public static List<Integer> findDisappearedNumbers(int[] a) {
       List<Integer> result = new ArrayList<>();
       for (int i = 0; i <a.length; i++ ){
           int index = Math.abs(a[i]) -1 ;
           a[index] = Math.abs(a[index]) * -1;
       }
       for (int index  = 0; index < a.length; index++){
           if (a[index] > 0){
               result.add(index +1);
           }
       }
       return result;
    }

    // cách 2 :dùng thêm bộ nhớ
    public static List<Integer> findDisappearedNumbers1(int[] a) {
        List<Integer> result = new ArrayList<>();
        boolean[] exist = new boolean[a.length +1];
        for (int i = 0; i < a.length; i++) {
            exist[a[i]] = true;
        }
        for (int i = 1; i < a.length ; i++) {
            if (exist[i] == false){
                result.add(i);
            }
        }
        return  result;
    }
    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(a));
    }
}
