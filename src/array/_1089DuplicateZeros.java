package array;

public class _1089DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
             if (arr[i] == 0){
                 // dich arr[i+1] sang arr[n-2] sang phai mot don vi
                 for (int j = n-2; j >= i+1 ; j--) {
                      arr[j+1] = arr[j];
                 }
                 // gan arr[i+1] = 0;
                 // truong hop i ở cuối cùng = 0 thì phải có đk dừng, nếu không bị quá bộ nhớ
                 if (i + 1 < n) {
                     arr[i + 1] = 0;
                     i++;
                 }
             }
        }
    }
    public static void main(String[] args) {
         int[] arr = {1,0,2,3,0,0,5,0};
         duplicateZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
