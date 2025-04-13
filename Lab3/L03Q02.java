package com.mycompany.l03q02;
public class L03Q02 {
    public static void main(String[] args){
        
        int integer = (int) (0 + (Math.random() * (5 + 0 - 1)));
        
        String word;
        
        switch (integer){
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            default:
                word = "Invalid syntax.";
                break;
        }
        System.out.println(integer + " is " + word);
    }
}