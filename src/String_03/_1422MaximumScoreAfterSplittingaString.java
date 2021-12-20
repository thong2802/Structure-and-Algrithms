package String_03;

public class _1422MaximumScoreAfterSplittingaString {
    // complixity time 0(n)
    // complixity time 0(1)
    public static int maxScore(String s) {
        int reuslt = 0;
        // sum number 1 rigth
        int maxsumRigth = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                maxsumRigth ++;
            }
        }
        // sum0Left
        int sum0Left = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0'){
                sum0Left ++;
            }else if (s.charAt(i) == '1'){
                maxsumRigth --;
            }
            if (sum0Left + maxsumRigth > reuslt){
                reuslt = sum0Left + maxsumRigth;
            }
        }
        return reuslt;
    }
    public static void main(String[] args) {
        String s =  "011101";
        System.out.println(maxScore(s));
    }
}
