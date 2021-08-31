package array;

public class  _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        // create avaible count
        int count = 0;
        for (int num:nums) {
            // check số lương chỗ số của a
            // nếu số lượng chắn -> % 2 = 0 => count ++;
            if (soLuongChuSo(num) % 2 == 0) {
                count ++;
            }
        }
     return count;
    }

    public static int soLuongChuSo(int num) {
        int count = 0;
        int kq = num;
        while( kq != 0) {
            kq = num / 10;
            num = kq;
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
       int[] nums = {12,345,2,6,7896};
        System.out.println( findNumbers(nums));
    }
}
