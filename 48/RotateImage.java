class Solution {
  public void rotate(int[][] matrix) {
    int[][] temp = new int[matrix.length][matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      temp[i] = matrix[i].clone();
    }

    int currentRow = matrix.length - 1;

    for (int i = 0; i < matrix.length; i++) {

      for (int j = 0; j < matrix.length; j++) {
        matrix[j][currentRow] = temp[i][j];
      }
      currentRow--;
    }
  }
}