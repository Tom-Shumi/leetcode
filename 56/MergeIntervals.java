class Solution {
  public int[][] merge(int[][] intervals) {
    List<int[]> result = new ArrayList<>();

    Sort[] sort = new Sort[intervals.length];

    for (int i = 0; i < sort.length; i++) {
      sort[i] = new Sort(intervals[i][0], intervals[i][1]);
    }

    Arrays.sort(sort);
    int start = sort[0].start;
    int end = sort[0].end;

    for (int i = 1; i < sort.length; i++) {
      if (start <= sort[i].start && sort[i].start <= end) {
        end = Math.max(sort[i].end, end);
      } else if (sort[i].start <= start && start <= sort[i].end &&
                 sort[i].end <= end) {
        start = Math.min(sort[i].start, start);
      } else if (sort[i].start <= start && end <= sort[i].end) {
        start = sort[i].start;
        end = sort[i].end;
      } else if (end <= sort[i].start) {
        int[] range = {start, end};
        result.add(range);

        start = sort[i].start;
        end = sort[i].end;
      }
    }

    int[] range = {start, end};
    result.add(range);

    return result.toArray(new int[result.size()][]);
  }

  public static class Sort implements Comparable<Sort> {
    int start, end;

    public Sort(int start, int end) {
      this.start = start;
      this.end = end;
    }

    public int compareTo(Sort num) {
      // 第一要素の値が同じ場合に、第二要素で昇順にソートする処理
      if (this.start == num.start) {
        return this.end - num.end;
      } else {
        return this.start - num.start;
      }
    }
  }
}