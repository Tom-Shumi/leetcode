class Solution {
  public int removeDuplicates(int[] nums) {
    int dupMaxCount = 2;
    int dupCount = 1;

    int currentNum = nums[0];

    int index = 1;

    for (int i = 1; i < nums.length; i++) {
      if (currentNum < nums[i]) {
        dupCount = 1;
        nums[index] = nums[i];
        index++;
        currentNum = nums[i];
      } else {
        if (dupCount < dupMaxCount) {
          nums[index] = currentNum;
          index++;
        }
        dupCount++;
      }
    }
    return index;
  }
}