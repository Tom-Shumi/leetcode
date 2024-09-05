class Solution {
  public void gameOfLife(int[][] board) {
    List<int[]> list = new ArrayList<>();
    // int[] a = {1, 2, 3};
    // list.add(a);

    for (int i = 0; i < board.length; i++) {

      for (int j = 0; j < board[0].length; j++) {
        int liveCount =
            calcLiveCount(i, j, board.length - 1, board[0].length - 1, board);
      }
    }
  }

  private int calcLiveCount(int i, int j, int maxI, int maxJ, b) {

    if (i == 0) {
      if (j == 0) {
        return b[i][j + 1] + b[i + 1][j] + b[i + 1][j + 1];
      } else if (j == maxJ) {
        return b[i][j - 1] + b[i + 1][j - 1] + b[i + 1][j];
      } else {
        return b[i][j - 1] + b[i][j + 1] + b[i + 1][j - 1] + b[i + 1][j] +
            b[i + 1][j + 1];
      }
    } else if (i == maxI) {
      if (j == 0) {
        return b[i - 1][j] + b[i - 1][j + 1] + b[i][j + 1];
      } else if (j == maxJ) {
        return b[i - 1][j - 1] + b[i - 1][j] + b[i][j - 1];
      } else {
        return b[i - 1][j - 1] + b[i - 1][j] + b[i - 1][j + 1] + b[i][j - 1] +
            b[i][j + 1];
      }
    } else {
      if (j == 0) {
        return b[i - 1][j] + b[i - 1][j + 1] + b[i][j + 1] + b[i + 1][j] +
            b[i + 1][j + 1];
      } else if (j == maxJ) {
        return b[i - 1][j - 1] + b[i - 1][j] + b[i][j - 1] + b[i + 1][j - 1] +
            b[i + 1][j];
      } else {
        return b[i - 1][j - 1] + b[i - 1][j] + b[i - 1][j + 1] + b[i][j - 1] +
            b[i][j + 1] + b[i + 1][j - 1] + b[i + 1][j] + b[i + 1][j + 1];
      }
    }
  }
}