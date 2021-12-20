package String_03;

public class _1221SplitaStringinBalancedStrings {
    public static int balancedStringSplit(String s) {
        int count = 0;
        int countOfL = 0;
        int countOfR = 0;
        char[] characterArray = s.toCharArray();
        for (int i = 0; i < characterArray.length ; i++) {
            if (characterArray[i] == 'R'){
                countOfR++;
            }else if (characterArray[i] == 'L'){
                countOfL++;
            }
            if (countOfL == countOfR) {
                count++;
                countOfL = 0;
                countOfR = 0;
            }
        }
      return count;
    }
    public static void main(String[] args) {
        String s =  "RLRRRLLRLL";
        System.out.println( balancedStringSplit(s));
    }
}
