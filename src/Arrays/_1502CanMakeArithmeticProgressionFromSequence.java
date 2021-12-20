package Arrays;

public class _1502CanMakeArithmeticProgressionFromSequence {
    // solution 1: sort arr
    // tim cong sai d: công thức tính cấp số cộng = U n+1 = Un + d. với d là công sai
    // ví dụ dãy : 1-3-5-7-9-11-13-15...
    // 3 = 1 + d. với d là công sai sẽ là 2.
    // complixity time : 0(n)
    // complixity space : 0(n)
    public static boolean canMakeArithmeticProgression(int[] arr) {
      //  Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isSort = true;
            for (int j = 0; j < n- i -1; j++) {
                if (arr[j] > arr[j+1]) {
                    isSort = false;
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
            if (isSort){
                break;
            }
        }
        //
        if (arr.length <= 1){
            return false;
        }
        int buocnhay = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            int buocnhaymoi = arr[i] - arr[i-1];
            if (buocnhaymoi != buocnhay){
                return false;
            }
//            if (arr[i] - arr[i-1] == sum){
//
//            }else {
//                return false;
//            }
        }
      return true;
    }


    //solution 2:
    public static boolean canMakeArithmeticProgression1(int[] arr){

        return false;
    }


    public static void main(String[] args) {
       int[] arr = {3,5,2};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}
