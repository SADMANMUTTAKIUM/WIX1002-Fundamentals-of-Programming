package com.mycompany.l07q02;

import java.util.Scanner;
import java.net.URL;
import java.io.*;
import java.net.URLConnection;

public class L07Q02 {
    public static void main(String[] args) {
        try {
            URL u = new URL("http://www.fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            PrintWriter out;
            // Write to file
            try (Scanner in = new Scanner(stream)) {
                // Write to file
                out = new PrintWriter("index.htm");
                while (in.hasNextLine()) {
                    out.println(in.nextLine());
                }
            }
            out.close();
            System.out.println("Web page saved to index.htm");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}