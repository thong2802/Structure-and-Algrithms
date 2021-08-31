package BitManipulation;

public class _136SingleNumber {
    public static int singleNumber(int[] a) {
      int result = 0;
        for (int ai : a) {
           result ^= ai;
        }
      return result;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
