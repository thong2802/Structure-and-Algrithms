package array;

import java.util.Arrays;

public class __1317ConvertIntegertotheSumofTwoNoZeroIntegers {
    public static int[] getNoZeroIntegers(int n) {
        int[] array = new int[2];
        if (n <= 10)
            return new int[]{1, n - 1};
        int i = 1;
        int j = n-1;
        while (true){
            if (isNotContraintZero(i) && isNotContraintZero(j)){
                array[0] = i;
                array[1] = j;
                break;
            }
            i++;
            j--;
        }
        return array;
    }

    private static boolean isNotContraintZero(int n) {
        while (n > 10){
            if (n % 10 == 0){
                return false;
            }
            n = n / 10;
        }
        return n != 10;
    }

    // complexit time 0(nlogn)
    // complexit space 0(1)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getNoZeroIntegers(1010)));
    }
}
