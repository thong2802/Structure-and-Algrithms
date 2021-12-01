package array;

import java.util.Arrays;

public class _977SquaresofaSortedArray {
    public static int[] sortedSquares(int[] nums) {
        // sap xep
        // tim i va j
        // cho i = -1 de nam ngoai mang
        // la so am cuoi cung trong day
        int n = nums.length;
        int[] result = new int[n];
        int i = -1;
        while ((i + 1) < n && nums[i+1] < 0){
            i++;
        }
        // cho j = n la gia tri khong am ben trai cuoi cung cua mang
        int j = n;
        while ((j-1) >= 0 && nums[j-1] >= 0){
            j--;
        }

      //  System.out.println(i + " " + j);
        int k = 0;
        //sap xep va binh phuong
        while (i >= 0 || j < n){
            if (i>= 0 && j < n){ //ca hai cung hop le
                // binh phuong va so sanh de sap xep
                int ii = nums[i] * nums[i];
                int jj = nums[j] * nums[j];
                if (ii <= jj){
                    result[k] = ii;
                    k++;
                    i--;
                }else {
                    result[k] = jj;
                    k++;
                    j++;
                }

            }
            else if (i>=0){ // only i valid va j > n
                result[k] = nums[i] * nums[i];
                 k++;
                 i--;
            }else {
                // only j valid va j < 0
                result[k] = nums[j] * nums[j];
                j++;
                k++;
            }
        }

       // System.out.println("i = " + i + "j= "+ j);
        return result;
    }
    //complexity time 0(n)
    //complexity space 0(n)
    public static void main(String[] args) {
          int[]  nums = {-4,-1,0,3,10};
         int[] kq =  sortedSquares(nums);
        System.out.println(Arrays.toString(kq));
    }
}
