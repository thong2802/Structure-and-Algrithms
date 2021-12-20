package array_01;

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

    // cach khac
    public int findNumbers1(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(String.valueOf(nums[i]).length() % 2 == 0){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       int[] nums = {12,345,2,6,7896};
        System.out.println( findNumbers(nums));
    }
}
