package Arrays;

public class _771JewelsandStones {
    public static int numJewelsInStones(String jewels, String stones) {
       int count = 0;
       boolean[] isBest = new boolean[123];
        for (int i = 0; i < jewels.length(); i++) {
            char c = jewels.charAt(i);
            isBest[c] = true;
        }

        for (int i = 0; i < stones.length(); i++) {
            char c = stones.charAt(i);
            if (isBest[c] == true){
                count ++;
            }
        }
       return count;
    }

    public static void main(String[] args) {
         String a = "aA";
         String b = "aAAbbbb";
        System.out.println(numJewelsInStones(a, b));
    }
}
