package com.mycompany.t04q01_c;
public class T04Q01_c {
    public static void main(String[] args){
        
        int rows = 4;
        int columns = 5;
        
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                int element = (int) (Math.random() * 101);
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
