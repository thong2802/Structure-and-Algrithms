package String;

public class _1528ShuffleString {
    public static String restoreString(String s, int[] indices) {
        char[] charArr = new char[indices.length];
        for (int i = 0; i < indices.length ; i++) {
            charArr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(charArr);
    }
    public static void main(String[] args) {
        int[] indices = {4,0,2,6,7,3,1,5};
        System.out.println(restoreString( "aaiougrt", indices));
    }
}
