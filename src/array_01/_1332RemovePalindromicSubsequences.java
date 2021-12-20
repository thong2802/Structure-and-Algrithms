package array_01;

public class _1332RemovePalindromicSubsequences {
    public static int removePalindromeSub(String s) {
        int n = s.length();
        int i = 0;
        int j = n -1;
        if (n == 0)
            return 0;
        while (i < j){
            if (s.charAt(i++) != s.charAt(j--)){
                return 2;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        String  s = "ababa";
        System.out.println(removePalindromeSub(s));
    }
}
