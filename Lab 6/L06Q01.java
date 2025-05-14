package com.mycompany.l06q01;
public class L06Q01 {
    public static void main(String[] args){
        System.out.println("The first 20 triangular numbers are: ");
        for (int i = 1; i <= 20; i++){
            System.out.println("T(" + i + ") = " + getTriNumbers(i));
        }
    }
    
    public static int getTriNumbers(int n){
        return (n * (n + 1)) / 2;
    }
}