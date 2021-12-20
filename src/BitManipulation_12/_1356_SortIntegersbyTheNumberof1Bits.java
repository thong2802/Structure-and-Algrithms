package BitManipulation_12;

import java.util.Arrays;

public class _1356_SortIntegersbyTheNumberof1Bits {
    public static int[] sortByBits(int[] arr) {
            int countBitForA;
            int countBitForB;
            int k = 0;


            return arr;
        }
        public static int countBit1(int n){
            int count = 0;
            String bits = Integer.toBinaryString(n);
            for (int i = 0; i < bits.length(); i++) {
                String c = bits.substring(i, i + 1);
                if (c.equals("1")){
                    count++;
                }
            }
            return count;
        }

public static int[] sortByBits1(int[] arr) {
    int n=arr.length;
    for(int i=0;i<n;i++) {
        arr[i] += 10001 * Integer.bitCount(arr[i]);
        Arrays.sort(arr);
    }
    for(int i=0;i<n;i++) {
        arr[i] = arr[i] % 10001;
    }
    return arr;
}


    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
}
