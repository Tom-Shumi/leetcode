class Solution {
  public int maxArea(int[] height) {
    int result = 0;

    int leftIndex = 0;
    int rightIndex = height.length - 1;
    int widthNum = rightIndex - leftIndex;
    int heightNum = Math.min(height[leftIndex], height[rightIndex]);

    result = widthNum * heightNum;

    for (int i = 0; i < height.length; i++) {
      if (rightIndex <= leftIndex) {
        break;
      }

      if (height[leftIndex] < height[rightIndex]) {
        leftIndex++;
      } else {
        rightIndex--;
      }

      widthNum = rightIndex - leftIndex;
      heightNum = Math.min(height[leftIndex], height[rightIndex]);
      int temp = widthNum * heightNum;

      result = Math.max(result, temp);
    }

    return result;
  }
}