package Set_Matrix_Zeroes_73;

public class Solution {

  public static void printMatrix(int mat[ ][ ])
  {
    int r = mat.length;
    int c = mat[0].length;
    for ( int i = 0; i < r; i++)
    {
      for (int j = 0; j < c; j++)
      {
        System.out.print(mat[i][j]+ " ");
      }
      System.out.println();
    }
  }

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

  public static void main(String[] args)
  {
    int mat[ ][ ] = { {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1},};

    System.out.println("Matrix Initially");
    printMatrix(mat);

    System.out.println("Matrix after modification");
    setZeroes(mat);
    printMatrix(mat);
  }
}
