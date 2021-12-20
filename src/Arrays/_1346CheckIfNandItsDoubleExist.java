package Arrays;

import java.util.HashMap;
import java.util.Map;

public class _1346CheckIfNandItsDoubleExist {
    public static boolean checkIfExist(int[] a) {
      int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n ; j++) {
                if (a[i] == 2*a[j] || a[j] == 2*a[i]){
                    return true;
                }
            }
        }
      return false;
    }

    // complexity time 0(n^2)
    // complexity space 0(1)



    // use map
    // MAP : CHECKMAP
    // key : value of element in array | 10     2
    // value : true / false              true   true

    // debug
    // 10 2 5  3
    // arr[i] = 10 => 10 * 2 -> khong co | 10 / 2 -> khong co
    // arr[i] = 2 => 2 * 2 -> khong co | 2 / 2 -> khong co
    // arr[i] = 5 => 5 * 2 -> co 10  -> true => ket truc chuong trinh

    public static boolean checkIfExist1(int[] a) {
        Map<Integer, Boolean> checkMap = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (checkMap.containsKey(a[i] * 2) || (a[i] % 2 == 0 && checkMap.containsKey(a[i] / 2))){
                return true;
            }else {
                checkMap.put(a[i], true);
            }
        }
        return false;
    }
    // complexity time 0(n)
    // complexity space 0(n)
    public static void main(String[] args) {
      int[] arr = {3,1,7,14};
        System.out.println(checkIfExist1(arr));
    }
}
