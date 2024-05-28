class Solution {
  public int hIndex(int[] citations) {

    int result = 1;
    int count = 0;
    for (int i = 0; i < citations.length; i++) {

      count = 0;

      for (int j = 0; j < citations.length; j++) {
        if (result <= citations[j]) {
          count++;
        }
      }

      if (count < result) {
        break;
      }
      result++;
    }
    return --result;
  }
}