package array;

public class _121BestTimetoBuyandSellStock {
    // complixity time : o(n2)
    // complixity space : 0(1)
    public static int maxProfit1(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i +1 ; j <  prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return  maxProfit;
    }

    // solution 2:
    // complixity time : o(n)
    // complixity space : 0(1)
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i = 0;
        int j = 1;
        while (j < prices.length){
            if (prices[j] - prices[i] < 0){
                i = j;
            }else {
                maxProfit = Math.max(maxProfit,prices[j] - prices[i]);
            }
            j ++;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
       int[] prices = {7,1,5,3,6,4};
        System.out.printf(String.valueOf(maxProfit(prices)));
    }
}
