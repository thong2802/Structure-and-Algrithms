package Recursion;

public class _344ReverseString {
    public static void swap(char[] s, int i, int j){
      // dieu kien dung
        if(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            swap(s, i +1, j-1);
        }
    }
    public void reverseString(char[] s) {
    swap(s, 0, s.length -1);
    }

    public static void main(String[] args) {
        char[] s = {'l','e','e','t','c','o','d','e'};
        swap(s, 0, s.length -1);
    }
}
