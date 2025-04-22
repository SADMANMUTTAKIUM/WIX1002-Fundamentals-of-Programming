package com.mycompany.t04q03;
public class T04Q03 {
    public static void main(String[] args){
       
        int f1 = 1, f2 = 1;
        int n = 10;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++){
            System.out.print(f1 + " ");
            int fn = f1 + f2;
            f1 = f2;
            f2 = fn;
     
        /*
        int f1 = 0, f2 = 1;
        int n = 10;
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++){
            System.out.print(f1 + " ");
            int fn = f1 + f2;
            f1 = f2;
            f2 = fn;
         */
        }
    }  
}