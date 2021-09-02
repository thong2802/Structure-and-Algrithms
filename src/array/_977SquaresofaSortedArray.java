package array;

import java.util.Arrays;

public class _977SquaresofaSortedArray {
    public static int[] sortedSquares(int[] nums) {
        // sap xep
        // tim i va j
        // cho i = -1 de nam ngoai mang
        // la so am cuoi cung trong day
        int i = -1;
        int n = nums.length;
        while ((i + 1) < n && nums[i+1] < 0){
            i++;
        }
        // cho j = n la gia tri khong am ben trai cuoi cung cua mang
        int j = n;
        while ((j-1) >= 0 && nums[j] >= 0){
            j--;
        }
        int k = 0;
        //sap xep va binh phuong
        while (i >= 0 || j < n){
            if (i>= 0 && j < n){ //ca hai cung hop le
                // binh phuong va so sanh de sap xep
                int ii = nums[i] * nums[i];
                int jj = nums[j]* nums[i];
                if (ii <= jj){
                    nums[k] = ii;
                    k++;
                    i--;
                }else {
                    nums[k] = jj;
                    k++;
                    j++;
                }

            }else if (i>=0){ // only i valid va j > n
                 nums[k] = nums[i] * nums[i];
                 k++;
                 i--;
            }else {
                // only j valid va j < 0
                nums[k] = nums[j] * nums[j];
                j++;
                k++;
            }
        }

       // System.out.println("i = " + i + "j= "+ j);
        return nums;
    }
    public static void main(String[] args) {
          int[]  nums = {-4,-1,0,3,10};
          sortedSquares(nums);
        System.out.println(Arrays.toString(nums));
    }
}
