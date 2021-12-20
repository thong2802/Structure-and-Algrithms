package Arrays;

public class _1672RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int a = accounts.length;
        int b = accounts[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a; i++) {
            int sum = 0;
            for (int j = 0; j < b; j++) {
                 sum +=accounts[i][j];
            }
         max = Math.max(sum, max);
        }
       return max;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,2}};
        System.out.println(maximumWealth(accounts));
     }
}
