class Solution {
  public int jump(int[] nums) {
    int[] dp = new int[nums.length];
    if (nums.length == 1) {
      return 0;
    }

    for (int i = 0; i < nums.length; i++) {
      dp[i] = Integer.MAX_VALUE;
    }

    dp[0] = 0;
    for (int i = 0; i < nums.length; i++) {
      int canStep = nums[i];

      for (int j = 1; j <= canStep; j++) {
        if (nums.length - 1 == i + j) {
          return dp[i] + 1;
        }

        if (dp[i] + 1 < dp[i + j]) {
          dp[i + j] = dp[i] + 1;
        }
      }
    }

    return dp[nums.length - 1];
  }
}