package com.mycompany.t05q02;
public class T05Q02 {
   public static void main(String[] args) {
       // a
       String[] code = {"AAA", "AAB", "AAC", "AAD"};
       
       // b
       int[] num = new int[10];    
       int sum = 0;                
       for(int k = 0; k < num.length; k++) {  
           sum += num[k];          
       }
       
       // c
       int[][] t = new int[3][3];  
       t[1][2] = 5;
       
       // d
       int i = 3;                  
       int[] score = new int[5];   
       score[1] = 78;
       score[++i] = 100;          
   }
}