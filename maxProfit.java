public class maxProfit {
    public static int maxProfit(int[] prices) {
        int res = 0;
        int n = prices.length;

        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] prices1 = {100, 180, 260, 310, 40, 535, 695};
        int[] prices2 = {4, 2, 2, 2, 4};
        int[] prices3 = {7, 1, 5, 3, 6, 4};

        System.out.println("test1: " + maxProfit(prices1));
        System.out.println("test2: " + maxProfit(prices2));
        System.out.println("test3: " + maxProfit(prices3));
    }
}