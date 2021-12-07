package ICPC;

import java.sql.SQLOutput;

public class ProblemCGoldMiner {
    public static String sortString1(String s, int k) {
        StringBuilder result = new StringBuilder();
        int[] charCounter = new int[26];
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            charCounter[arr[i] - 'a']++;
        }
        while (n > 0){
            //by increasing order
            for (int i = 0; i < 26 ; i++) {
                if (charCounter[i] > 0){
                    result.append((char) ('a' + i));
                    charCounter[i]--;
                    n--;
                }
            }
            //Loop over all character from 'z' to 'a'
           /* for (int i = 26-1; i >= 0 ; i--) {
                if (charCounter[i] > 0){
                    result.append((char) ('a' + i));
                    charCounter[i]--;
                    n--;
                }
            }*/
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = " ebadcac";
        int k = 5;
        System.out.println(sortString1(s, k));
    }
}
