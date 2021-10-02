package StackAndQueue;

import java.util.Stack;

public class _7ReverseInteger {
    public static int reverse(int x) {
        boolean Negative = x < 0;
        long result = 0;
        if (Negative == true){
            x = x * -1;
        }
        while( x > 0){
            long r = x % 10;
            x = x / 10;
            result = result * 10 + r;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }
        if (Negative == true){
            result = result * -1;
        }
        return (int) result;
    }

    // complexity time : O(N)
    // complexity space : 0(1)
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
