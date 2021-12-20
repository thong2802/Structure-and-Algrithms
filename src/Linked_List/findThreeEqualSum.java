package Linked_List;

import java.util.ArrayList;
import java.util.List;

public class findThreeEqualSum {
    public static boolean findSum(List<Integer> list, int k){
        for (int a : list) {
            for (int b: list) {
                for (int c: list) {
                    if ((a + b + c == k)){
                        System.out.println(a + " " + b + " " + c);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(15);
        list.add(3);
        list.add(9);
        System.out.println(findSum(list, 13));
    }
}
