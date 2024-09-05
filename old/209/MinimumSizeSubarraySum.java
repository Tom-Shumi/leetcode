class Solution {
  public int minSubArrayLen(int target, int[] nums) {

    int result = Integer.MAX_VALUE;
    int sum = nums[0];
    int cnt = 1;
    int index = 1;
    for (int i = 0; i < nums.length; i++) {
      if (target <= sum) {
        result = result = Math.min(result, cnt);
        sum = sum - nums[i];
        index = i + cnt;
        cnt = cnt - 1;
        continue;
      }

      for (int j = index; j < nums.length; j++) {
        sum = sum + nums[j];
        cnt++;
        if (target <= sum) {
          result = Math.min(result, cnt);
          break;
        }
      }
      sum = sum - nums[i];
      index = i + cnt;
      cnt = cnt - 1;
    }

    return result == Integer.MAX_VALUE ? 0 : result;
  }
}