class Solution {
  public int longestConsecutive(int[] nums) {
    if (nums.length <= 1) {
      return nums.length;
    }

    int result = 1;
    int temp = 1;

    Arrays.sort(nums);
    for (int i = 1; i < nums.length; i++) {

      if (nums[i - 1] + 1 == nums[i]) {
        temp++;
      } else if (nums[i - 1] == nums[i]) {
        continue;
      } else {
        result = Math.max(result, temp);
        temp = 1;
      }
    }

    return Math.max(result, temp);
  }
}