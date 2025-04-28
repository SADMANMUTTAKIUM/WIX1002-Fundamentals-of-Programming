package com.mycompany.l05q06;
import java.util.Scanner;

public class L05Q06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int rows = input.nextInt();
        
        // Declare a square matrix (rows × rows)
        int[][] pascalTri = new int[rows][rows];
    /*     
        0  0  0  0  0  0  
        0  0  0  0  0  0  
        0  0  0  0  0  0  
        0  0  0  0  0  0  
        0  0  0  0  0  0  
        0  0  0  0  0  0  
    */
        
        // Generate Pascal’s Triangle
        for (int i = 0; i < pascalTri.length; i++){ // Rows
            for (int j = 0; j <= i; j++){ // Column (upto the current row)
                if (j == 0 || j == i){ // Set the first column (j == 0) and diagonal (j == i) to 1
                    /*
                        1  0  0  0  0  0 
                        1  1  0  0  0  0
                        1  0  1  0  0  0  
                        1  0  0  1  0  0  
                        1  0  0  0  1  0  
                        1  0  0  0  0  1  
                    */
                    pascalTri[i][j] = 1; // First and last elements in each row are always 1
                } else {
                    pascalTri[i][j] = pascalTri[i - 1][j - 1] + pascalTri[i - 1][j]; // Sum of above two values
                    /*
                        1  0  0  0  0  0  
                        1  1  0  0  0  0  
                        1  2  1  0  0  0  
                        1  3  3  1  0  0  
                        1  4  6  4  1  0  
                        1  5 10 10  5  1  
                    */
                }
            }
        }
        
        // Print Pascal's Triangle in (lower triangle) square matrix format
        System.out.println("\nThe Pascal Triangle with " + rows + " row(s):");
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < rows; j++){
                if (j <= i) {
                    System.out.printf("%4d", pascalTri[i][j]);
                } else {
                    System.out.printf("%4d", 0);  // Print 0 for upper triangle
                }
            }
            System.out.println();
        }        
    } 
}
