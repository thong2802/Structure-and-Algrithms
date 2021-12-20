package array_01;

import java.util.Arrays;

public class _1460MakeTwoArraysEqualbyReversingSubarrays {
    //Sorting:
    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (target[i] != arr[i]){
                return false;
            }
        }
        return true;
    }

    // xor
    // 0(n)
    // 0(1)
    public static boolean canBeEqual1(int[] target, int[] arr) {
        boolean result = false;
        int sumTarget = 0;
        int sumArr = 0;
        int xorTargetandArry = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTarget += target[i];
            sumArr    += arr[i];
            xorTargetandArry = xorTargetandArry ^ target[i] ^ arr[i];
        }
        result = (sumArr == sumTarget && xorTargetandArry ==0);
        return result;
    }
    //DK1 :  XOR các phần tử = 0
    // 0 0 -> 0
    // 1 0 -> 1
    // 0 1 -> 1
    // 1 1 -> 0

    // 1 ->0001
    // 2 ->0010
    // 3 ->0011
    // 4 ->0100
    // 2 ->0010
    // 4 ->0100
    // 1 ->0001
    // 3 ->0011
    //  _______
    //     0000

    // DK2 : tổng 2 mảng bằng nhau




    public static void main(String[] args) {
       int[] target ={5,5,2,2};
       int[] arr ={6,6,1,1};
        System.out.println(canBeEqual1(target, arr));
    }
}
