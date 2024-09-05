class Solution {
  public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int middle = nums.length / 2;
    while (true) {
      if (right < left) {
        break;
      }

      if (nums[middle] == target) {
        return middle;
      } else if (nums[middle] < target) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }

      middle = left + (right - left) / 2;
    }
    return middle;
  }
}