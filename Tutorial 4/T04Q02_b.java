package com.mycompany.t04q02_b;
public class T04Q02_b {
    public static void main(String[] args){
        int x = 0, y = 0;
        do{
           x += 2;
           y += x;
        } while (x < 100);
        System.out.println(x + " and " + y);
    }
}
