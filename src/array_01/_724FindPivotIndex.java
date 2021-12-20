package array_01;

public class _724FindPivotIndex {
    public static int pivotIndex(int[] nums) {
       int left = 0;
       int riht = 0;
        for (int x:nums) {
            riht += x;
        }
        for (int i = 0; i < nums.length; i++) {
            if (left == riht - nums[i]){ // kiểu tra xem tổng left == tổng right - nums[i]
                return i; // return index left == tổng right - nums[i]
            }else {
                left += nums[i]; // leftSum ++;
                riht -= nums[i]; // rightsum --;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int[] num = {1,7,3,6,5,6};
        System.out.println(pivotIndex(num));
    }
}
