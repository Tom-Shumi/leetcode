class Solution {
  public int mySqrt(int x) {
    if (x <= 0)
      return x;
    int low = 1, high = x;
    int mid, sqrt;
    while (low <= high) {
      mid = low + (high - low) / 2;
      sqrt = x / mid;
      if (sqrt == mid) {
        return mid;
      } else if (sqrt < mid) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return high;
  }
}