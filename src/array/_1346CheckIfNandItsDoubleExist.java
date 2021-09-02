package array;

public class _1346CheckIfNandItsDoubleExist {
    public static boolean checkIfExist(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n-1; j++) {
                 if (a[i] == 2*a[j] || a[j] == 2*a[i]){
                     return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
      int[] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }
}
