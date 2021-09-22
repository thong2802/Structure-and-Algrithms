package String;

public class _1816TruncateSentence {
    //  solution 1: usr funtion split in java
    public  static String truncateSentence(String s, int k) {
        String[] split = s.split(" ");
       // String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < k; i++) {
          if (i == 0){
             // result += split[i];
              stringBuilder.append(split[i]);
          }else {
             // result += (" " + split[i]);
              stringBuilder.append(" " + split[i]);
          }
        }
        return stringBuilder.toString();
    }


    public  static String truncateSentence1(String s, int k){
        int countSpace = 0;
        s = s + " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                countSpace++;
            }
            if (countSpace == k){
                return s.substring(0, i);
            }
        }
        return "";
    }
    public static void main(String[] args) {
       String s = "Hello how are you Contestant";
        System.out.println(truncateSentence1(s, 4));
    }
}
