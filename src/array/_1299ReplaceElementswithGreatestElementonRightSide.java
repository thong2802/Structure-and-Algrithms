package array;
import java.lang.Math;
import java.util.Map;

public class _1299ReplaceElementswithGreatestElementonRightSide {
    public int[] replaceElements(int[] a) {
        int n = a.length;
        for (int i = n-1 ; i >= 0 ; i--) {
              if (i != n-1){
                  a[i] = Math.max(a[i], a[i+1]);
              }
        }
        for (int i = 0; i < n; i++) {
           a[i-1] = a[i];
        }
        if (n > 0){
            a[n-1] = -1;
        }

        return a;
    }



    public static void main(String[] args) {

    }
}
