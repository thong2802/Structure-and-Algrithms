package array;

import java.util.Arrays;

public class _1304FindNUniqueIntegersSumuptoZero {
    public static int[] sumZero(int n) {
        int[] result = new int[n];
        if(n%2 == 1) result[n/2] = 0;
        int num = 1;
        for (int i = 0; i < n/2; i++) {
            result[i] = num;
            result[n-i-1] = num * -1;
            num++;
            }
        return result;
    }

    // complexity time O(n)
    // complexity space O(N)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
}
