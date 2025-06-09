public class Stock2 {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int i = 0;
        while (i < prices.length) {
            int j = i;
            int cost = prices[j];
            int price = prices[j++];
            while (j < prices.length && prices[j] >= price){
                price = prices[j++];
            }
            profit += price - cost;
            i = j;
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
