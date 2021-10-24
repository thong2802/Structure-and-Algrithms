package Sort;

public class MergaSort2 {
    public int[] sort(int[] a1, int[] a2){
        // mang sau khi sap xep co do dai la n = a1.length + a2.length
        int n = a1.length + a2.length;
        int[] result = new int[n];
        // tao 3 con tro i, i1, i2 tro vao result, a1, a2
        int i = 0, i1 = 0, i2 = 0;
        while (i < n){
            if (i1 < a1.length && i2 < a2.length){ // a1 va a2 !=Rong
                if (a1[i1] <= a2[i2]) { //a1 < a2
                    result[i] = a1[i1];
                    i++;
                    i1++;
                }else { // a1 > a2
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }else { // a1 or a2 Rong
                if (i1 < a1.length) { // a1 oke, a2 rong
                    result[i] = a1[i1];
                    i++;
                    i1++;
                }else if (i2 < a2.length) { // a2 oke, a1 rong
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
     return result;
    }
    public int[] mergaSort(int[] a, int L, int R){
        // bai toan co so | DK dung
        if (L > R) {
            return new int[0];
        }
        if (L == R) {
            int[] sigle = {a[L]};
            return sigle;
        }
        // CHIA DE TRI
        // chia ra
        int k = (L + R) / 2;
        int[] a1 = mergaSort(a, L, k); // luu ben trai
        int[] a2 = mergaSort(a, k+1, R); // luu ben phai
        //tron vao
        // TRON a1, a2 la cas mang da duoc sap xep
        int[] result = sort(a1, a2);
        return result;
    }
    public int[] sortArr(int[] a){
        return mergaSort(a, 0, a.length-1);
    }

    public static void main(String[] args) {

    }
}
