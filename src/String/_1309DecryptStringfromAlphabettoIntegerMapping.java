package String;

public class _1309DecryptStringfromAlphabettoIntegerMapping {
    public static String freqAlphabets(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n;) {
            if (i < n -2 && s.charAt(i+2) == '#'){
                int num = Integer.parseInt(s.substring(i, i + 2));
                result.append((char) (num + 96));
                i = i + 3;
                continue;
            }
            result.append((char) (97 + s.charAt(i) - '1'));
            i++;
        }
        return result.toString();
    }
    // complexity time 0 (N)
    // complexity space 0 (N)
    public static void main(String[] args) {
            String  s = "10#11#12";
        System.out.println(freqAlphabets(s));

    }
}
