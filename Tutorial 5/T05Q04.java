package com.mycompany.t05q04;
public class T05Q04 {
    public static void main(String[] args){
        
        String[] sentences = {
            "The moon is glowing and the stars are bright",
            "The sun is shining and the weather is nice",
            "the crickets are chirping in the evening",
            "this is the end"
        };
        
        // Variable to store the count of "the"
        int count = 0;
        
        for (String str : sentences){
            // Split the string into words
            String[] words = str.split(" "); 
            
            for (String element: words){
                if (element.equals("the")){
                    count++;
                }
            }
        }
        
        System.out.println("The word 'the' appears " + count + " times.");
    }  
}
