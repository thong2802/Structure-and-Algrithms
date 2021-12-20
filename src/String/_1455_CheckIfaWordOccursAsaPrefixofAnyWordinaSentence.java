package String;

public class _1455_CheckIfaWordOccursAsaPrefixofAnyWordinaSentence {
    public static int isPrefixOfWord(String sentence, String searchWord) {
        int index = 1;
        int j = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' '){
                index ++;
            }
            if (sentence.charAt(i) == searchWord.charAt(j)){
                if (i == 0 || sentence.charAt(i-1) == ' ' || j != 0){
                    j++;
                }
            }else {
                j = 0;
            }
            if (j == searchWord.length()){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String sentence = "abcad";
        String searchWord =  "ad";
        int result =  isPrefixOfWord(sentence, searchWord);
        System.out.println(result);
    }
}
