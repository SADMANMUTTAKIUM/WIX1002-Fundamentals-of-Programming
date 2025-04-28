package com.mycompany.l05q01;
import java.util.Scanner;

public class L05Q01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int N = input.nextInt();
        
        int[] scores = new int[N];
        
        int highestScore = 0;
        int lowestScore = 100;
        int sum = 0;
        
        System.out.print("List of Scores: ");
        for (int i = 0; i < scores.length; i++){
            scores[i] =  (int) (Math.random() * (100 + 1));
            System.out.print(scores[i] + " ");
            
            sum += scores[i];
            
            if (scores [i] > highestScore){
                highestScore = scores[i]; 
            }
            if (scores [i] < lowestScore){
                lowestScore = scores[i];
            }
        }
        double averageScore = (double) sum / N;
        
        System.out.print("\nHighest Score: " + highestScore);
        System.out.print("\nLowest Score: " + lowestScore);
        System.out.printf("\nAverage Score: %.2f", averageScore);
    }
}
