class Solution {
  public int[][] insert(int[][] intervals, int[] newInterval) {
    List<int[]> result = new ArrayList<>();

    if (intervals.length == 0) {
      result.add(new int[] {newInterval[0], newInterval[1]});
      return result.toArray(new int[result.size()][]);
    }

    int index = 0;
    for (int i = index; i < intervals.length; i++) {
      if (intervals[i][1] < newInterval[0]) {
        result.add(intervals[i]);
      } else {
        break;
      }
      index++;
    }

    for (int i = index; i < intervals.length; i++) {
      if (intervals[i][0] <= newInterval[1]) {
        newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
        newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
      } else {
        break;
      }
      index++;
    }
    result.add(newInterval);

    for (int i = index; i < intervals.length; i++) {
      result.add(intervals[i]);
    }

    return result.toArray(new int[result.size()][]);
  }
}