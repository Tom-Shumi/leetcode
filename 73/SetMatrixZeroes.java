class Solution {
  public void setZeroes(int[][] matrix) {
    List<Integer> targetRow = new ArrayList<Integer>();

    for (int i = 0; i < matrix.length; i++) {

      boolean isZero = false;
      for (int j = 0; j < matrix[0].length; j++) {

        if (matrix[i][j] == 0) {
          targetRow.add(j);
          isZero = true;
        }
      }

      if (isZero) {
        for (int j = 0; j < matrix[0].length; j++) {
          matrix[i][j] = 0;
        }
      }
    }

    for (int i = 0; i < targetRow.size(); i++) {
      int row = targetRow.get(i);

      for (int j = 0; j < matrix.length; j++) {
        matrix[j][row] = 0;
      }
    }
  }
}