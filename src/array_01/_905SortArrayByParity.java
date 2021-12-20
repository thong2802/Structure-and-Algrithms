package array_01;

public class _905SortArrayByParity {
    public int[] sortArrayByParity(int[] a) {
        int n = a.length;
        // cho i dau mang = le, j cuoi mang bang chan, so sanh i va j chuyen chan ra dau mang
        int j = n -1;
        int i = 0;
        while (i < j){
            if (a[i] % 2 != 0){ // a[i] la so le,
                // xu li.
                if (a[j] % 2 == 0){
                    int tem = a[j];
                    a[j] = a[i];
                    a[i] = tem;
                    i++;
                    j--;
                }else {
                    j--;
                }
            }else {
                i++;
            }
        }
       return a;
    }

    public static void main(String[] args) {

    }
}
