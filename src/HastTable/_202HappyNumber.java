package HastTable;

import java.util.HashSet;
import java.util.Set;

// solution:
/*
- tính số các chữ số.
- ví dụ : 123
=> 123 % 10 = 3
=> 123 / 10 = 12
----------------
=>12 % 10 = 2
=>12 / 10 = 1
-----------------
=> 1 % 10 = 1
=> 1 / 10 = 0 dung lai
=> ket qua thu duc 1 2 3
 */
public class _202HappyNumber {
    public static int nextNumber(int n){
       int sum = 0;
       while (n != 0){
           int k = n % 10;
           sum +=(k*k);
           n = n / 10;
       }
       return sum;
    }

    public static boolean isHappy(int n) {
        Set<Integer> daGap = new HashSet<>();
        while (daGap.contains(n) == false){
          if (n == 1) {
              return true;
          }
          daGap.add(n);
          n = nextNumber(n);
          //kiem tra xem n co bi trung lap khong
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
