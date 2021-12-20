package array_01;

import java.util.Arrays;

public class _1389CreateTargetArrayintheGivenOrder {
    public  static  int[] createTargetArray(int[] nums, int[] index) {
        // Initializing target array
        int[] targetAry = new int[index.length];
        for (int i = 0; i < index.length; i++) {
            if (i > index[i]) {
                // Moving array element at the given index to next index to add new value.
                // Eg: We have added 3 at array index 2. Now we need to add 4 at array index 2. So We need to move previous value 3 to next index of array.
                moveAryElems(targetAry, index[i], i);
            }
            targetAry[index[i]] = nums[i];
        }
        return targetAry;
    }
    public static void moveAryElems(int[] targetAry, int beginIndex, int endIndex) {
        for (int i = endIndex; i > beginIndex; i--) {
            targetAry[i] = targetAry[i - 1];
        }
    }

    //complexitty time 0(N^2)
    //complexitty space 0(N)
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,5};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

}
