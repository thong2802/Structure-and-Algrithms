package array;

public class _1523CountOddNumbersinanIntervalRange {

    // solution 1: start low + 1 => dem so le tu low toi high
    // 0(n) time
    // 0(1) space
    public static int countOdds(int low, int high) {
        int count = 0;
        for (int i = low; i <= high ; i++) {
            if (low % 2 != 0){
                count ++;
            }
            low ++;
        }
        return count;
    }


    // cach 2: tinh so phan tu cua no
    // 3-4-5-6-7 | = 5 phan tu => ct = 7-3+1 = 5
    // so phan tu cua no la so chan
    // 3-4-5-6 | 4 phan tu  = 4 / 2 = 2 phan tu le
    // so phan tu la so le
    //   3-4-5-6-7 | 5 pt : 5 / 2 = 2 + 1 pt le
    //  2-3-4-5-6  | 5 pt : 5 / 2 = 2
    public static int countOdds1(int low, int high) {
        int result = 0;
        int soPhanTuTrongDay = high - low + 1;
        result = soPhanTuTrongDay / 2;
        if (result % 2 == 1 && high % 2 == 1){
            result += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        countOdds1(3, 7);
        System.out.printf("done");
    }
}
