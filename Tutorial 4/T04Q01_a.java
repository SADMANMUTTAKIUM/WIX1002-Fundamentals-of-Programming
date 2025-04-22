package com.mycompany.t04q01_a;
public class T04Q01_a {
   public static void main(String[] args){
       
       int n = 1;
       
       while((Math.pow(n, 3) < 2000)){
           n++;
       }
       // The largest integer is n - 1 because n^3 >= 2000 when exiting the loop
       System.out.print("The largest integer, n = " + (n-1));
   }
}