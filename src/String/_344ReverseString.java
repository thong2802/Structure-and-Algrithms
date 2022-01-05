package String;

import java.util.Arrays;

public class _344ReverseString {
    public static void swap(char[] s, int i, int j) {
        int n = s.length;
        while (i <= j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            swap(s, i+1, j-1);
        }
    }
    public static void reverseString(char[] s){
        swap(s, 0, s.length - 1);
    }


    public static void main(String[] args) {
      char[]  s = {'h','e','l','l','o'};
       reverseString(s);
        System.out.println("j");
    }
}
