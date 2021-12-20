package BitManipulation;

public class _1486XOROperationinanArray {
    public static int xorOperation(int n, int start) {
        int result = start;
        for (int i = 0; i < n; i++) {
            result ^= start + 2 *i;
        }
        return result;
    }
    // compllixity time = 0(n)
    // complixity space = 0(1)

    // soltion
    // nums[i] = start + 2*i
    // n = 5, start = 0
    // i = 0, 0 + 2 * 0 = 0 -> 0000
    // i = 1, 0 + 2 * 1 = 2 -> 0010
    // i = 2, 0 + 2 * 2 = 4 -> 0100
    // i = 3, 0 + 2 * 3 = 6 -> 0110
    // i = 4, 0 + 2 * 4 = 8 -> 1000

    // XOR
    // 0 0 = 0
    // 0 1 = 1
    // 1 0 = 1
    // 1 1 = 0
    public static void main(String[] args) {
        xorOperation(5, 0);
    }
}
