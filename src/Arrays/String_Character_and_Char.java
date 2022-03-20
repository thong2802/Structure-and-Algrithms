package Arrays;

public class String_Character_and_Char {
    public static void main(String[] args) {
        String s1 = "Hello Word 1 2 3 4";
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            // if (c >= 48 && c <= 57)
             if (c >= '0' && c <= '9'){
                System.out.print(c+" ");
            }
        }
        char c = 'a';
        System.out.println("\n"+c + " ma ascci of c is : =  "+(byte)c);


        String s2 = "Hello";
        String s3 = "Hello";
        String s4 = new String("Hello");

        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s2 == s4);

        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s2.equals(s4));
    }
}
