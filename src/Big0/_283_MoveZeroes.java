package Big0;

public class _283_MoveZeroes {

    // dung 2 con tro, do phuc tap 0(1) vi khong phu thuoc vao input dau vao
    public static void moveZeroes(int[] a) {
        int n = a.length;
        int indexCount = 0;
        for(int i = 0; i < n; i++){
            if(a[i] != 0){
                a[indexCount] = a[i];
                indexCount ++;
            }
        }
        for(;indexCount<n; indexCount++){
            a[indexCount] = 0;
        }
    }
    // chen vao mot mang moi do phuc tap 0(n)
    public static void moveZeroes1(int[] a){
        int n = a.length;
        int[] T = new int[n];
        int iT = 0;
        for (int i = 0; i <  n; i++) {
            if (a[i] != 0){
                a[iT] = a[i];
                iT ++;
            }
        }
        for (;iT < n; iT++) {
            a[iT] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes1(nums);
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
