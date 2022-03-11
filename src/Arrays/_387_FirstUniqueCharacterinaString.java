package Arrays;

public class _387_FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s) {
       int c = s.length();
       for(char i = 'a'; i <= 'z'; i++) {
           int index = s.indexOf(i);
           if (index != -1 && index == s.lastIndexOf(i)) {
               c = Math.min(c, index);
           }
       }
      return c == s.length() ? -1 : c;
    }
    public static int firstUniqChar1(String s){
        char[] c = s.toCharArray();
        int[] count = new int[123];
        for (int i = 0; i < c.length; i++) {
           // System.out.println((int)c[i]);
            char d = c[i];
            int index = (int)d;
            count[index]++;
        }
        for (int i = 0; i < c.length; i++) {
            char d = c[i];
            int index = (int)d;
            if (count[index] == 1){
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar2(String s) {
        char[] c = s.toCharArray();
        int[] count = new int[123];
        for (int i = 0; i < c.length; i++) {
            System.out.println((int)c[i]);
            char d = c[i];
            int index = (int)d;
            count[index]++;
        }
        for (int i = 0; i < c.length; i++) {
            char d = c[i];
            int index = (int)d;
            if (count[index] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar2(s));
    }
}
