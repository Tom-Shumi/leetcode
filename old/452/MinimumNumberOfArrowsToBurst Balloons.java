class Solution {
  public int findMinArrowShots(int[][] points) {

    Arrays.sort(points, (p1, p2) -> {
      if (p1[0] != p2[0]) {
        return Integer.compare(p1[0], p2[0]);
      } else {
        return Integer.compare(p1[1], p2[1]);
      }
    });

    int rangeStart = points[0][0];
    int rangeEnd = points[0][1];

    int result = 1;

    for (int i = 1; i < points.length; i++) {

      if (rangeEnd < points[i][0]) {
        result++;
        rangeStart = points[i][0];
        rangeEnd = points[i][1];
        continue;
      }

      if (points[i][1] <= rangeEnd) {
        rangeEnd = points[i][1];
      }
    }

    return result;
  }
}