class Solution {
  public int maxProfit(int[] prices) {

    int[] dp = new int[prices.length];
    for (int i = 0; i < prices.length; i++) {
      dp[i] = 0;
    }

    int buy = prices[0];
    for (int i = 1; i < prices.length; i++) {
      int profit = prices[i] - buy;
      if (dp[i - 1] < profit) {
        dp[i] = profit;
      } else {
        dp[i] = dp[i - 1];
      }

      if (buy > prices[i]) {
        buy = prices[i];
      }
    }
    return dp[prices.length - 1];
  }
}