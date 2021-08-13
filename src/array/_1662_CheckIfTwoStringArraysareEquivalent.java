package array;

public class _1662_CheckIfTwoStringArraysareEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String result1 = "";
        for (String s1 : word1) {
            result1 += s1;
        }
        String result2 = "";
        for (String s2: word2) {
           result2 += s2;
        }

        return result1.equals(result2);
    }
    public static boolean arrayStringsAreEqual1(String[] word1, String[] word2){
        StringBuilder S1 = new StringBuilder();
        StringBuilder S2 = new StringBuilder();
        for (String a: word1) {
            S1.append(a);
        }
        for (String b: word2) {
            S2.append(b);
        }
        return S1.toString().equals(S2.toString()) ? true : false;
    }

    public static void main(String[] args) {
       String[] word1 = {"ab", "c"};
       String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual1(word1, word2));
    }
}
