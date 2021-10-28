package String;

public class _1446ConsecutiveCharacters {
    public static int maxPower(String s) {
        int count = 1;
        int max = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) { //if same, update count
                count ++;
               // max = Math.max(count, max);
                if (count > max){
                    max = count;
                }
            }else {
                count = 1;
            }
        }
        return max;
    }
    // complixity time 0(n)
    // complixity space 0(1)
    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        int max = maxPower(s);
        System.out.println(max);
    }
}
