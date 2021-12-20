package array_01;

import java.util.Arrays;

public class _1475inalPricesWithaSpecialDiscountinaShop {
    public  static int[] finalPrices(int[] prices) {
        int n = prices.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = i+1; j < n; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
      return prices;
    }

    // complixity time O(n^2)
    // Complixity space O(1)

    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3};
        System.out.printf(Arrays.toString(finalPrices(prices)));
    }
}


