package Q1_08_Zero_Matrix;

import CTCLLibrary.AssortedMethods;

public class Solution02 {
  public static void setZeroes(int[][] matrix) {
    Boolean isCol = false;
    int R = matrix.length;
    int C = matrix[0].length;

    for (int i = 0; i < R; i++) {
      if (matrix[i][0] == 0) {
        isCol = true;
      }

      for (int j = 1; j < C; j++) {
        if (matrix[i][j] == 0) {
          matrix[0][j] = 0;
          matrix[i][0] = 0;
        }
      }
    }

    for (int i = 1; i < R; i++) {
      for (int j = 1; j < C; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }

    if (matrix[0][0] == 0) {
      for (int j = 0; j < C; j++) {
        matrix[0][j] = 0;
      }
    }

    if (isCol) {
      for (int i = 0; i < R; i++) {
        matrix[i][0] = 0;
      }
    }
  }

  public static void main(String[] args) {
    int nrows = 10;
    int ncols = 15;
    int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -10, 10);

    AssortedMethods.printMatrix(matrix);

    setZeroes(matrix);

    System.out.println();

    AssortedMethods.printMatrix(matrix);
  }
}
