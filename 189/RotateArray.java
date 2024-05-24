class Solution {
  public void rotate(int[] nums, int k) {
    if (nums.length == 1) {
      return;
    }

    if (nums.length < k) {
      k = k % nums.length;
    }

    int[] left = new int[k];
    int kPointer = k;
    for (int i = 0; i < k; i++) {
      left[i] = nums[nums.length - kPointer];
      kPointer--;
    }

    int[] right = new int[nums.length - k];
    for (int i = 0; i < nums.length - k; i++) {
      right[i] = nums[i];
    }

    int leftPointer = 0;
    int rightPointer = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i < k) {
        nums[i] = left[leftPointer];
        leftPointer++;
      } else {
        nums[i] = right[rightPointer];
        rightPointer++;
      }
    }
  }
}