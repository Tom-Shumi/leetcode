class Solution {
  public int[] twoSum(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      int difference = target - nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        if (difference == nums[j]) {
          int[] output = {i, j};
          return output;
        }
      }
    }
    int[] output = {0, 1};
    return output;
  }
}