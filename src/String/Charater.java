package String;

public class Charater {
    public static void main(String[] args) {
        String s = "Hello World! 1234";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
           if (Character.isUpperCase(c) == true) {
               System.out.println(c);
           }
        }
    }
}
