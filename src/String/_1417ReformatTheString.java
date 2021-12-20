package String;

public class _1417ReformatTheString {
    public static String reformat(String s) {
        StringBuilder digit = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        String result = new String();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                digit.append(s.charAt(i));
            }else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                letter.append(s.charAt(i));
            }
        }
        if (letter.length() - digit.length() >= 2 || letter.length() - digit.length() <= -2){
            return "";
        }
        int min = digit.length();
        if (letter.length() < digit.length()){
            min = letter.length();
        }
        for (int i = 0; i < min; i++) {
            result += digit.charAt(i);
            result += letter.charAt(i);
        }
        if (letter.length() > digit.length()){
            result = letter.charAt(min) + result;
        }
        if (letter.length() < digit.length()){
            result = result + digit.charAt(min);
        }
        return result;
    }

    // Complixity time O(n)
    // Complixity space O(n)
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reformat(s));
    }
}
