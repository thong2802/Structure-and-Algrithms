package array;

public class BinaryGap {
    public int solution(int N){
        if (N == 0){
            return 0;
        }
        //hàm này dùng để convert từ decime => binary
        String bString = Integer.toBinaryString(N);
        // or String bString = Integer.toString(N, 2);
        boolean started = false;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < bString.length(); i++) {
            String c = bString.substring(i, i + 1);
            if (c.equals("1")){
                if (started){
                    if (count > maxCount){
                        maxCount = count;
                    }
                }
                count = 0;
                started = true;
            }
            if (c.equals("0")){
                count ++;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        BinaryGap bg = new BinaryGap();
        System.out.println(bg.solution( 1234567));
    }
}
