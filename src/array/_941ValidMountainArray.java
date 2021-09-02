package array;

public class _941ValidMountainArray {
    public static boolean validMountainArray(int[] a) {
        int  n = a.length;
        boolean IsInCreasing = true;
        if (n < 3){
            return false;
        }
        for (int i = 0; (i+1)< n ; i++) {
            int j = i+1; // phan tu phia sau
            if (a[i] > a[j]){ // day giam
                if (IsInCreasing == false){
                    //normal
                }else {
                    if (i == 0){
                        return false;
                    }
                    IsInCreasing = false;
                }
            } else if (a[i] < a[j]){ //day tang
                     if (IsInCreasing == true){
                          // normal
                     }else {
                         return false;
                     }
                 }
            else{
                return false;
            }
        }
        if (IsInCreasing == false) { // day dang xet cuoi cung dang giam
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] a = {0,3,2};
        System.out.println(validMountainArray(a));
    }
}
