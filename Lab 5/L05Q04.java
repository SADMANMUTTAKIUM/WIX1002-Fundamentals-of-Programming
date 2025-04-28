package com.mycompany.l05q04;
public class L05Q04 {
  public static void main(String[] args){
      
/*
90° Clockwise Transpose → Reverse Rows
90° Counterclockwise Transpose → Reverse Columns
180° Rotation Reverse Rows & Columns
*/

      int[][] matrix = { {1, 5, 7},
                         {3, 6, 9},
                         {5, 3, 8} };
      
//      int[][] matrix = new int[3][3];
//      
//      matrix[0][0] = 1;
//      matrix[0][1] = 5;
//      matrix[0][2] = 7;
//      matrix[1][0] = 3;
//      matrix[1][1] = 6;
//      matrix[1][2] = 9;
//      matrix[2][0] = 5;
//      matrix[2][1] = 3;
//      matrix[2][2] = 8;
      
      // Output: Original Matrix
      System.out.println("A 3 by 3 Matrix: ");
      for (int i = 0; i < 3; i++){
          for (int j = 0; j < 3; j++){
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println(); // Move to next line after printing a row
      }
      
      // Transpose the matrix → Swap matrix[i][j] with matrix[j][i].
      for (int i = 0; i < matrix.length; i++){
          for (int j = i; j < matrix.length; j++){ // Start j from i to avoid double swapping
              int temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp;
          }
      }
      
      // Reverse each row → Swap leftmost and rightmost elements in each row.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0, k = matrix.length - 1; j < k; j++, k--) { // Reverse elements in each row
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
      
      // Output: Reversed Matrix
      System.out.println("After rotates 90 degrees clockwise: ");
      for (int i = 0; i < matrix.length; i++){
          for (int j = 0; j < matrix.length; j++){
              System.out.print(matrix[i][j] + " ");
          }
          System.out.println(); // Move to next line after printing a row
      }  
  }  
}