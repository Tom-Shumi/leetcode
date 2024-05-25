class Solution {
  public int maxProfit(int[] prices) {
    int[] dp = new int[prices.length];

    int hold = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < hold) {
        hold = prices[i];
        dp[i] = dp[i - 1];
      } else {
        dp[i] = dp[i - 1] + (prices[i] - hold);
        hold = prices[i];
      }
    }
    return dp[prices.length - 1];
  }
}