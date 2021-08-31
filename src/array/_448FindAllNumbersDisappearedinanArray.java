package array;

import java.util.ArrayList;
import java.util.List;

public class _448FindAllNumbersDisappearedinanArray {

    public static List<Integer> findDisappearedNumbers(int[] a) {
       List<Integer> result = new ArrayList<>();
       for (int i = 0; i <a.length; i++ ){
           int index = Math.abs(a[i]) - 1;
           a[index] = Math.abs(a[index]) * -1;
       }
       for (int index  = 0; index < a.length; index++){
           if (a[index] > 0){
               result.add(index + 1);
           }
       }
       return result;
    }
    public static void main(String[] args) {
        int[] a = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(a));
    }
}
