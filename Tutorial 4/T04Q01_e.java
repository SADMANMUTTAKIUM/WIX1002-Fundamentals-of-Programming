package com.mycompany.t04q01_e;
public class T04Q01_e {
    public static void main(String[] args){
        
        double sum = 0;
        
        for (int i = 1, j = 25; i <= 25 && j >= 1; i++, j--){
                 sum += (double)i / j;
        }
        System.out.printf("Sum of the series, 1/25+2/24+3/23...+ 25/1 = %.2f", sum);
    }
}