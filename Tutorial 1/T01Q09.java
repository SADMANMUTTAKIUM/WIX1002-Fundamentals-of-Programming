package com.mycompany.t01q09;

// Import Jsoup library for working with HTML
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document; 

public class T01Q09 {
    public static void main(String[] args) {
        try {
            // Step 1: Fetch the webpage content
            String url = "https://www.um.edu.my"; 
            Document doc = Jsoup.connect(url).get(); 

            // Step 2: Extract visible text and convert to lowercase for case-insensitivity
            String text = doc.body().text().toLowerCase(); 

            // Step 3: Define the keyword to search for
            String keyword = "um".toLowerCase(); // Convert keyword to lowercase

            // Step 4: Count occurrences of the keyword in the text
            int index = 0; 
            int count = 0; 

            // Use a loop to find all occurrences of the keyword in the text
            while ((index = text.indexOf(keyword, index)) != -1) { 
                count++; // Increment count if the keyword is found
                index += keyword.length(); // Move index forward to avoid overlapping matches
            }

            // Step 5: Display the result
            System.out.println("The keyword '" + keyword + "' appears " + count + " times.");
        } catch (IOException e) {
            // Print error details if the connection or parsing fails
            System.err.println("Error fetching or parsing the web page: " + e.getMessage());
        }
    }
}
