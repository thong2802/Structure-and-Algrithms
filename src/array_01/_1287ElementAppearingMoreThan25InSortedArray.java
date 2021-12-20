package array_01;

public class _1287ElementAppearingMoreThan25InSortedArray {
    public static int findSpecialInteger(int[] arr) {
        int count = 1;
        int result = 0;
        int n = arr.length;
        if (n == 1){
            result = arr[0];
            return result;
        }
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1]){
                count ++;
            }else {
                count = 1;
            }
            if (((float)count) > ((float)n * 0.25)){
                result =  arr[i];
                break;
            }
        }
        return result;
    }
    //complexity time 0(n)
    //complexity space 0(1)
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(findSpecialInteger(arr));
    }
}
