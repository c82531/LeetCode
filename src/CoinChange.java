import java.util.Arrays;

public class CoinChange {
    public static int coinChange(int[] coins, int amount){
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i = 1; i < amount+1; i++){
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                int prev = i - coins[j];
                if (prev >= 0 && dp[prev] >= 0){
                    min = Math.min(min, dp[prev]+1);
                }
            }
            if (min == Integer.MAX_VALUE){
                dp[i] = -1;
            }else {
                dp[i] = min;
            }
        }
        return dp[amount];
    }

    public static int coinChangeII(int[] coins, int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE/2);
        dp[0] = 0;
        for (int coin : coins) {
            for (int j = coin; j < amount + 1; j++) {
                dp[j] = Math.min(dp[j], dp[j-coin] + 1);
            }
        }
        return dp[amount] == Integer.MAX_VALUE/2?-1: dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        System.out.println(coinChangeII(coins, amount));
    }
}
