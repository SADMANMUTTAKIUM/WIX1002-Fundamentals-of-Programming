package com.mycompany.t05q01;
public class T05Q01 {
    public static void main(String[] args){
        
        // a
        float[] array_a = new float[12];
        
        System.out.print("a. ");
        for (float e : array_a){
            System.out.print(e + " ");
        }
        
        // b
        char[] array_b = {'A', 'B', 'C', 'D', 'E'};
        
        System.out.print("\nb. ");
        for (char e : array_b){
            System.out.print(e + " ");
        }
        
        // c
        String[] names = new String[100];
        
        System.out.print("\nc. ");
        for (String e : names){
            System.out.print(e + " ");
        }
        
        // d
        int[][] table = new int[6][2];
        
        /*
        System.out.print("\nd. ");\
        for (int i = 0; i < table.length; i++){
            for (int j = 0; j < table.length; j++){
                System.out.print(table[i][j] + " ");
            }
        }
        */
        
        System.out.println("\nd. ");
        for (int[] row : table){
            for (int e : row){
                System.out.print(e + " ");
            }
            System.out.println();
        }
        
        // e
        int[][] array_e = {{6, 9}, {2, 5}, {4, 6}};
        
        /*
        int[][] array_e = new int[3][2];
        array_e[0][0] = 6;
        array_e[0][1] = 9;
        array_e[1][0] = 2;
        array_e[1][1] = 5;
        array_e[2][0] = 4;
        array_e[2][1] = 6;
        */
        
        System.out.println("d. ");
        for (int[] row : array_e){
            for (int e : row){
                System.out.print(e + " ");
            }
            System.out.println();
        }
        
        // f
        array_e[1][1] = 4;
        array_e[2][0] = 3;
        array_e[2][1] = 7;
        
        System.out.println("d. ");
        for (int[] row : array_e){
            for (int e : row){
                System.out.print(e + " ");
            }
            System.out.println();
        }
        
        // g
        
        String[] contact = {"Sadman", "Muttaki", "UM", "CSE"};
        
        System.out.println("g. ");
        for (String e : contact){
            System.out.println(e);
        }
        
    }  
}

