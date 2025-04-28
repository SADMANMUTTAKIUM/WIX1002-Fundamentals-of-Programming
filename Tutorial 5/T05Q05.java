package com.mycompany.t05q05;
public class T05Q05 {
    public static void main(String[] args){
        
        String[] sentence = {"I am a student of UM"};
        
        // Loop through the array in reverse order
        for (int i = sentence.length - 1; i >= 0; i--){
            String str = sentence[i];
            
            // Reverse the string and print
            for (int j = str.length() - 1; j >= 0; j--){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}