package BitManipulation;

public class _268MissingNumber {
    public static int missingNumber(int[] nums) {
       int result = 0;
        for (int ai :nums) {
            result ^= ai;
        }
        for (int i = 0; i <= nums.length; i++) {
            result ^= i;
        }
       return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
