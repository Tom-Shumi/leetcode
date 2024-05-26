class Solution {
  public boolean canJump(int[] nums) {
    if (nums.length == 1) {
      return true;
    }
    int[] dp = new int[nums.length];
    dp[0] = nums[0];

    for (int i = 1; i < nums.length; i++) {
      if (dp[i - 1] == 0) {
        return false;
      }
      int canStep = dp[i - 1] - 1;
      if (nums[i] < canStep) {
        dp[i] = canStep;
      } else {
        dp[i] = nums[i];
      }
    }
    return dp[nums.length - 2] != 0;
  }
}