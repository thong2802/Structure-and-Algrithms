package array_01;

import java.util.ArrayList;
import java.util.List;

public class _1431KidsWiththeGreatestNumberofCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        // tim max in arr candies
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max){
                result.add(true);
            }else {
                result.add(false);
            }
           // max = candies[i] + extraCandies;
        }
        return result;
    }

    // complixity time 0(n)
    // complixity space 0(n)

    public static void main(String[] args) {
       int[] candies = {4,2,1,1,2};
        System.out.println(kidsWithCandies(candies, 1));
    }
}
