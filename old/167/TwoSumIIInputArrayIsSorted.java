class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int[] result = new int[2];
    int left = 0;
    int right = numbers.length - 1;

    for (int i = 0; i < numbers.length; i++) {
      int total = numbers[left] + numbers[right];
      if (total == target) {
        result[0] = left + 1;
        result[1] = right + 1;
        return result;
      } else if (total < target) {
        left++;
      } else {
        right--;
      }
    }

    return result;
  }
}